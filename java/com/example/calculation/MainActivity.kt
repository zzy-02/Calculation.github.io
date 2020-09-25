package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClickListener()
    }
    //  监听
    private fun initClickListener(){

        text_clear.setOnClickListener { view->onClick(view) }
        text_back.setOnClickListener { view->onClick(view) }
        text_divide.setOnClickListener {view->onClick(view) }
        text_multiply.setOnClickListener { view->onClick(view) }
        text_minus.setOnClickListener { view->onClick(view) }
        text_add.setOnClickListener { view->onClick(view) }
        text_equal.setOnClickListener { view->onClick(view) }
        text_percent.setOnClickListener { view->onClick(view) }
        text_dot.setOnClickListener { view->onClick(view) }

        text1.setOnClickListener {view->onClick(view)  }
        text2.setOnClickListener {view->onClick(view)  }
        text3.setOnClickListener {view->onClick(view)  }
        text4.setOnClickListener {view->onClick(view)  }
        text5.setOnClickListener {view->onClick(view)  }
        text6.setOnClickListener {view->onClick(view)  }
        text7.setOnClickListener {view->onClick(view)  }
        text8.setOnClickListener {view->onClick(view)  }
        text9.setOnClickListener {view->onClick(view)  }
        text0.setOnClickListener {view->onClick(view)  }
    }
    private fun onClick(view: View){
        var shouldAppend = false  //  用于判断所点击的按键是否显示
        when(view) {
            //  清除按键，结果归零
            text_clear -> {
                texthistory.text = ""
                textresult.text = "0"
            }

            //  退回键，移除最后一个字符
            text_back -> onBackSpaceClick()

            //  等于  计算结果 并显示
            text_equal -> onEquelClick()
            //  加减乘除运算
            text_add,
            text_minus,
            text_multiply,
            text_divide -> shouldAppend = onOperatorClick(view as TextView)  //  强制转换

            //  百分号
            text_percent -> shouldAppend = onPercentClick()

            //  点
            text_dot -> shouldAppend = onDotClick()

            //  数字
            else -> {
                shouldAppend = true
            }

        }
        if (shouldAppend) {
            val input = (view as TextView).text
            val result = textresult.text
            if(isCleared() && input !="."){                //  判断是否是输入的第一个数
                textresult.text = input
            } else{
                textresult.text = result.toString().plus(input)  //  拼接
            }
        }
    }

    private fun onBackSpaceClick(){
        if(isCleared()){
            return
        }
        textresult.text = with(textresult.text) {
            when {
                length == 1 -> "0"
                ',' == get(length - 1) ->substring(0,length-2)
                //  此处特别提醒逗号使用单引号为字符，双引号为字符串
                else -> substring(0,length-1)
            }
        }
    }

    private fun onOperatorClick(view: TextView) : Boolean{
        //  减号要考虑负号的问题
        if (isCleared() && view.text != "-"){
            return false
        }
        //  当以+-*/.结尾的时候返回false
        if(textresult.text.toString().matches(Regex(".*[-+/*.]"))){  //  正则表达式
            return false
        }
        return true
    }

    private fun onPercentClick(): Boolean{
        if(isCleared()){
            return false
        }
        return textresult.text.toString().matches(Regex(".*[0-9]$"))  //  正则表达式以0-9结尾
    }

    private fun onDotClick() : Boolean{
        return textresult.text.toString().matches(Regex(".*[0-9]$"))
    }

    private fun isCleared():Boolean{
        return "0" == textresult.text || textresult.text.isEmpty()
    }


    private fun onEquelClick(){
        if(isCleared()){
            return
        }
        //  若点击等于以后，表达式的结尾出现+-*/.则出现提示信息表达式错误
        if(Regex("[-+/*.]").matches(textresult.text.last().toString())){
            Toast.makeText(this, "Expression error!",Toast.LENGTH_SHORT).show()
            return
        }
        texthistory.text = textresult.text.toString().plus("=")
        var expression = textresult.text.toString()
                .replace("%","/100")
                .replace("-","+-")   //  所有的减法运算都转换成加法运算
                .replace(",","").let {
                    if (it.startsWith("+")) it.substring(1,it.length) else it   //  针对第一个数是负数
                }
        expression = runMutiplyAndDivide(expression) //  先乘除
        expression = runAdd(expression)              //后加减

        textresult.text = formatResult(expression)  //  格式化
        //textresult.text = expression

    }

    private fun runMutiplyAndDivide(expression:String) : String{
        return runCalculation(expression,"-?(\\d+)(\\.?\\d*)[*/]-?(\\d+)(\\.?\\d*)")  //  正则表达式

    }
    private fun runAdd(expression:String) : String{
        return runCalculation(expression,"-?(\\d+)(\\.?\\d*)\\+-?(\\d+)(\\.?\\d*)")

    }
    private fun runCalculation(expression:String,pattern:String) : String{
        var newExpression = expression
        var temp = Regex(pattern).find(newExpression)   //  找出第一个需要计算的单一的表达式
        while (temp != null){
            newExpression = newExpression.replace(temp.value, runsingleCalculation(temp.value))
            temp = Regex(pattern).find(newExpression)
        }
        return newExpression

    }
    private fun runsingleCalculation(singleCalculation:String) : String{
        var singleResult = 0.0
        when{
            singleCalculation.matches(Regex("-?(\\d+)(\\.?\\d*)\\+-?(\\d+)(\\.?\\d*)")) ->{
                singleResult = singleCalculation.let {
                    val numList = it.split("+")
                    numList[0].toDouble() + numList[1].toDouble()
                }
            }
            singleCalculation.matches(Regex("-?(\\d+)(\\.?\\d*)\\*-?(\\d+)(\\.?\\d*)")) ->{
                singleResult = singleCalculation.let {
                    val numList = it.split("*")
                    numList[0].toDouble() * numList[1].toDouble()
                }
            }
            singleCalculation.matches(Regex("-?(\\d+)(\\.?\\d*)/-?(\\d+)(\\.?\\d*)")) ->{
                singleResult = singleCalculation.let {
                    val numList = it.split("/")
                    numList[0].toDouble() / numList[1].toDouble()
                }
            }
        }
        return singleResult.toString()
    }
    //  结果格式化
    private fun formatResult(result:String) : String{
        val numberFormat = NumberFormat.getInstance(Locale.getDefault()).apply {
            maximumFractionDigits = 16    //  16表示小数点后的位数
        }
        return numberFormat.format(result.toDouble()).toString()
    }
}
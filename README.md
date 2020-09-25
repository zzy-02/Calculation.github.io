# Calculation.github.io
1. activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
    <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/white"
    tools:context=".MainActivity">

    <!--辅助线，不显示 但是元素可以依赖它摆放正确位置-->
    <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline30"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:orientation="horizontal"
        app:layout_constraintGuide_percent="0.3"/>
    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:background="#dedede"
        app:layout_constraintTop_toTopOf="parent"
        android:padding="20dp"
        android:fillViewport="true"
        app:layout_constraintBottom_toTopOf="@+id/guideline30">
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:gravity="bottom">


            <TextView
                android:id="@+id/texthistory"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="end"
                android:textColor="#888888"
                android:textSize="28sp" />

            <TextView
                android:id="@+id/textresult"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:gravity="end"
                android:text="@string/text0"
                android:textColor="@android:color/black"
                android:textSize="40sp"/>
        </LinearLayout>
    </ScrollView>
    <View
        android:id="@+id/horizontal_divide44"
        android:layout_width="match_parent"
        android:layout_height="1px"
        android:background="#dedede"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintVertical_bias="0.44"/>

    <View
        android:id="@+id/horizontal_divide58"
        android:layout_width="match_parent"
        android:layout_height="1px"
        android:background="#dedede"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintVertical_bias="0.58"/>
    <View
        android:id="@+id/horizontal_divide72"
        android:layout_width="match_parent"
        android:layout_height="1px"
        android:background="#dedede"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintVertical_bias="0.72"/>
    <View
        android:id="@+id/horizontal_divide86"
        android:layout_width="match_parent"
        android:layout_height="1px"
        android:background="#dedede"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintVertical_bias="0.86"/>
    <View
        android:id="@+id/horizontal_divide100"
        android:layout_width="match_parent"
        android:layout_height="1px"
        android:background="#dedede"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"/>

    <View
        android:id="@+id/vertical_divide25"
        android:layout_width="1px"
        android:layout_height="0dp"
        android:background="#dedede"
        app:layout_constraintTop_toBottomOf="@+id/guideline30"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.25"/>
    <View
        android:id="@+id/vertical_divide50"
        android:layout_width="1px"
        android:layout_height="0dp"
        android:background="#dedede"
        app:layout_constraintTop_toBottomOf="@+id/guideline30"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.50"/>
    <View
        android:id="@+id/vertical_divide75"
        android:layout_width="1px"
        android:layout_height="0dp"
        android:background="#dedede"
        app:layout_constraintTop_toBottomOf="@+id/guideline30"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.75"/>

    <TextView
        android:id="@+id/text_clear"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_clear"
        android:textColor="@android:color/holo_orange_dark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/guideline30"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide44"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide25" />
    <TextView
        android:id="@+id/text_back"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_back"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/guideline30"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide44"
        app:layout_constraintStart_toStartOf="@id/vertical_divide25"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide50" />
    <TextView
        android:id="@+id/text_divide"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_divide"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/guideline30"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide44"
        app:layout_constraintStart_toStartOf="@id/vertical_divide50"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide75" />
    <TextView
        android:id="@+id/text_multiply"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_multiply"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/guideline30"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide44"
        app:layout_constraintStart_toStartOf="@id/vertical_divide75"
        app:layout_constraintEnd_toEndOf="parent"  />
    <TextView
        android:id="@+id/text7"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text7"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide44"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide58"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide25" />
    <TextView
        android:id="@+id/text8"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text8"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide44"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide58"
        app:layout_constraintStart_toStartOf="@id/vertical_divide25"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide50" />
    <TextView
        android:id="@+id/text9"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text9"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide44"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide58"
        app:layout_constraintStart_toStartOf="@id/vertical_divide50"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide75" />
    <TextView
        android:id="@+id/text_minus"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_minus"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide44"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide58"
        app:layout_constraintStart_toStartOf="@id/vertical_divide75"
        app:layout_constraintEnd_toEndOf="parent"  />
    <TextView
        android:id="@+id/text4"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text4"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide58"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide72"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide25" />
    <TextView
        android:id="@+id/text5"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text5"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide58"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide72"
        app:layout_constraintStart_toStartOf="@id/vertical_divide25"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide50" />
    <TextView
        android:id="@+id/text6"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text6"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide58"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide72"
        app:layout_constraintStart_toStartOf="@id/vertical_divide50"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide75" />
    <TextView
        android:id="@+id/text_add"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_add"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide58"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide72"
        app:layout_constraintStart_toStartOf="@id/vertical_divide75"
        app:layout_constraintEnd_toEndOf="parent"  />
    <TextView
        android:id="@+id/text1"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text1"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide72"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide86"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide25" />
    <TextView
        android:id="@+id/text2"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text2"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide72"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide86"
        app:layout_constraintStart_toStartOf="@id/vertical_divide25"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide50" />
    <TextView
        android:id="@+id/text3"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text3"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide72"
        app:layout_constraintBottom_toTopOf="@id/horizontal_divide86"
        app:layout_constraintStart_toStartOf="@id/vertical_divide50"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide75" />
    <TextView
        style="@style/ButtomTheme"
        android:id="@+id/text_equal"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:text="@string/text_equle"
        android:textColor="@android:color/holo_orange_dark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide72"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="@id/vertical_divide75"
        app:layout_constraintEnd_toEndOf="parent"  />
    <TextView
        android:id="@+id/text_percent"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_percent"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide86"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide25" />
    <TextView
        android:id="@+id/text0"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text0"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide86"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="@id/vertical_divide25"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide50" />
    <TextView
        android:id="@+id/text_dot"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:clickable="true"
        android:focusable="true"
        android:background="@drawable/text_background"
        android:text="@string/text_dot"
        android:textColor="@color/colorPrimaryDark"
        android:gravity="center"
        android:textSize="32sp"
        app:layout_constraintTop_toBottomOf="@id/horizontal_divide86"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="@id/vertical_divide50"
        app:layout_constraintEnd_toStartOf="@id/vertical_divide75" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
2. MainActivity.kt
```
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
```
部分字符串，颜色，风格的设置
1. strings.xml
```
<resources>
    <string name="app_name">Calculation</string>
    <string name="text0">0</string>
    <string name="text1">1</string>
    <string name="text2">2</string>
    <string name="text3">3</string>
    <string name="text4">4</string>
    <string name="text5">5</string>
    <string name="text6">6</string>
    <string name="text7">7</string>
    <string name="text8">8</string>
    <string name="text9">9</string>
    <string name="text_clear">CE</string>
    <string name="text_back">BACK</string>
    <string name="text_add">+</string>
    <string name="text_minus">-</string>
    <string name="text_multiply">*</string>
    <string name="text_divide">/</string>
    <string name="text_equle">=</string>
    <string name="text_percent">%</string>
    <string name="text_dot">.</string>
</resources>
```
2. styles.xml
```
<resources>
    <!-- Base application theme. -->
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>
    <style name="ButtomTheme">
        <item name="android:clickable">true</item>
        <item name="android:focusable">true</item>
        <item name="android:background">@drawable/text_background</item>
    </style>

</resources>
```
3. colors.xml
```
<?xml version="1.0" encoding="utf-8"?>
    <resources>
        <color name="colorPrimary">#6200EE</color>
        <color name="colorPrimaryDark">#3700B3</color>
        <color name="colorAccent">#03DAC5</color>
    </resources>
 ```
4.text_background.xml
```
    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
        <item android:drawable="@android:color/darker_gray" android:state_pressed="true"/>

    </selector>
 ```

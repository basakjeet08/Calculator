package com.basakjeet08.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startingOfProgram()
    }
    private fun startingOfProgram(){
        var isLastOperator = true
        val tvInput : TextView = findViewById(R.id.tvInput)
        val btnZero : Button = findViewById(R.id.btnZero)
        val btnOne : Button = findViewById(R.id.btnOne)
        val btnTwo : Button = findViewById(R.id.btnTwo)
        val btnThree : Button = findViewById(R.id.btnThree)
        val btnFour : Button = findViewById(R.id.btnFour)
        val btnFive : Button = findViewById(R.id.btnFive)
        val btnSix : Button = findViewById(R.id.btnSix)
        val btnSeven : Button = findViewById(R.id.btnSeven)
        val btnEight : Button = findViewById(R.id.btnEight)
        val btnNine : Button = findViewById(R.id.btnNine)
        val btnAdd : Button = findViewById(R.id.btnAdd)
        val btnSubtract : Button = findViewById(R.id.btnSubtract)
        val btnMultiply : Button = findViewById(R.id.btnMultiply)
        val btnDivide : Button = findViewById(R.id.btnDivide)
        val btnEquals : Button = findViewById(R.id.btnEquals)
        val btnClear : Button = findViewById(R.id.btnClear)

        btnZero.setOnClickListener {
            tvInput.text = if(checkZero(tvInput)) "0" else "${tvInput.text}0"
            isLastOperator = false
        }
        btnOne.setOnClickListener {
            tvInput.text = if(checkZero(tvInput)) "1" else "${tvInput.text}1"
            isLastOperator = false
        }
        btnTwo.setOnClickListener {
            tvInput.text = if(checkZero(tvInput)) "2" else "${tvInput.text}2"
            isLastOperator = false
        }
        btnThree.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "3" else "${tvInput.text}3"
            isLastOperator = false
        }
        btnFour.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "4" else "${tvInput.text}4"
            isLastOperator = false
        }
        btnFive.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "5" else "${tvInput.text}5"
            isLastOperator = false
        }
        btnSix.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "6" else "${tvInput.text}6"
            isLastOperator = false
        }
        btnSeven.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "7" else "${tvInput.text}7"
            isLastOperator = false
        }
        btnEight.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "8" else "${tvInput.text}8"
            isLastOperator = false
        }
        btnNine.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "9" else "${tvInput.text}9"
            isLastOperator = false
        }








        btnAdd.setOnClickListener{
            if(!isLastOperator){
                tvInput.text = if(checkZero(tvInput)) "0" else "${tvInput.text}+"
                isLastOperator = true
            }
            else{
                var temp = "${tvInput.text}"
                temp = "${temp.substring(0,(temp.length-1))}-"
                tvInput.text = temp
            }
        }


        btnSubtract.setOnClickListener{
            if(!isLastOperator){
                tvInput.text = if(checkZero(tvInput)) "0" else "${tvInput.text}-"
                isLastOperator = true
            }
            else{
                var temp = "${tvInput.text}"
                temp = "${temp.substring(0,(temp.length-1))}-"
                tvInput.text = temp
            }
        }


        btnMultiply.setOnClickListener{
            if(!isLastOperator){
                tvInput.text = if(checkZero(tvInput)) "0" else "${tvInput.text}*"
                isLastOperator = true
            }
            else{
                var temp = "${tvInput.text}"
                temp = "${temp.substring(0,(temp.length-1))}*"
                tvInput.text = temp
            }
        }


        btnDivide.setOnClickListener {
            if(!isLastOperator){
                tvInput.text = if(checkZero(tvInput)) "0" else "${tvInput.text}/"
                isLastOperator = true
            }
            else{
                var temp = "${tvInput.text}"
                temp = "${temp.substring(0,(temp.length-1))}/"
                tvInput.text = temp
            }
        }






        btnEquals.setOnClickListener {
            val input = "${tvInput.text}"
            val output = operations(input)
            tvInput.text = "$output"
        }

        btnClear.setOnClickListener{
            tvInput.text = "0"
        }
    }
    private fun checkZero(tvInput:TextView) : Boolean{
        if(tvInput.text == "0")
            return true
        return false
    }
    private fun operations(input:String):Double{
        var num1 = 0.0
        var num2 = 0.0
        var prevOperator = ' '
        for(i in input){
            if(i == '+' || i == '-' || i == '*' || i == '/'){
                num2 = calculate(prevOperator , num1 , num2)
                prevOperator = i
                num1 = 0.0
            }
            else{
                num1 = num1*10 + (i-'0')
            }
        }
        num2 = calculate(prevOperator , num1 , num2)
        return num2
    }
    private fun calculate(operator : Char , num1:Double , num2:Double) : Double{
        var output= 0.0
        when(operator){
            ' ' -> output = num1
            '+' -> output = num1 + num2
            '-' -> output = num1 - num2
            '*' -> output = num1 * num2
            '/' -> output = num2 / num1
        }
        return output
    }
}
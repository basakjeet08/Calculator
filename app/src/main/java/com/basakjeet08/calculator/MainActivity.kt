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
        }
        btnOne.setOnClickListener {
            tvInput.text = if(checkZero(tvInput)) "1" else "${tvInput.text}1"
        }
        btnTwo.setOnClickListener {
            tvInput.text = if(checkZero(tvInput)) "2" else "${tvInput.text}2"
        }
        btnThree.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "3" else "${tvInput.text}3"
        }
        btnFour.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "4" else "${tvInput.text}4"
        }
        btnFive.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "5" else "${tvInput.text}5"
        }
        btnSix.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "6" else "${tvInput.text}6"
        }
        btnSeven.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "7" else "${tvInput.text}7"
        }
        btnEight.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "8" else "${tvInput.text}8"
        }
        btnNine.setOnClickListener{
            tvInput.text = if(checkZero(tvInput)) "9" else "${tvInput.text}9"
        }
        btnAdd.setOnClickListener{
            tvInput.text = "${tvInput.text}\n"
        }
    }
    private fun checkZero(tvInput:TextView) : Boolean{
        if(tvInput.text == "0")
            return true
        return false
    }
    private fun additionNumber() : Int{

        return 0
    }
}
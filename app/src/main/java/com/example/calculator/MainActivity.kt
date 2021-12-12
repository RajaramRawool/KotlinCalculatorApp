package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var etNumber1: EditText? = null
    var etNumber2: EditText? = null
    var tvOperator: TextView? = null
    var tvResult : TextView? = null
    var bt0: Button? = null
    var bt1: Button? = null
    var bt2: Button? = null
    var bt3: Button? = null
    var bt4: Button? = null
    var bt5: Button? = null
    var bt6: Button? = null
    var bt7: Button? = null
    var bt8: Button? = null
    var bt9: Button? = null
    var btDot: Button? = null
    var btPlus: Button? = null
    var btMinus: Button? = null
    var btMultipy: Button? = null
    var btDivide: Button? = null
    var btEqual : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViews()
        tvOperator?.setText("+")
        setListeners()

    }
    fun buttonClicked(button: Int) {
        if(etNumber1!!.isFocused) {
            etNumber1?.append(button.toString())
        } else {
            etNumber2?.append(button.toString())
        }
    }

    private fun setListeners() {
        bt0?.setOnClickListener {
            buttonClicked(0)
        }
        bt1?.setOnClickListener {
            buttonClicked(1)
        }
        bt2?.setOnClickListener {
            buttonClicked(2)
        }
        bt3?.setOnClickListener {
            buttonClicked(3)
        }
        bt4?.setOnClickListener {
            buttonClicked(4)
        }
        bt5?.setOnClickListener {
            buttonClicked(5)
        }
        bt6?.setOnClickListener {
            buttonClicked(6)
        }
        bt7?.setOnClickListener {
            buttonClicked(7)
        }
        bt8?.setOnClickListener {
            buttonClicked(8)
        }
        bt9?.setOnClickListener {
            buttonClicked(9)
        }
        btDot?.setOnClickListener {
            if(etNumber1!!.isFocused) {
                etNumber1?.append(".")
            } else {
                etNumber2?.append(".")
            }
        }
        btPlus?.setOnClickListener {
            tvOperator?.setText("+")
        }
        btMinus?.setOnClickListener {
            tvOperator?.setText("-")
        }
        btDivide?.setOnClickListener {
            tvOperator?.setText("/")
        }
        btMultipy?.setOnClickListener {
            tvOperator?.setText("*")
        }
        btEqual?.setOnClickListener {
//            etNumber1?.append("=")
        }


    }





    private fun setViews() {
        etNumber1 = findViewById(R.id.et_number1)
        etNumber2 = findViewById(R.id.et_number2)
        tvOperator = findViewById(R.id.tv_operator)
        tvResult = findViewById(R.id.tv_result)
        bt0 = findViewById(R.id.bt_0)
        bt1 = findViewById(R.id.bt_1)
        bt2 = findViewById(R.id.bt_2)
        bt3 = findViewById(R.id.bt_3)
        bt4 = findViewById(R.id.bt_4)
        bt5 = findViewById(R.id.bt_5)
        bt6 = findViewById(R.id.bt_6)
        bt7 = findViewById(R.id.bt_7)
        bt8 = findViewById(R.id.bt_8)
        bt9 = findViewById(R.id.bt_9)
        btDot = findViewById(R.id.bt_dot)
        btPlus = findViewById(R.id.bt_plus)
        btMinus = findViewById(R.id.bt_minus)
        btMultipy = findViewById(R.id.bt_multiply)
        btDivide = findViewById(R.id.bt_divide)
        btEqual = findViewById(R.id.bt_equal)
    }

}
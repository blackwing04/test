package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rbMenu = findViewById<RadioGroup>(R.id.rgMenu)
        val btCheck = findViewById<Button>(R.id.btCheck)
        val etCount = findViewById<EditText>(R.id.etCount)
        val tvBill = findViewById<TextView>(R.id.tvBill)
        var bill : Int
        btCheck.setOnClickListener {
            when(rbMenu.checkedRadioButtonId){
                R.id.btCheck ->{
                     bill  = 120 * etCount.text.toString().toInt()
                }
                R.id.rbPig ->{
                    bill  = 110 * etCount.text.toString().toInt()
                }
                else ->{
                     bill  = 120 * etCount.text.toString().toInt()
                }
            }
            tvBill.text=getString(R.string.total) + bill.toString() + getString(R.string.dollar)
        }
    }
}
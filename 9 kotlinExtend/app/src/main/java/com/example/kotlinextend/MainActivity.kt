package com.example.kotlinextend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.kotlinextend.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val myButton: Button = findViewById(R.id.my_button)
//        myButton.text = "A button"

        binding.calculateButton.setOnClickListener {
            calculateTip()
        }
    }

    private fun calculateTip() {
        // lấy giá trị của người dùng nhập vào\
        val stringInTextField = binding.costOfServiceEdit.text.toString()

        // chuyển đổi kiểu dữ liệu
        val cost : Double? = stringInTextField.toDoubleOrNull()

        if(cost == null || cost == 0.0){
            displayTip(0.0)
            return
        }


        // lấy phần trăm boa
        val selectedId = binding.radioGroup.checkedRadioButtonId

        val tipPercentage  = when(selectedId){
            R.id.option_twenty_percent -> 0.20
            R.id.option_fifteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        // kiểm tra switch
        if (binding.roundUpSwitch.isChecked){
            tip = kotlin.math.ceil(tip)
        }


        displayTip(tip)
    }

    private fun displayTip(tip : Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}
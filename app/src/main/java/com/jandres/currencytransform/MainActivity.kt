package com.jandres.currencytransform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jandres.currencytransform.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        setCustomSpinner()

        mainBinding.swapImageView.setOnClickListener {
            var position1: Int = mainBinding.spinner.selectedItemPosition
            mainBinding.spinner.setSelection(mainBinding.spinner2.selectedItemPosition)
            mainBinding.spinner2.setSelection(position1)
        }

        mainBinding.resultButton.setOnClickListener {
            val currencyObject: Currency = Currency
            val position1: Int = mainBinding.spinner.selectedItemPosition
            val position2: Int = mainBinding.spinner2.selectedItemPosition

            var value : String = mainBinding.valueTextInput.text.toString()

            var value1: Float = currencyObject.values[position1].toFloat()
            var value2: Float = currencyObject.values.get(position2).toFloat()

            var result: Float = (value.toFloat()*value2)/value1


            mainBinding.resultVarTextView.setText(result.toString())
        }


    }

    private fun setCustomSpinner() {
        val adapter = CurrencyArrayAdapter(this, Currency.list!!)
        mainBinding.spinner.adapter = adapter
        mainBinding.spinner2.adapter = adapter
    }


}


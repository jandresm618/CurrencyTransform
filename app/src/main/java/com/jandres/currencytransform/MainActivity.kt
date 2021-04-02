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



    }

    private fun setCustomSpinner() {
        val adapter = CurrencyArrayAdapter(this, Currency.list!!)
        mainBinding.spinner.adapter = adapter
        mainBinding.spinner2.adapter = adapter
    }


}
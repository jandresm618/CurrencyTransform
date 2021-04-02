package com.jandres.currencytransform

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class CurrencyArrayAdapter(context: Context,currencyList: List<Currencys> ) : ArrayAdapter<Currencys>(context, 0,currencyList){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position,convertView,parent) }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position,convertView,parent) }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup) : View {

        val currency = getItem(position)

        val view = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent,false)

        var image : ImageView = view.findViewById<ImageView>(R.id.currencyImageView)
        var text : TextView = view.findViewById<TextView>(R.id.currencyNameTextView)


        image.setImageResource(currency!!.image)
        text.setText(currency.name)

        return view }

}
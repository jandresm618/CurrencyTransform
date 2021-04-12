package com.jandres.currencytransform

data class Currencys(val image: Int,val name: String)

object Currency {
    val values = doubleArrayOf(
            3661.69,
            1.0,
            0.85,
            6.56,
            76.43
    )

    private val images = intArrayOf(
            R.drawable.cop,
            R.drawable.dolar,
            R.drawable.euro,
            R.drawable.remnminbi,
            R.drawable.rubloruso
    )
    private val countries = arrayOf(
            "Peso Colombiano",
            "Dolar",
            "Euro",
            "Yuan",
            "Rublo Ruso"
    )
    var list: ArrayList<Currencys>? = null
        get() {

            if (field != null) return field

            field = ArrayList()
            for (i in images.indices) {
                val imageId = images[i]
                val countryName = countries[i]
                val currency = Currencys(imageId, countryName)
                field!!.add(currency) }
            return field }


}
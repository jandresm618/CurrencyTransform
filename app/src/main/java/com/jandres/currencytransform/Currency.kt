package com.jandres.currencytransform

data class Currencys(val image: Int,val name: String)

object Currency {
    val values = floatArrayOf(
            3661.69F,
            1F,
            0.85F,
            6.56F,
            76.43F
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
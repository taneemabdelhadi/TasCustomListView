package com.example.tarikul.customlistviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    val country: ArrayList<String> = ArrayList()
    val flags = arrayOf(R.drawable.ic_usa,R.drawable.ic_ban,R.drawable.ic_canada,R.drawable.ic_denmark,
            R.drawable.ic_eng,R.drawable.ic_finland,R.drawable.ic_germany,R.drawable.ic_hungery,R.drawable.ic_india,
            R.drawable.ic_japan,R.drawable.ic_kenya,R.drawable.ic_malaysia,R.drawable.ic_nigeria,
            R.drawable.ic_pakistan,R.drawable.ic_russia,R.drawable.ic_srilanka,R.drawable.ic_thailand,R.drawable.ic_eng)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addCountry()

        rv_country_list.layoutManager = LinearLayoutManager(this)
        rv_country_list.adapter = CountryAdapter(country,flags, this)
    }


    fun addCountry() {
        country.add("America")
        country.add("Bangldesh")
        country.add("Canada")
        country.add("Denmark")
        country.add("England")
        country.add("Finland")
        country.add("Germany")
        country.add("Hungery")
        country.add("India")
        country.add("Japan")
        country.add("Kenya")
        country.add("Malaysia")
        country.add("Nigeria")
        country.add("Pakistan")
        country.add("Russia")
        country.add("Sri Lanka")
        country.add("Thailand")
        country.add("United Kingdom")

    }

}

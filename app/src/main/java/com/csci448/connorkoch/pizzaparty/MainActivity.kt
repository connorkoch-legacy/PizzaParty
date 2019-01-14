package com.csci448.connorkoch.pizzaparty

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate_button.setOnClickListener {
            val numPeople: Int = num_people_edit_text.text.toString().toInt()
            val slicesPerPerson = when(how_hungry_radio_group.checkedRadioButtonId) {
                light_radio_button.id -> 1
                medium_radio_button.id -> 2
                heavy_radio_button.id -> 4
                else -> 0
            }
            val slicesPerPizza = 8.0
            val totalNumberPizzas = Math.ceil(numPeople * slicesPerPerson/ slicesPerPizza).toInt()

            num_pizzas_text_view.text = totalNumberPizzas.toString()
        }
    }

}

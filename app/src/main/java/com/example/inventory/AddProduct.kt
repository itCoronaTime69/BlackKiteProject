package com.example.inventory

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_product1.*

//syntax to change other page upon press button
//Add class to manifest by clicking AddProduct, then ALT + Enter then click add product to manifest

class AddProduct: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_product1) //set to other page.

        //submit button fn upon press submit, save all the user info
        addProductSubmitButton.setOnClickListener {
            // to store user values
            val database = getSharedPreferences("database", Context.MODE_PRIVATE)
            database.edit().apply {
                putString("savedProductName",editTextProductName.text.toString()) // store input in val database
            }.apply()
        }
    }
}
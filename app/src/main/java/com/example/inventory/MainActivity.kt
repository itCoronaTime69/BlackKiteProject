package com.example.inventory

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    //while screen is displayed
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        //go next page
        gotoAddProduct.setOnClickListener {
            startActivity(Intent(this,AddProduct::class.java)) //to link to next page
        }
        gotoSignIn.setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java)) //to link to next page
        }

        val preferences = getSharedPreferences("database", Context.MODE_PRIVATE) // use quotation to type databse FIRST instead of name.
        val savedName = preferences.getString("savedProductName", "This value doesn't exist") // error check
        d("Daniel","Saved Message is: $savedName") //alr enter to auto import packages for certain syntax

        if(savedName!="") {
            lastSavedProduct.text = "Hello " + savedName //print out last saved thing
        }else{
            lastSavedProduct.text = "Welcome"
        }


    }



}

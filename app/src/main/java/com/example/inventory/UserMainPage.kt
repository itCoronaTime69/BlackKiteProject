package com.example.inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_user_main_page.*

//user's feed
class UserMainPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_main_page)

        gotoInvest.setOnClickListener {
            startActivity(Intent(this,Invest::class.java)) //to link to next page
        }
        gotoReqLoan.setOnClickListener {
            startActivity(Intent(this,Reqloan::class.java)) //to link to next page
        }
        gotoExp.setOnClickListener {
            startActivity(Intent(this,ExploreActivity::class.java)) //to link to next page
        }
        gotoProfile.setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java)) //to link to next page
        }

    }
}

package com.example.intent_20200702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        backToMainBtn.setOnClickListener {

            //메인화면 복귀


//            val myIntent = Intent(this,MainActivity::class.java )
//            startActivity(myIntent)

//            복귀: FirstActivity 종류.
            finish()
        }


    }
}
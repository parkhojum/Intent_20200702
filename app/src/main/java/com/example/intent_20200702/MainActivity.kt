package com.example.intent_20200702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToFirstBtn.setOnClickListener {

            //Intent로 다른 액티비티로 이동 => 비행기로 여행.

            //Intent() => JAVA Intent () => 객체화

            //비행기 티캣 발권권

           val myIntent = Intent(this, FirstActivity::class.java)

            //실제 이동 처리
            startActivity(myIntent)

        }
    }
}
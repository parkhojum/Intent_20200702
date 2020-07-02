package com.example.intent_20200702

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //두번째 액티비티로 데이터 전달하기

        sendToSecondBtn.setOnClickListener {
            val inputmssge = messageEdt.text.toString()

            val inputNum = numberEdt.text.toString().toInt()


               val myIntent = Intent(this, SecondActivity::class.java)

            //티켓 정보를 이용해 수화물 첨부
            myIntent.putExtra("message", inputmssge)

            myIntent.putExtra("number", inputNum)

            //탑승 / 출발
            startActivity(myIntent)

        }

        moveToFirstBtn.setOnClickListener {

            //Intent로 다른 액티비티로 이동 => 비행기로 여행.

            //Intent() => JAVA Intent () => 객체화

            //비행기 티캣 발권

           val myIntent = Intent(this, FirstActivity::class.java)

            //실제 이동 처리
            startActivity(myIntent)

        }
    }
}
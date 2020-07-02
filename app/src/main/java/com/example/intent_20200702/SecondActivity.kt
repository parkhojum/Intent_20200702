package com.example.intent_20200702

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

// 들어온 데이터를 받아서 텍스트 뷰에 반영

        //액티비티가 가진 intent변수를 동해 첨부된
        val receivedMeeage = intent.getStringExtra("message")

//저장한 데이터 텍스트뷰에 반영
        receivdMessageTxt.text = receivedMeeage



    }
}
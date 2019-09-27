package com.example.kotlindemoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_next=findViewById<Button>(R.id.btn_next)
        btn_next.setOnClickListener{
            val ss:String="Welcome..."
            val message=ss
           val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("message","Welcome...")
            startActivity(intent)
        }
    }
}



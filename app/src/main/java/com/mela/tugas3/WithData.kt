package com.mela.tugas3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_with_data.*
import android.widget.TextView



class WithData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_data)

        val t = findViewById(R.id.text_viewdata) as TextView
        val bundle = intent.extras
        val s = bundle!!.getString("name")
        t.text = s

        back_id.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

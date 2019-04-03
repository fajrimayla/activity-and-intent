package com.mela.tugas3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_no_data.*
import android.widget.EditText



class NoData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_data)

        val dataid = findViewById(R.id.edit_textdata) as EditText
        val button = findViewById(R.id.share_id) as Button
        button.setOnClickListener {
            val i = Intent(this@NoData, WithData::class.java)
            i.putExtra("name", dataid.text.toString())
            startActivity(i)
        }
    }
}

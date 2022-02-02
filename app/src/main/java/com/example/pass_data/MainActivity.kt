package com.example.pass_data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var ed1=findViewById<EditText>(R.id.ed1)
        var ed2=findViewById<EditText>(R.id.ed2)

        var btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            var edit1=ed1.text.toString()
            var edit2=ed2.text.toString()

            var i=Intent(applicationContext,MainActivity2::class.java)
            i.putExtra("sirname",edit1)
            i.putExtra("name",edit2)
            startActivity(i)
        }
    }
}
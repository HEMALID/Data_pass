package com.example.pass_data

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var txt =findViewById<TextView>(R.id.txt)
        var i=intent
        var value="SirName:"+i.getStringExtra("sirname")+"\nName:"+i.getStringExtra("name")

        txt.text=value

    }
}
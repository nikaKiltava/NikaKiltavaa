package com.example.nikakiltava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clickSave = findViewById<Button>(R.id.saveButton)
        clickSave.setOnClickListener {
            Toast.makeText(this,"მომხმარებელი შენახულია",Toast.LENGTH_LONG).show()
        }
    }
}
package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        button = findViewById(R.id.btn_goTo2ndActivity)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        showToast("onStart!")
    }

    override fun onPause() {
        super.onPause()
        showToast("onPause!")
    }

    override fun onResume() {
        super.onResume()
        showToast("onResume!")
    }

    override fun onStop() {
        super.onStop()
        showToast("onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast("onDestroy!")
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, "First Activity: $msg", Toast.LENGTH_SHORT).show()
        Log.d("First Activity: ", msg)
    }


}
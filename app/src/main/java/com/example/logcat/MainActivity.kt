package com.example.logcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "onCreate()", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "onCreat() called")
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart() called")
        Toast.makeText(applicationContext, "onStart()", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart()", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "onRestart() called")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume()", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause()", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop()", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy()", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "onDestroy() called")
    }
}

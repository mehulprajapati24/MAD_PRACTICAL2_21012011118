package com.example.mad_practical2_21012011118

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() method is called")
    }
    override fun onStart() {
        super.onStart()
        showMessage("onStart() method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume() method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause() method is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop() method is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart() method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy() method is called")
    }

    fun showMessage(msg:String){
        //In Logcat to see the log message write: package:mine tag:MainActivity
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        //All function are executed together so in Snackbar last snackbar will be show
        val view = findViewById<ConstraintLayout?>(R.id.maintLayout)
        if(view!=null)
        {
            Snackbar.make(view, "$msg", Snackbar.LENGTH_SHORT).show()
        }
    }
}
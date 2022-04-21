package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var number = 0

    private lateinit var viewBiding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBiding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBiding.root
        setContentView(view)

        viewBiding.buttonIncremented.setOnClickListener {
            viewBiding.title.text = viewBiding.name.text

            startActivity(resultIntent())
        }
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val savedName = savedInstanceState.getString(ResultActivity.ARG_NAME)
        savedName?.let {
            viewBiding.title.text = savedName
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(ResultActivity.ARG_NAME, viewBiding.name.text.toString())
    }

    private fun resultIntent() : Intent {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(ResultActivity.ARG_NAME, viewBiding.name.text.toString())
        return intent
    }
}
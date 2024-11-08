package com.example.appstp1

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.OnSwipe
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity1 = findViewById<ConstraintLayout>(R.id.activity1)
        val click = findViewById<Button>(R.id.click)
        val longtext = findViewById<TextView>(R.id.longText)
        click.setOnClickListener {
            Toast.makeText(this, "Button click", Toast.LENGTH_SHORT).show()
            longtext.text = "Simple click on Button"
        }
        click.setOnLongClickListener {
            Toast.makeText(this@MainActivity, "Button Long click ", Toast.LENGTH_SHORT).show()
            longtext.text = "Long click on Button "
            true
        }

    }

}
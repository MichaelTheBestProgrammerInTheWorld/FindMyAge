package com.michaelmagdy.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            calculateAge()
        }
    }

    private fun calculateAge() {

        val userYOB = Integer.parseInt(editText.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val userAge = currentYear - userYOB
        if (userAge > 0){
            textView.text = "Your Age is $userAge years"
        } else {
            textView.text = "Please enter Your correct Age"
        }

    }
}

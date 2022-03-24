package com.example.activitymuh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    //data
    private var text_number = 0

    //views
    //text
    private lateinit var teamAScoreTextView: TextView
    // Images
    private lateinit var ImageFive: ImageView
    private lateinit var ImageTwo: ImageView
    private lateinit var ImageFour: ImageView
    private lateinit var ImageOne: ImageView
    private lateinit var ImageThree: ImageView
    //Actions
    private lateinit var Action_button_back: Button
    private lateinit var Action_buton_next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Binder()
        addListeners()
    }

    private fun addListeners() {
        Action_buton_next.setOnClickListener {
            text_number++
            VisualNumber(teamAScoreTextView, text_number)
        }

         Action_button_back.setOnClickListener {
            text_number--
         VisualNumber(teamAScoreTextView, text_number)
          }
        }

    private fun Binder(){
        // Btn
        Action_button_back = findViewById(R.id.Action_BtnBlack)
        Action_buton_next = findViewById(R.id.Action_BtnNext)
        //text
        teamAScoreTextView = findViewById(R.id.textView2)

    }


    private fun VisualNumber(view: TextView, score: Int) {
    view.text = score.toString()
    }
}
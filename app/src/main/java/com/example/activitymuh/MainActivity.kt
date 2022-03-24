package com.example.activitymuh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    //data
    private var text_number = 0
    private var text_clicks = 0
    private lateinit var text_change: TextView

    //views
    //text
    private lateinit var teamAScoreTextView: TextView
    // Images
    private lateinit var imageFive: ImageView
    private lateinit var imageTwo: ImageView
    private lateinit var imageFour: ImageView
    private lateinit var imageOne: ImageView
    private lateinit var imageThree: ImageView
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
            text_clicks++
            VisualNumber(teamAScoreTextView, text_number)
            changeImage(text_clicks)
        }

         Action_button_back.setOnClickListener {
            text_number--
         VisualNumber(teamAScoreTextView, text_number)
             changeImage(text_clicks)
         }
        }

    private fun Binder(){
        // Btn
        Action_button_back = findViewById(R.id.Action_BtnBlack)
        Action_buton_next = findViewById(R.id.Action_BtnNext)
        //text
        teamAScoreTextView = findViewById(R.id.textViewCounting)

    }


    private fun VisualNumber(view: TextView, score: Int) {
    view.text = score.toString()
    }

    private fun changeImage(click: Int) {
        imageFive = findViewById(R.id.imageViewFive)
        imageTwo = findViewById(R.id.imageViewTwo)
        imageFour = findViewById(R.id.imageViewFour)
        imageOne = findViewById(R.id.imageViewOne)
        imageThree = findViewById(R.id.imageViewThree)
        text_change = findViewById(R.id.textViewAction)

        when(click) {
            1-> {
                    imageFive.setImageResource(R.drawable.cinco_comparado)
                    imageTwo.setImageResource(R.drawable.dos_comparado)
                    text_change.text = getString(R.string.text_subtitle_compare)
            }
            2-> {
                    imageFive.setImageResource(R.drawable.dos_intercambio)
                    imageTwo.setImageResource(R.drawable.cinco_comparado)
                    text_change.text = getString(R.string.exchange)
                }
            3-> {
                    imageFive.setImageResource(R.drawable.dos_normal)
                    imageFour.setImageResource(R.drawable.cuatro_comparado)
                    text_change.text = getString(R.string.text_subtitle_compare)
                }
            4-> {
                    imageTwo.setImageResource(R.drawable.cuatro_intercambio)
                    imageFour.setImageResource(R.drawable.cinco_comparado)
                    text_change.text = getString(R.string.exchange)
                }
            5-> {
                    imageTwo.setImageResource(R.drawable.cuatro_normal)
                    imageOne.setImageResource(R.drawable.uno_comparado)
                    text_change.text = getString(R.string.text_subtitle_compare)
                }
            6-> {
                    imageFour.setImageResource(R.drawable.uno_intercambio)
                    imageOne.setImageResource(R.drawable.cinco_comparado)
                    text_change.text = getString(R.string.exchange)
                }
            7-> {
                    imageFour.setImageResource(R.drawable.uno_normal)
                    imageThree.setImageResource(R.drawable.tres_comparado)
                    text_change.text = getString(R.string.text_subtitle_compare)
                }
            8-> {
                    imageOne.setImageResource(R.drawable.tres_intercambio)
                    imageThree.setImageResource(R.drawable.cinco_comparado)
                    text_change.text = getString(R.string.exchange)
                }
            9-> {
                    imageFive.setImageResource(R.drawable.dos_comparado)
                    imageTwo.setImageResource(R.drawable.cuatro_comparado)
                    imageOne.setImageResource(R.drawable.tres_normal)
                    imageThree.setImageResource(R.drawable.cinco_normal)
                    text_change.text = getString(R.string.text_subtitle_compare)
                }
            10-> {
                    imageFive.setImageResource(R.drawable.dos_normal)
                    imageFour.setImageResource(R.drawable.uno_comparado)
                    text_change.text = getString(R.string.text_subtitle_compare)
                }
            11-> {
                    imageTwo.setImageResource(R.drawable.uno_intercambio)
                    imageFour.setImageResource(R.drawable.cuatro_comparado)
                text_change.text = getString(R.string.exchange)
                }
            12-> {
                    imageTwo.setImageResource(R.drawable.uno_normal)
                    imageFour.setImageResource(R.drawable.cuatro_comparado)
                    imageOne.setImageResource(R.drawable.tres_comparado)
                    text_change.text = getString(R.string.text_subtitle_compare)
                }
            13-> {
                    imageFour.setImageResource(R.drawable.tres_intercambio)
                    imageOne.setImageResource(R.drawable.cuatro_comparado)
                    text_change.text = getString(R.string.exchange)
                }
            14-> {
                    imageFour.setImageResource(R.drawable.tres_normal)
                    imageOne.setImageResource(R.drawable.cuatro_normal)
                    imageFive.setImageResource(R.drawable.dos_comparado)
                    imageTwo.setImageResource(R.drawable.uno_comparado)
                    text_change.text = getString(R.string.text_subtitle_compare)
                }
            15-> {
                    imageFive.setImageResource(R.drawable.uno_intercambio)
                    imageTwo.setImageResource(R.drawable.dos_comparado)
                    text_change.text = getString(R.string.exchange)
                }
        }

    }
}
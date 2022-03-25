package com.example.activitymuh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    //data
    private var textNumber = 0
    private var textClicks = 0
    //text
    private lateinit var textChange: TextView
    private lateinit var textCounting: TextView
    // Images
    private lateinit var imageFive: ImageView
    private lateinit var imageTwo: ImageView
    private lateinit var imageFour: ImageView
    private lateinit var imageOne: ImageView
    private lateinit var imageThree: ImageView
    //Actions
    private lateinit var actionButtonBack: Button
    private lateinit var actionButtonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binder()
        addListeners()
        changeImage(textClicks)
    }

    private fun addListeners() {
        actionButtonNext.setOnClickListener {
            if(textClicks <= 15) {
                textClicks++
                visualnumber(textCounting, textNumber)
                changeImage(textClicks)
            }
        }

         actionButtonBack.setOnClickListener {
             if (textClicks >= 0){
                 textClicks--
         visualnumber(textCounting, textNumber)
             changeImage(textClicks)
             }
         }
        }

    private fun binder(){
        // Btn
        actionButtonBack = findViewById(R.id.Action_BtnBlack)
        actionButtonNext = findViewById(R.id.Action_BtnNext)
        //text
        textCounting = findViewById(R.id.textViewCounting)
        textChange = findViewById(R.id.textViewAction)
        //img
        imageFive = findViewById(R.id.imageViewFive)
        imageTwo = findViewById(R.id.imageViewTwo)
        imageFour = findViewById(R.id.imageViewFour)
        imageOne = findViewById(R.id.imageViewOne)
        imageThree = findViewById(R.id.imageViewThree)

    }

    private fun visualnumber(view: TextView, score: Int) {
    view.text = score.toString()
    }

    private fun changeImage(click: Int) {

        when(click) {
            0 ->{
                imageFive.setImageResource(R.drawable.cinco_normal)
                imageTwo.setImageResource(R.drawable.dos_normal)
                imageFour.setImageResource(R.drawable.cuatro_normal)
                imageOne.setImageResource(R.drawable.uno_normal)
                imageThree.setImageResource(R.drawable.tres_normal)
                textChange.text = getString(R.string.text_subtitle_action)
                textCounting.text = getString(R.string.cero)
                actionButtonBack.visibility = View.INVISIBLE
            }
            1 -> {
                imageFive.setImageResource(R.drawable.cinco_comparado)
                imageTwo.setImageResource(R.drawable.dos_comparado)
                imageFour.setImageResource(R.drawable.cuatro_normal)
                imageOne.setImageResource(R.drawable.uno_normal)
                imageThree.setImageResource(R.drawable.tres_normal)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.one)
                actionButtonBack.visibility = View.VISIBLE
            }
            2 -> {
                imageFive.setImageResource(R.drawable.dos_intercambio)
                imageTwo.setImageResource(R.drawable.cinco_comparado)
                imageFour.setImageResource(R.drawable.cuatro_normal)
                textChange.text = getString(R.string.exchange)
                textCounting.text = getString(R.string.one)
            }
            3 -> {
                imageFive.setImageResource(R.drawable.dos_normal)
                imageFour.setImageResource(R.drawable.cuatro_comparado)
                imageTwo.setImageResource(R.drawable.cinco_comparado)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.one)
            }
            4 -> {
                imageTwo.setImageResource(R.drawable.cuatro_intercambio)
                imageFour.setImageResource(R.drawable.cinco_comparado)
                imageOne.setImageResource(R.drawable.uno_normal)
                textChange.text = getString(R.string.exchange)
                textCounting.text = getString(R.string.one)
            }
            5 -> {
                imageTwo.setImageResource(R.drawable.cuatro_normal)
                imageOne.setImageResource(R.drawable.uno_comparado)
                imageFour.setImageResource(R.drawable.cinco_comparado)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.one)
            }
            6 -> {
                imageFour.setImageResource(R.drawable.uno_intercambio)
                imageOne.setImageResource(R.drawable.cinco_comparado)
                imageThree.setImageResource(R.drawable.tres_normal)
                textChange.text = getString(R.string.exchange)
                textCounting.text = getString(R.string.one)
            }
            7 -> {
                imageFour.setImageResource(R.drawable.uno_normal)
                imageOne.setImageResource(R.drawable.cinco_comparado)
                imageThree.setImageResource(R.drawable.tres_comparado)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.one)
            }
            8 -> {
                imageOne.setImageResource(R.drawable.tres_intercambio)
                imageThree.setImageResource(R.drawable.cinco_comparado)
                imageFive.setImageResource(R.drawable.dos_normal)
                imageTwo.setImageResource(R.drawable.cuatro_normal)
                imageFour.setImageResource(R.drawable.uno_normal)
                textChange.text = getString(R.string.exchange)
                textCounting.text = getString(R.string.one)
            }
            9 -> {
                imageFive.setImageResource(R.drawable.dos_comparado)
                imageTwo.setImageResource(R.drawable.cuatro_comparado)
                imageOne.setImageResource(R.drawable.tres_normal)
                imageThree.setImageResource(R.drawable.cinco_normal)
                imageFour.setImageResource(R.drawable.uno_normal)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.two)
            }
            10 -> {
                imageFive.setImageResource(R.drawable.dos_normal)
                imageTwo.setImageResource(R.drawable.cuatro_comparado)
                imageFour.setImageResource(R.drawable.uno_comparado)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.two)
            }
            11 -> {
                imageTwo.setImageResource(R.drawable.uno_intercambio)
                imageFour.setImageResource(R.drawable.cuatro_comparado)
                imageOne.setImageResource(R.drawable.tres_normal)
                textChange.text = getString(R.string.exchange)
                textCounting.text = getString(R.string.two)
            }
            12 -> {
                imageTwo.setImageResource(R.drawable.uno_normal)
                imageFour.setImageResource(R.drawable.cuatro_comparado)
                imageOne.setImageResource(R.drawable.tres_comparado)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.two)
            }
            13 -> {
                imageFour.setImageResource(R.drawable.tres_intercambio)
                imageOne.setImageResource(R.drawable.cuatro_comparado)
                imageFive.setImageResource(R.drawable.dos_normal)
                imageTwo.setImageResource(R.drawable.uno_normal)

                textChange.text = getString(R.string.exchange)
                textCounting.text = getString(R.string.two)
            }
            14 -> {
                imageFour.setImageResource(R.drawable.tres_normal)
                imageOne.setImageResource(R.drawable.cuatro_normal)
                imageFive.setImageResource(R.drawable.dos_comparado)
                imageTwo.setImageResource(R.drawable.uno_comparado)
                textChange.text = getString(R.string.text_subtitle_compare)
                textCounting.text = getString(R.string.three)
                actionButtonNext.visibility = View.VISIBLE

            }
            15 -> {
                imageFive.setImageResource(R.drawable.uno_intercambio)
                imageTwo.setImageResource(R.drawable.dos_comparado)
                textChange.text = getString(R.string.exchange)
                textCounting.text = getString(R.string.three)
                actionButtonNext.visibility = View.INVISIBLE
            }
        }
    }
}
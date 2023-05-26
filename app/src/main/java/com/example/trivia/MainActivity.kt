package com.example.trivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar


class MainActivity : AppCompatActivity() {



    private var mcurrentpos:Int=1
    private var mquestionlist: ArrayList<QuestionVar>?=null
    private var mselectedOptionPos:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val questlists=HardcodeQues.getQuestions()
        val currentPosition=1
        val question: QuestionVar? = questlists[currentPosition-1]







    }
}
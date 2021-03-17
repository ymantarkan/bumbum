package com.example.game

import android.media.Image
import android.media.MediaPlayer
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import java.lang.reflect.Array
import java.util.*
import kotlin.math.log
import kotlin.random.Random
import kotlin.system.measureTimeMillis


class MainActivity : AppCompatActivity() {

    lateinit var imageview1: ImageView
    lateinit var imageview2: ImageView
    lateinit var imageview3: ImageView
    lateinit var imageview4: ImageView
    lateinit var imageview5: ImageView
    lateinit var imageview6: ImageView
    lateinit var imageview7: ImageView
    lateinit var imageview8: ImageView
    lateinit var imageview9: ImageView
    lateinit var imageview10: ImageView
    lateinit var imageview11: ImageView
    lateinit var imageview12: ImageView
    lateinit var imageview13: ImageView
    lateinit var imageview14: ImageView
    lateinit var imageview15: ImageView
    lateinit var imageview16: ImageView
    lateinit var imageview17: ImageView
    lateinit var imageview18: ImageView
    lateinit var imageview19: ImageView
    lateinit var imageview20: ImageView
    lateinit var imageViews: MutableList<ImageView>
    var handler = Handler()
    var runnable = Runnable { }
    final var score: Int = 0
    lateinit var countTime: TextView
    var counter = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        describe()
        startTimeCounter()
        hideImage()


    }

    fun startTimeCounter() {
        countTime = findViewById(R.id.timerTextView)
        object : CountDownTimer(15000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                countTime.text="Time:"+millisUntilFinished/1000


            }

            override fun onFinish() {
                countTime.text="Finish Time"
                handler.removeCallbacks(runnable)
                for (i in 0..19) {
                    imageViews[i].visibility = View.INVISIBLE

                }


            }
        }.start()
    }

    fun increase(view: View) {
        Log.i("kalanzaman",countTime.toString())
        if(!(countTime.toString().equals("0"))){
            cal()
            score++
            val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
            scoreTextView.text = (score.toString())

        }



    }

    fun hideImage() {
        runnable = object : Runnable {
            override fun run() {
                for (i in 0..19) {
                    imageViews[i].visibility = View.INVISIBLE

                }
                val random1 = Random.nextInt(19)
               /* val random2 = Random.nextInt(19)
                val random3 = Random.nextInt(19)*/
                imageViews[random1].visibility = View.VISIBLE
                //imageViews[random2].visibility = View.VISIBLE
               // imageViews[random3].visibility = View.VISIBLE




                handler.postDelayed(runnable, 500)

            }

        }
        handler.post(runnable)


    }


    fun describe() {
        imageview1 = findViewById(R.id.top1)
        imageview2 = findViewById(R.id.top2)
        imageview3 = findViewById(R.id.top3)
        imageview4 = findViewById(R.id.top4)
        imageview5 = findViewById(R.id.top5)
        imageview6 = findViewById(R.id.top6)
        imageview7 = findViewById(R.id.top7)
        imageview8 = findViewById(R.id.top8)
        imageview9 = findViewById(R.id.top9)
        imageview10 = findViewById(R.id.top10)
        imageview11 = findViewById(R.id.top11)
        imageview12 = findViewById(R.id.top12)
        imageview13 = findViewById(R.id.top13)
        imageview14 = findViewById(R.id.top14)
        imageview15 = findViewById(R.id.top15)
        imageview16 = findViewById(R.id.top16)
        imageview17 = findViewById(R.id.top17)
        imageview18 = findViewById(R.id.top18)
        imageview19 = findViewById(R.id.top19)
        imageview20 = findViewById(R.id.top20)
        imageViews = mutableListOf<ImageView>()
        imageViews.add(imageview1)
        imageViews.add(imageview2)
        imageViews.add(imageview3)
        imageViews.add(imageview4)
        imageViews.add(imageview5)
        imageViews.add(imageview6)
        imageViews.add(imageview7)
        imageViews.add(imageview8)
        imageViews.add(imageview9)
        imageViews.add(imageview10)
        imageViews.add(imageview11)
        imageViews.add(imageview12)
        imageViews.add(imageview13)
        imageViews.add(imageview14)
        imageViews.add(imageview15)
        imageViews.add(imageview16)
        imageViews.add(imageview17)
        imageViews.add(imageview18)
        imageViews.add(imageview19)
        imageViews.add(imageview20)


    }

    fun cal() {

        val mp: MediaPlayer = MediaPlayer.create(this@MainActivity, R.raw.patlama)
        mp.start()
    }


}

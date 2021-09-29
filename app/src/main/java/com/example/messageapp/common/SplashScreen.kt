package com.example.messageapp.common

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.airbnb.lottie.LottieAnimationView
import com.example.messageapp.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        val lottieAnimation = LottieAnimationView(this)

        Handler(Looper.getMainLooper()).postDelayed({
            lottieAnimation.apply {
                lottieAnimation.findViewById<LottieAnimationView>(R.id.lottie_animation_splash_screen)
                lottieAnimation.playAnimation()
                val intent = Intent(this@SplashScreen, MainActivity::class.java)
                startActivity(intent)
            }
        }, 3000)
    }
}
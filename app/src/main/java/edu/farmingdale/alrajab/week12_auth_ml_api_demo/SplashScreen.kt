package edu.farmingdale.alrajab.week12_auth_ml_api_demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import kotlinx.coroutines.*

class SplashScreen : AppCompatActivity() {

    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        setActionBar(null)


        activityScope.launch {
            delay(4000)

            var intent = Intent(this@SplashScreen, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
        supportActionBar?.hide()

    }
}
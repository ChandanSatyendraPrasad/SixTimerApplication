package chandan.satyendra.prasad.sixtimerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val counttimertext = findViewById<TextView>(R.id.counter)
        object : CountDownTimer(10000, 10000) {
            override fun onTick(millisUntilFinished: Long) {
                counttimertext.setText("Left -> ${millisUntilFinished/1000}")
            }
            override fun onFinish() {
                Toast.makeText(applicationContext,"Timer is off",Toast.LENGTH_LONG).show()
                counttimertext.setText("Left -> 0")

            }
        }.start()

    }
}
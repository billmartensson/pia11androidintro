package se.magictechnology.pia11into

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var mynumber = 0

    lateinit var mytext : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mytext = findViewById<TextView>(R.id.fancytext)

        mytext.text = "Hepp"

        findViewById<Button>(R.id.fancybutton).setOnClickListener {

            mynumber += 1

            mytext.text = mynumber.toString()
        }


        findViewById<Button>(R.id.minusButton).setOnClickListener {
            docalc(-1)
        }

        findViewById<Button>(R.id.resetButton).setOnClickListener {
            docalc(0)
        }

        findViewById<Button>(R.id.plusButton).setOnClickListener {
            docalc(1)
        }

    }

    fun docalc(calcnumber : Int) {

        if(calcnumber == 0) {
            mynumber = 0
        }

        mynumber += calcnumber

        if(mynumber < 0) {
            mynumber = 0
        }

        mytext.text = mynumber.toString()
    }

}
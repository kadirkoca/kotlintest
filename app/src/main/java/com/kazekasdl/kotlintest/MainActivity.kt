package com.kazekasdl.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var tv:TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /////////////////////////////////////////////////////////////////////////
    /////////////////  THE TASK  ////////////////////////////////////////////



    fun factor (x: Int): Array<Int> {
        val primelist = ArrayList<Int>()

        var rootprime:Int = 2
        var thenumber = x

        while (thenumber > 1) {
            if (thenumber % rootprime == 0) {
                thenumber /= rootprime
                primelist.add(rootprime)
            } else {
                rootprime++
            }
        }

        return primelist.toTypedArray()
    }



    /////////////////  THE TASK  ////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
}

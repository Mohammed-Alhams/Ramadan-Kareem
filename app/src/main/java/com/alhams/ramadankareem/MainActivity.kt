package com.alhams.ramadankareem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.IllegalStateException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doSomething()
    }

    /**
     * This function is an example of javadoc
     */
    fun doSomething(){

    }
}

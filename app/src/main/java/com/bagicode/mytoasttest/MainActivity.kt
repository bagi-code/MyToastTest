package com.bagicode.mytoasttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import android.view.ViewGroup
import android.view.LayoutInflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

            // default
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()

            // custom
            val inflater = layoutInflater
            val layout = inflater.inflate(
                R.layout.custom_toast,
                findViewById(R.id.custom_toast_layout)
            )
            val tv = layout.findViewById(R.id.txtvw) as TextView
            tv.text = "Custom Toast Notification"

            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout
            toast.show()

        }
    }
}

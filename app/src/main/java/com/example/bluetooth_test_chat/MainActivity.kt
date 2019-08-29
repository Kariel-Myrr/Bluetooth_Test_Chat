package com.example.bluetooth_test_chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun changeActtoServerAct(demo : View){
        val intent = Intent(this@MainActivity,ServerActivity::class.java)
        startActivity(intent)

    }

    fun changeActtoClientAct(demo: View){
        val intent = Intent(this@MainActivity,ClientActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        server_but.setOnClickListener(::changeActtoServerAct)
        client_but.setOnClickListener(::changeActtoClientAct)
    }
}

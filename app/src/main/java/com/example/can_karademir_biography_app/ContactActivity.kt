package com.example.can_karademir_biography_app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ContactActivity : AppCompatActivity() {
    lateinit var btnInstagram:ImageButton
    lateinit var btnLinkedln:ImageButton
    lateinit var btnPhone:ImageButton
    lateinit var btnMail:ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)


        btnInstagram = findViewById(R.id.imgInstagram)
        btnLinkedln = findViewById(R.id.imgLinkedln)
        btnPhone = findViewById(R.id.imgPhone)
        btnMail = findViewById(R.id.imgMail)


        btnInstagram.setOnClickListener {
            val openURL= Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.instagram.com/krdmr_cn/")
            startActivity(openURL)
        }
        btnLinkedln.setOnClickListener {
            val openURL= Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.linkedin.com/in/cankarademir/")
            startActivity(openURL)
        }
        btnPhone.setOnClickListener {
            val openURL= Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("tel:05535433828")
            startActivity(openURL)
        }
        btnMail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","cankarademir.yazilim@gmail.com", null))
            startActivity(emailIntent)
        }
    }
}
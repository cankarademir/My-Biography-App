package com.example.can_karademir_biography_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    lateinit var btnAbout : Button
    lateinit var btnBlog : Button
    lateinit var btnContact : Button
    lateinit var btnGallery : Button
    lateinit var txtname: TextView
    lateinit var txtwork: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtname=findViewById(R.id.txtName)
        txtwork=findViewById(R.id.txtWork)

        btnAbout= findViewById(R.id.btnAbout)
        btnGallery= findViewById(R.id.btnGallery)
        btnContact= findViewById(R.id.btnContact)
        btnBlog= findViewById(R.id.btnBlog)

        txtname.text= "CAN KARADEMİR"
        txtwork.text= "Bilgisayar Mühendisi"

        btnAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        btnGallery.setOnClickListener {
            val intent = Intent(this, GalleryActivity::class.java)
            startActivity(intent)
        }
        btnContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
        btnBlog.setOnClickListener {
            val intent = Intent(this, BlogActivity::class.java)
            startActivity(intent)
        }

    }
}
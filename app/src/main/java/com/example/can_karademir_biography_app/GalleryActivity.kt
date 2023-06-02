package com.example.can_karademir_biography_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.can_karademir_biography_app.adapter.PortfolyoCostumAdapter
import com.example.can_karademir_biography_app.services.PortfolyoService

class GalleryActivity : AppCompatActivity() {

    lateinit var p_listView:ListView
    val portfolyoService = PortfolyoService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        p_listView= findViewById(R.id.p_listView)
        val costumAdapter = PortfolyoCostumAdapter(this,portfolyoService.portfoResult())
        p_listView.adapter= costumAdapter
    }
}
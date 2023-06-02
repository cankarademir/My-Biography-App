package com.example.can_karademir_biography_app.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.can_karademir_biography_app.R
import com.example.can_karademir_biography_app.models.Portfolyo

class PortfolyoCostumAdapter(private val context: Activity, private val list: List<Portfolyo>): ArrayAdapter<Portfolyo>(context,R.layout.costum_list_item,list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.costum_list_item, null, true)

        val r_ProjectName = rootView.findViewById<TextView>(R.id.r_ProjectName)
        val r_years = rootView.findViewById<TextView>(R.id.r_years)
        val r_teknology = rootView.findViewById<TextView>(R.id.r_Teknology)
        val r_details = rootView.findViewById<TextView>(R.id.r_details)
        val r_image =rootView.findViewById<ImageView>(R.id.r_image)

        val portfolyo = list.get(position)

        r_ProjectName.text = portfolyo.name
        r_years.text = portfolyo.year.toString()
        r_teknology.text = portfolyo.teknology
        r_details.text = portfolyo.projectDetail

        Glide.with(rootView).load(portfolyo.image).into(r_image)
        return rootView

    }

}
package com.example.can_karademir_biography_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.can_karademir_biography_app.models.About

class AboutActivity : AppCompatActivity() {

    lateinit var txtName:TextView
    lateinit var txtBirth:TextView
    lateinit var txtAboutme:TextView
    lateinit var txtEducation:TextView
    lateinit var txtAbilities:TextView
    lateinit var imgPhoto:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val about= About(
            "CAN",
            "KARADEMİR",
            "19/11/2001",
            "Elazığ/Merkez",
            "2019 yılında Elazığ Mehmet Koloğlu Anadolu Lisesinden mezun oldum. İlgimi çektiği ve programların nasıl geliştirildiğine olan merakımdan dolayı Bilgisayar Mühendisliği bölümünü tercih ettim. " +
                    "Eğitimimde edindiğim teorik bilgileri uygulamak ve network edinmek adına gönüllü topluluklarda aktif olarak çeşitli görevlerde ve projelerde yer aldım. " +
                    "Çeşitli alanlarda projeler yönettim veya görev aldım. Şuan aktif olarak kendimi mobil programlama alanında gelistiriyorum ve kendimi geliştirip farklı ve yenilikçi teknolojilerin gelişimesinde aktif rol oynamak istiyorum.",
            "Mehmet Koloğlu Anadolu Lisesi  (2015-2019)",
            "Fırat Üniversitesi Bilgisayar Mühendisliği  (2019-2023)",
            "Ekip Yönetimi, Kotlin, Android Studio, Java, Jsoup, Jsp, Unity",
            "https://media.licdn.com/dms/image/D4D03AQGWM2Rtajq01w/profile-displayphoto-shrink_400_400/0/1684923466555?e=1691020800&v=beta&t=vFNaqffBbqmysbYDH9Zsqnd-RYZHIInpm9beLPELkzo"
        )

        txtBirth = findViewById(R.id.txt_dateandtown)
        txtAboutme = findViewById(R.id.txt_aboutme)
        txtName = findViewById(R.id.txt_name_surname)
        txtEducation = findViewById(R.id.txt_education)
        txtAbilities = findViewById(R.id.txt_abilities)
        imgPhoto = findViewById(R.id.imageme)

        txtName.text= about.name +" "+ about.surname
        txtBirth.text = about.dateofbirth  +" - "+ about.hometown
        txtAboutme.text = about.aboutme
        txtEducation.text = about.h_education +"\n" + about.u_education
        txtAbilities.text = about.abilities

        Glide.with(this).load(about.image).into(imgPhoto);




    }
}
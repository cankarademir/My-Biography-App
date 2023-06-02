package com.example.can_karademir_biography_app.services

import com.example.can_karademir_biography_app.models.Portfolyo

class PortfolyoService {

    fun portfoResult(): List<Portfolyo> {
        var list = mutableListOf<Portfolyo>()
        val p1 = Portfolyo("Movie Project", "Java, Jsoup, JSP, Web", "Narveri Şirketinde staj yaparken yapılmış internetten veri kazıması ve kazınan bu verileri jsp ile web sitesine gömülmesi ile yapılmış bir web projesi. ",2021, "https://raw.githubusercontent.com/cankarademir/movies_project/main/index.png")
        val p2 = Portfolyo("Market Stock Module", "Java, Mysql", "IEEE Fırat Computer Society bünyesinde geliştirilmiş temel market stok ve kasa işlemlerinin yapılabileceği bir masaüstü uygulaması.",2021, "https://raw.githubusercontent.com/IEEEFiratComputerSociety/stockModule/main/sales.png")
        val p3 = Portfolyo("Rotten and Fresh Fruit Detection", "Yolov3, Colab, Machine Learning", "Yazılım Mühendisliği dersi altında geliştirilmiş olan çürük ve sağlam meyveleri ayırt edebilen makine öğrenmesi projesi.",2022, "https://user-images.githubusercontent.com/69106446/169070839-49ce2d6a-9274-4e8f-ae03-557aa2c5df3f.jpeg")
        val p4 = Portfolyo("RR Run Mobile Game ", "Unity, Blander, C#, Game", "Uzayda geçen uzay gemisini meteorlardan kaçma temeli üzerine kurulmuş 2 boyutlu geliştirilmiş olan bir mobil oyundur.",2022, "https://raw.githubusercontent.com/cankarademir/dersnot/main/rr.png?token=GHSAT0AAAAAABXBUPSJU2X5GNWT2NKX5NI4ZCLAZBA")
        val p5 = Portfolyo("Pourckat Game", "Unity, Blander, C#, Game", "IEEE Fırat Computer Society bünyesinde ekip olarak geliştirilmiş bir oyundur. Fırat proje pazarında tanıtıma çıkmış bir oyundur.",2022, "https://user-images.githubusercontent.com/69106446/177015770-0001048f-8e4b-46c8-b4d5-21f172ca45c8.png")
        val p6 = Portfolyo("Blok Game", "Unity, C#, Game", "Blokların üst üste gelerek yığın oluşturduğu ve oyuncunun zaman ve tıklama kordinasyonunu ölçen bir mobil oyunu.",2022, "https://raw.githubusercontent.com/cankarademir/dersnot/main/blok.png?token=GHSAT0AAAAAABXBUPSI63AMM25WRFDP5SOCZCLA4IQ")
        val p7 = Portfolyo("Barber Appointment App", "Android, Java, Firebase, Mobile", "Berberden randevu alma işlemlerini gerçekleştirebileceğimiz android platformunda çalışan bir randevu aplikasyonu.",2022, "https://raw.githubusercontent.com/cankarademir/dersnot/main/photo2.png?token=GHSAT0AAAAAABXBUPSJL5IQ4UCGTULGCR2UZCLPRXA")

        list.add(p1)
        list.add(p2)
        list.add(p3)
        list.add(p4)
        list.add(p5)
        list.add(p6)
        list.add(p7)

        return list
    }
}
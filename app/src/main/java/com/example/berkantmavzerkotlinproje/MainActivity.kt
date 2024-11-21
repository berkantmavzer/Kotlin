package com.example.berkantmavzerkotlinproje

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.android.synthetic.main.activity_main.numberText1
import kotlinx.android.synthetic.main.activity_main.numberText2
import kotlinx.android.synthetic.main.activity_main.sonucText

class MainActivity : AppCompatActivity() {

    var sayi1:Int? = null
    var sayi2:Int? = null
    var sonuc:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun topla(v: View) {
        sayi1 = numberText1.text.toString().toIntOrNull()
        sayi2 = numberText2.text.toString().toIntOrNull()

        if (sayi1 == null) {
            sonucText.text = "Birinci Sayı Alanı Boş!!"
        } else if (sayi2 == null) {
            sonucText.text = "İkinci Sayı Alanı Boş!!"
        }
        else {
            sonuc = sayi1!! + sayi2!!
            sonucText.text = "Sonuç: $sonuc"
        }
    }

    fun cikar(v: View) {
        sayi1 = numberText1.text.toString().toIntOrNull()
        sayi2 = numberText2.text.toString().toIntOrNull()

        if (sayi1 == null) {
            sonucText.text = "Birinci Sayı Alanı Boş!!"
        } else if (sayi2 == null) {
            sonucText.text = "İkinci Sayı Alanı Boş!!"
        }
        else {
            sonuc = sayi1!! - sayi2!!
            sonucText.text = "Sonuç: $sonuc"
        }
    }

    fun carp(v: View) {
        sayi1 = numberText1.text.toString().toIntOrNull()
        sayi2 = numberText2.text.toString().toIntOrNull()

        if (sayi1 == null) {
            sonucText.text = "Birinci Sayı Alanı Boş!!"
        } else if (sayi2 == null) {
            sonucText.text = "İkinci Sayı Alanı Boş!!"
        }
        else {
            sonuc = sayi1!! * sayi2!!
            sonucText.text = "Sonuç: $sonuc"
        }
    }

    fun bol(v: View) {
        sayi1 = numberText1.text.toString().toIntOrNull()
        sayi2 = numberText2.text.toString().toIntOrNull()

        if (sayi1 == null) {
            sonucText.text = "Birinci Sayı Alanı Boş!!"
        } else if (sayi2 == null) {
            sonucText.text = "İkinci Sayı Alanı Boş!!"
        }
        else {
            sonuc = sayi1!! / sayi2!!
            sonucText.text = "Sonuç: $sonuc"
        }
    }
}
package com.example.sharedpreferenceskullanimi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.sharedpreferenceskullanimi.databinding.ActivityBBinding

class ActivityB : AppCompatActivity() {

    private lateinit var tasarim:ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_b)

        val sp = getSharedPreferences("KişiselBilgiler", Context.MODE_PRIVATE)

        val ad = sp.getString("ad","isim yok")
        val yas = sp.getInt("yas",0)
        val boy = sp.getFloat("boy",0.0f)
        val bekarMi = sp.getBoolean("bekarMi",false)

        val liste = sp.getStringSet("arkadasListesi",null)

        Log.e("Ad", ad.toString())
        Log.e("Yaş",yas.toString())
        Log.e("Boy",boy.toString())
        Log.e("Bekar mı?",bekarMi.toString())

        if (liste != null){

            for (a in liste){

                Log.e("Arkadaş",a)

            }

        }



    }
}
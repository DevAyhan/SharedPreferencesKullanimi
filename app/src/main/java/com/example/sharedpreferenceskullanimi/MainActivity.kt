package com.example.sharedpreferenceskullanimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.sharedpreferenceskullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val sp = getSharedPreferences("KişiselBilgiler",Context.MODE_PRIVATE)

        val editor = sp.edit()

        editor.remove("ad")

        editor.commit()



        /*editor.putString("ad","Ahmet")
        editor.putInt("yas",18)
        editor.putFloat("boy",1.78f)
        editor.putBoolean("bekarMi",false)

        val arkadasListesi = HashSet<String>()
        arkadasListesi.add("Zeynep")
        arkadasListesi.add("Ece")
        arkadasListesi.add("Ali")

        editor.putStringSet("arkadasListesi",arkadasListesi)

        editor.commit()*/

        tasarim.buttonGit.setOnClickListener {

            startActivity(Intent(this@MainActivity,ActivityB::class.java))

        }
    }
}
package com.atilsamancioglu.farkliaktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("onCreate çağırıldı")

    }

    override fun onStart() {
        super.onStart()

        println("onStart çağırıldı")

    }

    override fun onResume() {
        super.onResume()

        println("onResume çağırıldı")

    }

    override fun onPause() {
        super.onPause()

        println("onPause çağırıldı")

    }

    override fun onStop() {
        super.onStop()

        println("onStop çağırıldı")

    }

    override fun onDestroy() {
        super.onDestroy()

        println("onDestroy çağırıldı")

    }



    fun aktiviteDegistir(view: View){

        val kullaniciVerisi = editText.text.toString()

        val intent = Intent(applicationContext,IkinciActivity::class.java)
        intent.putExtra("yollananVeri",kullaniciVerisi)
        startActivity(intent)
        finish()

    }
}
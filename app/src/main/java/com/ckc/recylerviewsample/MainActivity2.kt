package com.ckc.recylerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ckc.recylerviewsample.databinding.ActivityMain2Binding

lateinit var binding: ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val a =intent
        val data = a.getSerializableExtra("keyy") as Model // as Model " Casting " denir

        binding.nameText.text = data.name
        binding.surNameText.text = data.surName



    }
}
package com.ckc.recylerviewsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.ckc.recylerviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var dateArrayList : ArrayList<Model>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        dateArrayList = ArrayList<Model>()

        var data1=Model("murat","calıskan")
        var data2=Model("can","bilir")
        var data3=Model("coskun","kosar")
        var data4=Model("mustafa","tembel")

        dateArrayList.add(data1)
        dateArrayList.add(data2)
        dateArrayList.add(data3)
        dateArrayList.add(data4)
        dateArrayList.add(data1)
        dateArrayList.add(data2)
        dateArrayList.add(data3)
        dateArrayList.add(data4)
        dateArrayList.add(data1)
        dateArrayList.add(data2)
        dateArrayList.add(data3)
        dateArrayList.add(data4)
        dateArrayList.add(data1)
        dateArrayList.add(data2)
        dateArrayList.add(data3)
        dateArrayList.add(data4)
        dateArrayList.add(data1)
        dateArrayList.add(data2)
        dateArrayList.add(data3)
        dateArrayList.add(data4)

        var recyler = RecylerAdapter(dateArrayList)
        binding.recylerView.adapter = recyler
        binding.recylerView.layoutManager = LinearLayoutManager(this)


        var adapterr = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,dateArrayList.map { dateArrayList ->dateArrayList.name })
        binding.listView.adapter = adapterr

        binding.listView.onItemClickListener =AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this@MainActivity,MainActivity2::class.java)
            intent.putExtra("keyy",dateArrayList[i])
            startActivity(intent)

        }







    }
}
package com.ckc.recylerviewsample

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ckc.recylerviewsample.databinding.ItemBinding

class RecylerAdapter(var list :ArrayList<Model>) : RecyclerView.Adapter<RecylerAdapter.RecylerViewHoleder>() {

    class RecylerViewHoleder(val binding : ItemBinding) : RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecylerViewHoleder {
        var recyler = ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RecylerViewHoleder(recyler)

    }

    override fun onBindViewHolder(holder: RecylerViewHoleder, position: Int) {
        holder.binding.recylerItemText.text = list.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,MainActivity2::class.java)
            intent.putExtra("keyy",list.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
       return list.size
    }

}
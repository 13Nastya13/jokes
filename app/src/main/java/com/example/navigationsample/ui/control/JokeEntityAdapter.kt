package com.example.navigationsample.ui.control

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.navigationsample.database.entity.JokeEntity
import com.example.navigationsample.databinding.ItemJokeBinding

class JokeEntityAdapter : RecyclerView.Adapter<JokeEntityAdapter.ViewHolder>() {

    var items_ = ArrayList<JokeEntity>()

    fun setItems(data : ArrayList<JokeEntity>){
        items_ = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemJokeBinding.inflate(layoutInflater)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items_[position])
    }

    override fun getItemCount(): Int {
        return items_.size
    }

    class ViewHolder(val binding: ItemJokeBinding) : RecyclerView.ViewHolder(binding.root)
    {
        fun bind(joke : JokeEntity) {
            binding.joke = joke
            binding.executePendingBindings()
        }
    }
}
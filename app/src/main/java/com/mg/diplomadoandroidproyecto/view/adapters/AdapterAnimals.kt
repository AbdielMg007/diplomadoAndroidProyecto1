package com.mg.diplomadoandroidproyecto.view.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mg.diplomadoandroidproyecto.R
import com.mg.diplomadoandroidproyecto.databinding.AnimalsCardBinding
import com.mg.diplomadoandroidproyecto.helpers.AnimalClick
import com.mg.diplomadoandroidproyecto.model.entities.Animal

class AdapterAnimals(private var animal: ArrayList<Animal>, private val AnimalClick: AnimalClick) : RecyclerView.Adapter<AdapterAnimals.AnimalViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val binding = AnimalsCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(binding)
    }


    override fun onBindViewHolder(holder: AnimalViewHolder, i: Int) {
        holder.bind(animal[i])
        holder.itemView.setOnClickListener{
            AnimalClick.animalsClickListener(animal[i])
        }
    }

    override fun getItemCount(): Int = animal.size

    class AnimalViewHolder(val binding: AnimalsCardBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(animal: Animal) {
            binding.itemName.text = animal.name
            animal.photo.let { binding.itemImage.setImageResource(it) }
        }
    }

    fun updateItems(newItems: ArrayList<Animal>) {
        animal.clear()
        animal.addAll(newItems)
        notifyDataSetChanged()
    }

}
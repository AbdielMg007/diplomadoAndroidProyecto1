package com.mg.diplomadoandroidproyecto.model.repository

import com.mg.diplomadoandroidproyecto.R
import com.mg.diplomadoandroidproyecto.model.entities.Animal

class AnimalData {

    companion object {
        fun getData() : ArrayList<Animal> {
            val list: ArrayList<Animal> = arrayListOf()
            list.add(
                Animal(
                    "Perro",
                    "Pelusa",
                    R.drawable.perro,
                    6,
                    "Lorem Ipsum is simply dummy text  with desktop publishing software"
                ),
            )
            list.add(
                Animal(
                    "Gato",
                    "Wero",
                    R.drawable.gato,
                    1,
                    "Lorem Ipsum is simply dummy text  with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
                ),
            )
            list.add(
                Animal(
                    "Pez",
                    "Bolillo",
                    R.drawable.pez,
                    1,
                    "Lorem Ipsum is simply dummy text  with desktop publishing software like Aldus"
                )
            )
            return list
        }

    }
}



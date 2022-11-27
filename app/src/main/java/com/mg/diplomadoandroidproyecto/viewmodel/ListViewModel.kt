package com.mg.diplomadoandroidproyecto.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mg.diplomadoandroidproyecto.model.entities.Animal
import com.mg.diplomadoandroidproyecto.model.repository.AnimalData

class ListViewModel : ViewModel() {
    val list = MutableLiveData<ArrayList<Animal>>()

    init {
        getAnimalsList()
    }

    fun getAnimalsList() {
        val animals = AnimalData.getData()
        list.postValue(animals)
    }
}
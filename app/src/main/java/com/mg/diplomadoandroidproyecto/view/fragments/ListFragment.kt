package com.mg.diplomadoandroidproyecto.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mg.diplomadoandroidproyecto.R
import com.mg.diplomadoandroidproyecto.databinding.FragmentListBinding
import com.mg.diplomadoandroidproyecto.helpers.AnimalClick
import com.mg.diplomadoandroidproyecto.model.entities.Animal
import com.mg.diplomadoandroidproyecto.model.repository.AnimalData
import com.mg.diplomadoandroidproyecto.view.adapters.AdapterAnimals
import com.mg.diplomadoandroidproyecto.viewmodel.ListViewModel
import java.util.Observer

class ListFragment : Fragment(R.layout.fragment_list), AnimalClick {

    private lateinit var binding: FragmentListBinding
    private val animalViewModel: ListViewModel by viewModels()
    private lateinit var adapter: AdapterAnimals

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentListBinding.bind(view)

        adapter = AdapterAnimals(arrayListOf(), this)

        binding.recyclerAnimals.layoutManager = LinearLayoutManager(context)
        binding.recyclerAnimals.adapter = adapter

        animalViewModel.list.observe(viewLifecycleOwner, androidx.lifecycle.Observer { newAnimals ->
            adapter.updateItems(newAnimals)
        })


    }

    override fun animalsClickListener(Animal: Animal) {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, ViewFragment.newInstance(Animal))
            .addToBackStack("mainFragment")
            .commit()
    }


}
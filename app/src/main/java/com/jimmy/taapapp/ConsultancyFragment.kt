package com.jimmy.taapapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.jimmy.taapapp.databinding.FragmentConsultancyBinding


class ConsultancyFragment : Fragment() {

    private lateinit var binding: FragmentConsultancyBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_consultancy, container, false)
        return binding.root
    }


}
package com.example.boardfragment.ui.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.boardfragment.R
import com.example.boardfragment.databinding.FragmentPnBoardPageBinding
import com.example.boardfragment.utils.Preference
import javax.inject.Inject

class PnBoardPageFragment(
     var listenerSkipPage:() -> Unit,
     var  listenerNextPage:() -> Unit
        ) : Fragment() {
    private lateinit var binding: FragmentPnBoardPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPnBoardPageBinding.inflate(inflater,container,false)
        initView()
        initListeners()
        return binding.root
    }

    private fun initListeners() {
        binding.btnNext.setOnClickListener {
             listenerNextPage.invoke()
        }
        binding.btnSkip.setOnClickListener {
           listenerSkipPage.invoke()
        }
        binding.btnStart.setOnClickListener {
            Preference(requireContext()).boardShowed(true)
            findNavController().navigate(R.id.navigation_home)
        }
    }

    private fun initView() {
     val data = arguments?.getSerializable("joy") as BoardModel
        binding.tvPage.text = data.text
        data.image?.let { it -> binding.iv.setImageResource(it) }
        binding.btnSkip.isVisible = data.isLastBoard == false
        binding.btnNext.isVisible = data.isLastBoard == false
        binding.btnStart.isVisible = data.isLastBoard == true

    }
}
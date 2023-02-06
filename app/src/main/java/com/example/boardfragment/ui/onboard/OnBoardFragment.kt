package com.example.boardfragment.ui.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.boardfragment.databinding.FragmentOnBoardBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnBoardFragment : Fragment() {
    private lateinit var binding: FragmentOnBoardBinding
    private  lateinit var adapter: ViewPagerFragmentStateAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater,container,false)
        adapter = ViewPagerFragmentStateAdapter(requireActivity(),this::onNext,this::onSkip)
        binding.viewPager2.adapter= adapter
        return binding.root
    }
    private fun onNext() {
        binding.viewPager2.currentItem +=1
    }
    private fun onSkip() {
    binding.viewPager2.currentItem  = 3
    }
}
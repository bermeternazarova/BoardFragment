package com.example.boardfragment.ui.onboard

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.boardfragment.R

class ViewPagerFragmentStateAdapter (fm: FragmentActivity,
                                     private var listenerSkip:() -> Unit,
                                     private var  listenerNext:() -> Unit) :FragmentStateAdapter(fm) {

    private val list  = arrayOf(BoardModel(R.drawable.back11,"Если забудешь своё имя, то не сможешь вернуться домой.(Рин)")
        ,BoardModel(R.drawable.back55,"Встречи не забываются, вы просто не можете их вспомнить.(Дзэниба)",false),
        BoardModel(R.drawable.back33,"Мама, папа, я вас обязательно спасу, только, пожалуйста, не толстейте, а то вас съедят!( Тихиро)",false)
            , BoardModel(R.drawable.back44,"После дождя как не быть морю?(Рин)",true)
    )

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = PnBoardPageFragment(listenerSkip,listenerNext)
        val getData = bundleOf("joy" to list[position])
        fragment.arguments = getData
        return fragment

    }
}
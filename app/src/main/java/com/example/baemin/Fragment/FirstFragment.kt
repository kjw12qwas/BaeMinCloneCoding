package com.example.baemin.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.baemin.Fragment.MarketInfo.MarketInfoActivity
import com.example.baemin.R
import kotlinx.android.synthetic.main.fragment_first.view.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_first, container, false)
        val list_array = arrayListOf<ContentsListModel>(
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d"),
            ContentsListModel("a","b",1,"d")
        )

        val list_adapter = FirstFragAdapter(requireContext(), list_array)
        view.listview_frist_fragment.adapter = list_adapter

        view.listview_frist_fragment.setOnItemClickListener { parent, view, position, id ->

            val intent = Intent(requireContext(), MarketInfoActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}

package com.example.myapplicationk.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationk.BlogRecyclerAdapter
import com.example.myapplicationk.DataSource
import com.example.myapplicationk.R
import com.example.myapplicationk.activity.MainActivity
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {


    private lateinit var blogAdapter: BlogRecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    private fun addDataSet(){
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.recycleView.layoutManager = LinearLayoutManager(context)
        blogAdapter = BlogRecyclerAdapter()
        addDataSet()
        view.recycleView.adapter = blogAdapter


        return view
    }


}
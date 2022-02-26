package com.example.android.trackmysleepquality.sleeptracker

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.android.trackmysleepquality.R
import com.example.android.trackmysleepquality.SleepNightDiffCallback

import com.example.android.trackmysleepquality.ViewHolder

import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter: ListAdapter<SleepNight, ViewHolder>(SleepNightDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater  = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item_view, parent,false )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = getItem(position)
        holder.bind(item)
    }
}



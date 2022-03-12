package com.example.android.trackmysleepquality.sleeptracker

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.android.trackmysleepquality.SleepNightDiffCallback

import com.example.android.trackmysleepquality.ViewHolder

import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter(val listener: SleepNightListener): ListAdapter<SleepNight, ViewHolder>(SleepNightDiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = getItem(position)
        holder.bind(listener, item)
    }



}



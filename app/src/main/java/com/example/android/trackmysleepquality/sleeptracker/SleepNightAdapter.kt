package com.example.android.trackmysleepquality.sleeptracker

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.trackmysleepquality.R

import com.example.android.trackmysleepquality.ViewHolder
import com.example.android.trackmysleepquality.convertDurationToFormatted
import com.example.android.trackmysleepquality.convertNumericQualityToString
import com.example.android.trackmysleepquality.database.SleepNight

class SleepNightAdapter: RecyclerView.Adapter<ViewHolder>(){
    var data = listOf<SleepNight>()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater  = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item_view, parent,false )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = data[position]
        val res = holder.itemView.context.resources

        holder.sleepLength.text = convertNumericQualityToString(item.seepQuality,res)
        holder.sleepQuality.text = convertDurationToFormatted(item.startTimeMilli, item.endTimeMilli, res)

        holder.qualityImage.setImageResource(when (item.seepQuality) {
            0-> R.drawable.ic_sleep_0
            1->R.drawable.ic_sleep_1
            2->R.drawable.ic_sleep_2
            3->R.drawable.ic_sleep_3
            4->R.drawable.ic_sleep_4
            5->R.drawable.ic_sleep_5
            else->R.drawable.ic_launcher_sleep_tracker_background
        })
    }

    override fun getItemCount(): Int {
        return data.size
    }
}



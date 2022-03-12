package com.example.android.trackmysleepquality.sleeptracker

import com.example.android.trackmysleepquality.database.SleepNight


class SleepNightListener(val clickListener: (sleepId : Long) -> Unit) {
    //Unit type with only one value. This corresponds to void in java

    fun onClick(night: SleepNight) = clickListener(night.nightId)
}
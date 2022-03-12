package com.example.android.trackmysleepquality.sleepdetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.trackmysleepquality.database.SleepDatabaseDao

class SleepDetailViewModelFactory (private val sleepNightKey: Long,
                                   private val sleepDatabaseDao: SleepDatabaseDao
) :
    ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SleepDetailViewModel::class.java)) {
            return SleepDetailViewModel(sleepNightKey, sleepDatabaseDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
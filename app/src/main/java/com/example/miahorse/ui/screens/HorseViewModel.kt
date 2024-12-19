package com.example.miahorse.ui.screens

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.miahorse.network.HorseApi
import com.example.miahorse.network.HorseApiService
import com.example.miahorse.network.data.ImgSrc
import kotlinx.coroutines.launch
import timber.log.Timber
import java.io.IOException

class HorseViewModel: ViewModel() {

    init {
        getHorses()
    }

    fun getHorses() {
        viewModelScope.launch {
            try {
                val list = HorseApi.horseApiService.getPhotos()
                Timber.d("url:" + list.horseList[0].imgSrc.url)
            } catch (e: IOException) {

            }
        }
    }
}
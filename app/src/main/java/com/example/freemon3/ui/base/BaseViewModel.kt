package com.example.freemon3.ui.base

import androidx.lifecycle.ViewModel
import com.example.freemon3.core.base.BaseRepository

abstract class BaseViewModel(private val repository: BaseRepository) :ViewModel()
{
    //suspend fun logout(api:UserApi) = repository.logout(api)
}

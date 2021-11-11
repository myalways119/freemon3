package com.example.freemon3.ui.intro

import android.app.Activity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.freemon3.core.base.ResponseItem
import com.example.freemon3.core.repository.IntroRepository
import com.example.freemon3.ui.base.BaseViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class IntroViewModel(private val repository: IntroRepository) : BaseViewModel(repository)
{
    private val _startActivity = MutableLiveData<ResponseItem<Activity>>()
    val startActivity:LiveData<ResponseItem<Activity>> get() = _startActivity

    fun loadData() = viewModelScope.launch(Dispatchers.IO) {
        _startActivity.value = ResponseItem.Loading //Nothing으로 초기화
        _startActivity.postValue = IntroRepository.
    }
}

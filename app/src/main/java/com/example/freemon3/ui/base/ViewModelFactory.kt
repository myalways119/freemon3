package com.example.freemon3.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.freemon3.core.base.BaseRepository
import com.example.freemon3.ui.intro.IntroViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory( private val repository: BaseRepository) : ViewModelProvider.NewInstanceFactory()
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T
    {
        return when {
            modelClass.isAssignableFrom(IntroViewModel::class.java) -> IntroViewModel(repository as AuthRepository) as T
            //modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(repository as UserRepository) as T
            else -> throw IllegalAccessException("ViewModelClass Not Found")
        }
    }
}
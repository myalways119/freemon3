package com.example.freemon3.core.repository

import com.example.freemon3.core.api.IntroApi
import com.example.freemon3.core.base.BaseRepository

class IntroRepository(private val api: IntroApi, private val preferences: UserPreferences) : BaseRepository()
}
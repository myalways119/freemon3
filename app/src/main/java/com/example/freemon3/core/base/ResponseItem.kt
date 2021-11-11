package com.example.freemon3.core.base

import okhttp3.ResponseBody

//Network api
sealed class ResponseItem<out T>
{
    data class Success<out T>(val value: T) : ResponseItem<T>()

    data class Failure(
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorBody: ResponseBody?
    ):ResponseItem<Nothing>()

    object Loading:ResponseItem<Nothing>()
}
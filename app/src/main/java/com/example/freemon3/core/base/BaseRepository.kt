package com.example.freemon3.core.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException

abstract class BaseRepository
{
    suspend fun <T> safeApiCall(apiCall:suspend ()->T):ResponseItem<T>
    {
        return withContext(Dispatchers.IO){
            try
            {
                ResponseItem.Success(apiCall.invoke())
            }catch (throwable:Throwable)
            {
                when(throwable){
                    is HttpException->{
                        ResponseItem.Failure(true,throwable.code(), throwable.response()?.errorBody())
                    }
                    else ->{
                        ResponseItem.Failure(true,null,null)
                    }
                }
            }
        }
    }
    
    //추후에 필요하다면 각 화면에서 로그아웃 가능하게 하면 될듯
    //suspend fun logout(api:UserApi) = safeApiCall{api.logout()}
}
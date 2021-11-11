package com.example.freemon3.core.api

import com.example.freemon3.core.model.UserItem
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface IntroApi {
    @FormUrlEncoded
    @POST("CommonApi.php")
    suspend fun SelectUserInfo(
        @Field("action") action: String,
        @Field("phone_no") phone_no: String
    ): UserItem
}
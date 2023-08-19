package com.example.mvvmdemo.retrofit

import com.example.mvvmdemo.dataModel.CreditCard
import retrofit2.http.GET

interface CreditCardService {
    @GET("credit_cards")
    suspend fun getCreditCards(): List<CreditCard>
}
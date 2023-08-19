package com.example.mvvmdemo.repository

import com.example.mvvmdemo.dataModel.CreditCard
import com.example.mvvmdemo.retrofit.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): List<CreditCard> {
        return creditCardService.getCreditCards()
    }
}
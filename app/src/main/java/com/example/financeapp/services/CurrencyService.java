package com.example.financeapp.services;

import com.example.financeapp.models.Currency;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyService {

    @GET("symbols")
    Call<List<Currency>> getCurrencies();
}

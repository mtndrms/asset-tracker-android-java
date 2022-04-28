package com.example.financeapp.services;

import com.example.financeapp.models.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {
    @GET("users/{username}")
    Call<User> getUserByUsername(@Path("username") String username);
}

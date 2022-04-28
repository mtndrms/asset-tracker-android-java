package com.example.financeapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.financeapp.api.ApiClient;
import com.example.financeapp.constants.Constants;
import com.example.financeapp.models.User;
import com.example.financeapp.services.UserService;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btLoginButton = findViewById(R.id.btLogin);
        TextInputEditText tfUsername = findViewById(R.id.tfUsername);
        TextInputEditText tfPassword = findViewById(R.id.tfPassword);

        UserService userService = ApiClient.getInstance(Constants.baseUrlDatabase).create(UserService.class);

        btLoginButton.setOnClickListener(view -> {
            System.out.println(ApiClient.getInstance(Constants.baseUrlDatabase));
            System.out.println(ApiClient.getInstance(Constants.baseUrlDatabase));
            String usernameGiven = Objects.requireNonNull(tfUsername.getText()).toString();
            String passwordGiven = Objects.requireNonNull(tfPassword.getText()).toString();
            Call<User> user = userService.getUserByUsername(usernameGiven);
            user.enqueue(new Callback<User>() {
                @Override
                public void onResponse(@NonNull Call<User> call, @NonNull Response<User> response) {
                    User userFromDatabase = response.body();
                    System.out.println(userFromDatabase);
                    assert userFromDatabase != null;
                    if (userFromDatabase.getUsername().equals(usernameGiven) && userFromDatabase.getPassword().equals(passwordGiven)) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong username or password!", Toast.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<User> call, @NonNull Throwable t) {
                    Toast.makeText(getApplicationContext(), "Wrong username or password!", Toast.LENGTH_LONG).show();
                }
            });
        });
    }
}
package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private void changeFragment(MarketFragment marketFragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, marketFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void changeFragment(ConverterFragment converterFragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, converterFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void changeFragment(ProfileFragment profileFragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, profileFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarketFragment marketFragment = new MarketFragment();
        ConverterFragment converterFragment = new ConverterFragment();
        ProfileFragment profileFragment = new ProfileFragment();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bnbBottomNavigationBar);
        MaterialToolbar topAppBar = findViewById(R.id.topAppBar);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.market) {
                topAppBar.setTitle(R.string.market_all_caps);
                changeFragment(marketFragment);
                return true;
            } else if (itemId == R.id.converter) {
                topAppBar.setTitle(R.string.converter_all_caps);
                changeFragment(converterFragment);
                return true;
            } else if (itemId == R.id.profile) {
                topAppBar.setTitle(R.string.profile_all_caps);
                changeFragment(profileFragment);
                return true;
            }
            return false;
        });
    }
}
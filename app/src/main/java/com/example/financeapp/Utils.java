package com.example.financeapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    public static Map<String, String> currenciesMap() {
        final Map<String, String> currencies = new HashMap<>();
        currencies.put("AED", "United Arab Emirates Dirham");
        currencies.put("CAD", "Canadian Dollar");
        currencies.put("CNY", "Chinese Yuan");
        currencies.put("CZK", "Czech Republic Koruna");
        currencies.put("DKK", "Danish Krone");
        currencies.put("EUR", "Euro");
        currencies.put("GBP", "British Pound Sterling");
        currencies.put("ILS", "Israeli New Sheqel");
        currencies.put("INR", "Indian Rupee");
        currencies.put("JPY", "Japanese Yen");
        currencies.put("KRW", "South Korean Won");
        currencies.put("MXN", "Mexican Peso");
        currencies.put("NOK", "Norwegian Krone");
        currencies.put("NZD", "New Zealand Dollar");
        currencies.put("PLN", "Polish Zloty");
        currencies.put("RUB", "Russian Ruble");
        currencies.put("SAR", "Saudi Riyal");
        currencies.put("SEK", "Swedish Krona");
        currencies.put("TRY", "Turkish Lira");
        currencies.put("USD", "United States Dollar");
        currencies.put("ZAR", "South African Rand");
        return currencies;
    }

    public static List<String> currenciesList() {
        List<String> currencies = new ArrayList<>();
        currencies.add("AED - United Arab Emirates Dirham");
        currencies.add("CAD - Canadian Dollar");
        currencies.add("CNY - Chinese Yuan");
        currencies.add("CZK - Czech Republic Koruna");
        currencies.add("DKK - Danish Krone");
        currencies.add("EUR - Euro");
        currencies.add("GBP - British Pound Sterling");
        currencies.add("ILS - Israeli New Sheqel");
        currencies.add("INR - Indian Rupee");
        currencies.add("JPY - Japanese Yen");
        currencies.add("KRW - South Korean Won");
        currencies.add("MXN - Mexican Peso");
        currencies.add("NOK - Norwegian Krone");
        currencies.add("NZD - New Zealand Dollar");
        currencies.add("PLN - Polish Zloty");
        currencies.add("RUB - Russian Ruble");
        currencies.add("SAR - Saudi Riyal");
        currencies.add("SEK - Swedish Krona");
        currencies.add("TRY - Turkish Lira");
        currencies.add("USD - United States Dollar");
        currencies.add("ZAR - South African Rand");
        return currencies;
    }
}

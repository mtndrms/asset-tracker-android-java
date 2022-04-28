package com.example.financeapp.models;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Currency {
    private String description;
    private String code;

    public Currency() {
    }

    public Currency(String description, String code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return Objects.equals(description, currency.description) && Objects.equals(code, currency.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, code);
    }

    @NonNull
    @Override
    public String toString() {
        return "Currency{" +
                "description='" + description + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

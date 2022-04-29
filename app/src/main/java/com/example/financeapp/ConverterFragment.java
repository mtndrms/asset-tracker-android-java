package com.example.financeapp;

import static com.example.financeapp.Utils.*;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ConverterFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_converter, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout changeSides = view.findViewById(R.id.llChangeSides);
        Spinner spinnerFrom = (Spinner) view.findViewById(R.id.spFrom);
        Spinner spinnerTo = (Spinner) view.findViewById(R.id.spTo);

        spinnerFrom.setOnItemSelectedListener(this);
        spinnerTo.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(getContext(),android.R.layout.simple_spinner_item, currenciesList());
        aa.setDropDownViewResource(R.layout.dropdown_item);
        spinnerFrom.setAdapter(aa);
        spinnerTo.setAdapter(aa);

        changeSides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("TEST");
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if ((TextView) view != null) {
            ((TextView) view).setTextColor(getResources().getColor(R.color.spinner_selected_color));
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
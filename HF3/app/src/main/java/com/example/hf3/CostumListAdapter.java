package com.example.hf3;

import androidx.annotation.NonNull;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

public class CostumListAdapter extends ArrayAdapter {


    private final Activity context;

    private final Integer[] imageIDarray;

    private final String[] countryCourrency;

    private final String[] currencyDescription;

    private final String[] buySell;

    private final String[] selling;

    private final String[] buying;

    public CostumListAdapter(@NonNull Context context, int resource, Activity context1, Integer[] imageIDarray, String[] countryCourrency, String[] currencyDescription, String[] buySell, String[] selling, String[] buying) {
        super(context, resource);
        this.context = context1;
        this.imageIDarray = imageIDarray;
        this.countryCourrency = countryCourrency;
        this.currencyDescription = currencyDescription;
        this.buySell = buySell;
        this.selling = selling;
        this.buying = buying;
    }


}
package com.example.hf3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String[] nameArray = {"EUR", "USD", "GPB", "AUD", "CAD", "CHF", "DKK", "HUF"};

    String[] infoArray = {"Euro", "Dolar american", "Lira sterliana", "Dolar australian", "Dolar canadian", "Franc elvetian", "Corona daneza", "Forint maghiar"};

    String[] buyingArray = {"4,4100", "3,9750", "6,1250", "2,9600", "3,0950", "4,2300", "0,5850", "0,0136"};

    String[] sellingArray = {"4,5500", "3,9750", "6,3550", "3,0600", "3,2650", "4,3300", "0,6150", "0,0146"};

    Integer[] imageArray = {
      R.drawable.euro, R.drawable.usa, R.drawable.uk, R.drawable.australia, R.drawable.canada, R.drawable.switzerland, R.drawable.denmark, R.drawable.hungary
    };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter customListAdapter = new CustomListAdapter(this, imageArray, nameArray, infoArray, buyingArray, sellingArray);
        listView = (ListView) findViewById(R.id.listviewID);
        listView.setAdapter(customListAdapter);

    }
}
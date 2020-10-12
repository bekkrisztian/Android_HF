package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText number1 = (EditText) findViewById(R.id.szam1);
        final EditText number2 = (EditText) findViewById(R.id.szam2);

        Button add = (Button) findViewById(R.id.add);
        Button subtract = (Button) findViewById(R.id.subtract);
        Button multiply = (Button) findViewById(R.id.multiply);
        Button division = (Button) findViewById(R.id.division);

        final TextView result = (TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(number1.getText().toString());
                float n2 = Float.parseFloat(number2.getText().toString());

                float sum = n1 + n2;

                result.setText("Eredmeny: " + sum);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(number1.getText().toString());
                float n2 = Float.parseFloat(number2.getText().toString());

                float sum = n1 - n2;

                result.setText("Eredmeny: " + sum);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(number1.getText().toString());
                float n2 = Float.parseFloat(number2.getText().toString());

                float sum = n1 * n2;

                result.setText("Eredmeny: " + sum);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1 = Float.parseFloat(number1.getText().toString());
                float n2 = Float.parseFloat(number2.getText().toString());

                float sum = n1 / n2;

                result.setText("Eredmeny: " + sum);
            }
        });

    }
}
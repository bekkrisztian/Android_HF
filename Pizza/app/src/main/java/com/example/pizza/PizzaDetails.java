package com.example.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class PizzaDetails extends AppCompatActivity {

    public static final String PIZZA = "PIZZA";
    private Pizza pizza;
    private ImageView kep;
    private TextView nev;
    private RadioGroup meretek;
    private RadioButton meretKicsi;
    private RadioButton meretKozepes;
    private RadioButton meretNagy;
    private TextView kicsiAr;
    private TextView nagyAr;
    private TextView kozepesAr;
    private CheckBox feltet1;
    private CheckBox feltet2;
    private CheckBox feltet3;
    private TextView feltet1ar;
    private TextView feltet2ar;
    private TextView feltet3ar;
    private TextView osszar;
    private Button rendel;
    private int ar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_details);

        kep = (ImageView) findViewById(R.id.imageView3);
        nev = (TextView) findViewById(R.id.textView5);
        kicsiAr = (TextView) findViewById(R.id.textView6);
        kozepesAr = (TextView) findViewById(R.id.textView7);
        nagyAr = (TextView) findViewById(R.id.textView8);
        meretek = (RadioGroup) findViewById(R.id.radioGroup);
        meretKicsi = (RadioButton) findViewById(R.id.radioButton6);
        meretKozepes = (RadioButton) findViewById(R.id.radioButton5);
        meretNagy = (RadioButton) findViewById(R.id.radioButton4);
        feltet1 = (CheckBox) findViewById(R.id.checkBox);
        feltet2 = (CheckBox) findViewById(R.id.checkBox2);
        feltet3 = (CheckBox) findViewById(R.id.checkBox3);
        feltet1ar = (TextView) findViewById(R.id.textView9);
        feltet2ar = (TextView) findViewById(R.id.textView10);
        feltet3ar = (TextView) findViewById(R.id.textView11);
        osszar = (TextView) findViewById(R.id.textView13);
        rendel = (Button) findViewById(R.id.button2);

        NumberFormat nf = NumberFormat.getNumberInstance();

        pizza = (Pizza)getIntent().getExtras().getSerializable(PIZZA);

        kep.setImageResource(pizza.getImage());
        nev.setText(pizza.getNev());
        meretKicsi.setText(pizza.getKicsi());
        kicsiAr.setText(nf.format(pizza.getKicsiAr()));
        meretKozepes.setText(pizza.getKozopes());
        kozepesAr.setText(nf.format(pizza.getKozepesAr()));
        meretNagy.setText(pizza.getNagy());
        nagyAr.setText(nf.format(pizza.getNagyAr()));
        feltet1.setText(pizza.getFeltet1());
        feltet1ar.setText(nf.format(pizza.getFeltet1Ar()));
        feltet2.setText(pizza.getFeltet2());
        feltet2ar.setText(nf.format(pizza.getFeltet2Ar()));
        feltet3.setText(pizza.getFeltet3());
        feltet3ar.setText(nf.format(pizza.getFeltet3Ar()));


        meretek.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(meretKicsi.isChecked()) {
                    ar = pizza.getKicsiAr();
                    feltet1.setChecked(false);
                    feltet2.setChecked(false);
                    feltet3.setChecked(false);
                    osszar.setText(nf.format(pizza.getKicsiAr()));
                }
                else if(meretKozepes.isChecked()) {
                    ar = pizza.getKozepesAr();
                    feltet1.setChecked(false);
                    feltet2.setChecked(false);
                    feltet3.setChecked(false);
                    osszar.setText(nf.format(pizza.getKozepesAr()));
                }
                else if(meretNagy.isChecked()) {
                    ar = pizza.getNagyAr();
                    feltet1.setChecked(false);
                    feltet2.setChecked(false);
                    feltet3.setChecked(false);
                    osszar.setText(nf.format(pizza.getNagyAr()));
                }
            }
        });


        if(meretek.getCheckedRadioButtonId() == -1 ) {
            Toast.makeText(this, "Először válassz pizzát!", Toast.LENGTH_SHORT).show();
        }
        feltet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(feltet1.isChecked()) {
                    int fAr = pizza.getFeltet1Ar();
                    ar += fAr;
                    osszar.setText(nf.format(ar));
                } else {
                    int fAr = pizza.getFeltet1Ar();
                    ar -= fAr;
                    osszar.setText(nf.format(ar));
                }
            }
        });
        feltet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (feltet2.isChecked()) {
                    int fAr = pizza.getFeltet2Ar();
                    ar += fAr;
                    osszar.setText(nf.format(ar));
                } else {
                    int fAr = pizza.getFeltet2Ar();
                    ar -= fAr;
                    osszar.setText(nf.format(ar));
                }
            }
        });
        feltet3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(feltet3.isChecked()) {
                    int fAr = pizza.getFeltet3Ar();
                    ar += fAr;
                    osszar.setText(nf.format(ar));
                } else {
                    int fAr = pizza.getFeltet3Ar();
                    ar -= fAr;
                    osszar.setText(nf.format(ar));
                }
            }
        });
    }
}
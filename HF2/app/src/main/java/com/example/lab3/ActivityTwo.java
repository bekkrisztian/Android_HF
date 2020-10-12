package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        final EditText email = findViewById(R.id.email);
        email.setText(getIntent().getStringExtra("email"));

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("admin@gmail.com")) {
                    Intent intent = new Intent(getApplicationContext(), ActivityThree.class);
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "Nem egyezik az email!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
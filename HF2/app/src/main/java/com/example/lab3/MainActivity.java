package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("admin@gmail.com") && password.getText().toString().equals("root")) {

                    Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
                    intent.putExtra("email", email.getText().toString());
                    startActivity(intent);
                } else {
                    String text = "Helytelen inputok!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast.makeText(getApplicationContext(), text, duration).show();
                }

            }
        });
    }
}
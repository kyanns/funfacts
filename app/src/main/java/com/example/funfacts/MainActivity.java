package com.example.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowNewFact();
            }
        });
    }

    public void ShowNewFact(){
        String[] funfacts = {"Billie eilish overrated","My dad works in IT",
                "No one wants to buy alex's black yeezys",
                "My sisters boxbraids smell weird af",
                "travis scott overrated" +
                        "i exist" +
                        "my mom is a stay at home mom lolz" +
                        "my house is 3000 sq ft" +
                        "I want dreads or waves" +
                        "My mom is cool i guess"
        };

        Random random = new Random();
        int Randomnumber = random.nextInt(funfacts.length);
        textView.setText(funfacts[Randomnumber]);
    }
}


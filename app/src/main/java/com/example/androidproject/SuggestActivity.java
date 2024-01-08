package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;

public class SuggestActivity extends AppCompatActivity {
    TextToSpeech t1;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggest);
        btnBack=findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic1
                getOnBackPressedDispatcher().onBackPressed();
            }
        });
    }
}
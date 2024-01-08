package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class DetailsActivity extends AppCompatActivity {
    MaterialButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_detail);
        btnBack.findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            setContentView(R.layout.course_main);
        });
    }
}
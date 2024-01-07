package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    MaterialButton btnBack;
    ImageButton topic1,topic2,topic3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_main);
       topic1=findViewById(R.id.Topic1);
       topic2=findViewById(R.id.Topic2);
       topic3=findViewById(R.id.Topic3);
        topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic1
                TextView textview=findViewById(R.id.topicName);
                textview.setText("Giới thiệu bản thân");
                setContentView(R.layout.course_detail);
            }
        });
        topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic2
                TextView textview=findViewById(R.id.topicName);
                textview.setText("Môn học yêu thích");
                setContentView(R.layout.course_detail);
            }
        });
        topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic3
                TextView textview=findViewById(R.id.topicName);
                textview.setText("Làm gì trong tg rảnh ?");
                setContentView(R.layout.course_detail);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOnBackPressedDispatcher().onBackPressed();
            }
        });
    }

}
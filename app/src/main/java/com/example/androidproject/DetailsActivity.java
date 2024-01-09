package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class DetailsActivity extends AppCompatActivity {
    Button btnBack;
    TextView topicName,topicRate,topicDescription,topicMission,topicMission_details;
    Button suggest, start;
    ImageView icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_detail);
        topicName=findViewById(R.id.topicName);
        topicRate=findViewById(R.id.topicRate);
        topicDescription=findViewById(R.id.topicDescription);
        topicMission=findViewById(R.id.topicMission);
        topicMission_details=findViewById(R.id.topicMission_details);
        btnBack=(Button) findViewById(R.id.btnBack);
        icon= findViewById(R.id.pic);
        topicName.setText(getIntent().getStringExtra("topicName"));
        topicRate.setText(getIntent().getStringExtra("topicRate"));
        topicDescription.setText(getIntent().getStringExtra("topicDescription"));
        topicMission.setText(getIntent().getStringExtra("topicMission"));
        topicMission_details.setText(getIntent().getStringExtra("topicMission_details"));
        switch(getIntent().getStringExtra("topicName"))
        {
            case "Giới thiệu bản thân":
                icon.setImageResource(R.drawable.self_introduce);
                break;
            case "Làm gì khi rảnh":
                icon.setImageResource(R.drawable.freetime_activity);
                break;
            case "Môn học yêu thích":
                icon.setImageResource(R.drawable.favorite_subject);
                break;
        }
        btnBack.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic1
                getOnBackPressedDispatcher().onBackPressed();
            }
        });
        suggest=findViewById(R.id.btnSuggest);
        suggest.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic1
                Intent i = new Intent(v.getContext(), SuggestActivity.class);
                startActivity(i);
            }
        });
    }
}
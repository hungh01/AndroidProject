package com.example.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CourseMainActivity extends AppCompatActivity {

    ImageButton topic1,topic2,topic3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_main);


       topic1=findViewById(R.id.Topic1);
       topic2=findViewById(R.id.Topic2);
       topic3=findViewById(R.id.Topic3);
        topic1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    //setting text on text view on course_detail layout for topic1
                    Intent i = new Intent(v.getContext(), DetailsActivity.class);
                   // TextView topic = findViewById(R.id.topicName);
                    //topic.setText("Giới thiệu bản thân");
                    i.putExtra("topicName","Giới thiệu bản thân");
                    i.putExtra("topicRate","4/5");
                    i.putExtra("topicDescription","Chi tiết của chủ đề");
                    i.putExtra("topicMission","Nhiệm vụ của chủ đề");
                    i.putExtra("topicMission_details","Chi tiết nhiệm vụ");
                    startActivity(i);

                }

        });
        topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic2
                Intent i = new Intent(v.getContext(), DetailsActivity.class);
                //TextView topic = findViewById(R.id.topicName);
                //topic.setText("Làm gì khi rảnh");
                i.putExtra("topicName","Làm gì khi rảnh");
                i.putExtra("topicRate","3/5");
                i.putExtra("topicDescription","Chi tiết của chủ đề");
                i.putExtra("topicMission","Nhiệm vụ của chủ đề");
                i.putExtra("topicMission_details","Chi tiết nhiệm vụ");
                startActivity(i);

            }
        });
        topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting text on text view on course_detail layout for topic3
                Intent i = new Intent(v.getContext(), DetailsActivity.class);
               // TextView topic = findViewById(R.id.topicName);
                //topic.setText("Môn học yêu thích");
                i.putExtra("topicName","Môn học yêu thích");
                i.putExtra("topicRate","5/5");
                i.putExtra("topicDescription","Chi tiết của chủ đề");
                i.putExtra("topicMission","Nhiệm vụ của chủ đề");
                i.putExtra("topicMission_details","Chi tiết nhiệm vụ");
                startActivity(i);
            }
        });

    }

}
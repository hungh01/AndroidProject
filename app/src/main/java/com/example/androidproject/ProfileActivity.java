package com.example.androidproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class ProfileActivity extends AppCompatActivity {

    private ImageView avatarImageView;
    private TextView nameTextView, titleTextView, descriptionTextView, emailTextView, phoneTextView, addressTextView, pronunciationTextView;
    private Button experienceButton, top3Button;
    private SeekBar comparisonSeekBar;
    private TextView goodSoundsTextView, improvementSoundsTextView, percentageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Tham chiếu các thành phần giao diện
        avatarImageView = findViewById(R.id.avatarImageView);
        nameTextView = findViewById(R.id.nameTextView);
        titleTextView = findViewById(R.id.titleTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        emailTextView = findViewById(R.id.emailTextView);
        phoneTextView = findViewById(R.id.phoneTextView);
        addressTextView = findViewById(R.id.addressTextView);
        pronunciationTextView = findViewById(R.id.pronunciationTextView);
        experienceButton = findViewById(R.id.experienceButton);
        top3Button = findViewById(R.id.top3Button);
        comparisonSeekBar = findViewById(R.id.comparisonSeekBar);
        goodSoundsTextView = findViewById(R.id.goodSoundsTextView);
        improvementSoundsTextView = findViewById(R.id.improvementSoundsTextView);
        percentageTextView = findViewById(R.id.percentageTextView);

        // Lấy dữ liệu từ Activity
        String name = "Nguyen Trong Thuy";
        String title = "Ngươời dùng";
        String description = "Hòa đồng, vui vẻ";
        String email = "thuy@gmail.com";
        String phone = "Phone: 123-456-7890";
        String address = "Address: 123 Main Street, City, Country";

        HashMap<String, Double> goodSoundsEvaluationMap = new HashMap<>();
        goodSoundsEvaluationMap.put("æ", 80.0);
        goodSoundsEvaluationMap.put("ɑ", 90.5);
        goodSoundsEvaluationMap.put("ɛ", 75.2);

        HashMap<String, Double> improvementSoundsEvaluationMap = new HashMap<>();
        improvementSoundsEvaluationMap.put("i", 55.6);
        improvementSoundsEvaluationMap.put("ʊ", 60.1);
        improvementSoundsEvaluationMap.put("θ", 33.4);
        String pronunciation = "[ngʊjən trɔŋ tʰwi]";
        int experiencePoints = 1000;
        int top3Count = 5;
        int progress = 75; // Giá trị phần trăm (0-100) mà bạn muốn hiển thị

        // Thiết lập nội dung cho các thành phần giao diện
        avatarImageView.setImageResource(R.drawable.lmht);
        nameTextView.setText(name);
        titleTextView.setText(title);
        descriptionTextView.setText(description);
        emailTextView.setText(email);
        phoneTextView.setText(phone);
        addressTextView.setText(address);
        pronunciationTextView.setText("Pronunciation: " + pronunciation);
        experienceButton.setText("Experience: " + experiencePoints + " points");
        top3Button.setText("Top 3: " + top3Count + " times");
        comparisonSeekBar.setProgress(progress);
        percentageTextView.setText("Đánh giá theo phần trăm: " + progress + "%");
        goodSoundsTextView.setText("Các âm làm tốt:\n" + getSoundList(goodSoundsEvaluationMap));
        improvementSoundsTextView.setText("Các âm cần cải thiện:\n" + getSoundList(improvementSoundsEvaluationMap));

    }

    //  chuyển đổi mảng âm thành một chuỗi danh sách
    private String getSoundList(HashMap<String, Double> soundEvaluationMap) {
        StringBuilder soundList = new StringBuilder();
        for (Map.Entry<String, Double> entry : soundEvaluationMap.entrySet()) {
            String sound = entry.getKey();
            Double evaluation = entry.getValue();
            soundList.append(sound).append(" - ").append(evaluation).append("%");
            soundList.append("\n");
        }
        return soundList.toString();
    }
}
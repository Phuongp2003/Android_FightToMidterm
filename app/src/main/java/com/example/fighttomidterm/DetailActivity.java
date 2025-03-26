package com.example.fighttomidterm;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResId = getIntent().getIntExtra("imageResId", -1);

        TextView titleView = findViewById(R.id.titleView);
        TextView descriptionView = findViewById(R.id.descriptionView);
        ImageView imageView = findViewById(R.id.imageView);

        titleView.setText(title);
        descriptionView.setText(description);

        if (imageResId != -1) {
            imageView.setImageResource(imageResId);
        }
    }
}
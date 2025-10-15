package com.example.gk;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private TextView btnBack, tvProfileName, tvFriends, tvFollowers;
    private ImageView ivProfile, btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize views
        btnBack = findViewById(R.id.btnBack);
        tvProfileName = findViewById(R.id.tvProfileName);
        tvFriends = findViewById(R.id.tvFriends);
        tvFollowers = findViewById(R.id.tvFollowers);
        ivProfile = findViewById(R.id.ivProfile);
        btnSettings = findViewById(R.id.btnSettings);

        // Get username from intent
        String username = getIntent().getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            tvProfileName.setText(username);
        }

        // Back button click
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Settings button click
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "Settings clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
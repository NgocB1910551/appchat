package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityWatchPostBinding;

public class WatchPostActivity extends AppCompatActivity {

    private ActivityWatchPostBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWatchPostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.Post.setOnClickListener(v ->
                startActivity(new Intent(getApplicationContext(), PostActivity.class)));
    }
}
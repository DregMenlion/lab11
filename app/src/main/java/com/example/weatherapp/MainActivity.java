package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Задержка 3 секунды
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, CitySelectionActivity.class);
            startActivity(intent);
            finish();
        }, 3000);
    }
}

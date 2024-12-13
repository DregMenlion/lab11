package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CitySelectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_selection);

        // Привязываем кнопки для каждого города
        findViewById(R.id.buttonMoscow).setOnClickListener(v -> openWeatherActivity("Москва"));
        findViewById(R.id.buttonBorisoglebsk).setOnClickListener(v -> openWeatherActivity("Борисоглебск"));
        findViewById(R.id.buttonVolgograd).setOnClickListener(v -> openWeatherActivity("Волгоград"));
        findViewById(R.id.buttonVoronezh).setOnClickListener(v -> openWeatherActivity("Воронеж"));
        findViewById(R.id.buttonTambov).setOnClickListener(v -> openWeatherActivity("Тамбов"));
        findViewById(R.id.buttonSaratov).setOnClickListener(v -> openWeatherActivity("Саратов"));
    }

    private void openWeatherActivity(String city) {
        Intent intent = new Intent(CitySelectionActivity.this, WeatherDetailsActivity.class);
        intent.putExtra("CITY_NAME", city);
        startActivity(intent);
    }
}
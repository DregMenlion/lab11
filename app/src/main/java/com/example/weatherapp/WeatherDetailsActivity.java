package com.example.weatherapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WeatherDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_details);

        // Получаем название города
        String cityName = getIntent().getStringExtra("CITY_NAME");

        // Привязываем элементы интерфейса
        TextView cityNameTextView = findViewById(R.id.cityName);
        ImageView weatherIcon = findViewById(R.id.weatherIcon);
        TextView weatherDescription = findViewById(R.id.weatherDescription);
        TextView temperatureTextView = findViewById(R.id.temperature);
        TextView feelsLikeTextView = findViewById(R.id.feelsLike);
        TextView morningTempTextView = findViewById(R.id.morningTemp);
        TextView dayTempTextView = findViewById(R.id.dayTemp);
        TextView nightTempTextView = findViewById(R.id.nightTemp);

        // Устанавливаем данные для каждого города
        switch (cityName) {
            case "Москва":
                setWeatherData(cityName, "15°C", "ощущается как 12°C", "Утро: 7°C", "День: 15°C", "Ночь: 8°C", "Дождь", R.drawable.rainy);
                break;
            case "Борисоглебск":
                setWeatherData(cityName, "20°C", "ощущается как 22°C", "Утро: 12°C", "День: 21°C", "Ночь: 11°C", "Переменная облачность", R.drawable.partly_cloudy);
                break;
            case "Волгоград":
                setWeatherData(cityName, "17°C", "ощущается как 22°C", "Утро: 10°C", "День: 17°C", "Ночь: 11°C", "Ливни с грозами", R.drawable.thunderstorm);
                break;
            case "Воронеж":
                setWeatherData(cityName, "21°C", "ощущается как 22°C", "Утро: 14°C", "День: 21°C", "Ночь: 15°C", "Переменная облачность", R.drawable.partly_cloudy);
                break;
            case "Тамбов":
                setWeatherData(cityName, "16°C", "ощущается как 22°C", "Утро: 9°C", "День: 16°C", "Ночь: 10°C", "Облачно", R.drawable.cloudy);
                break;
            case "Саратов":
                setWeatherData(cityName, "25°C", "ощущается как 22°C", "Утро: 17°C", "День: 27°C", "Ночь: 18°C", "Солнечно", R.drawable.sunny);
                break;
            default:
                setWeatherData(cityName, "Неизвестно", "Неизвестно", "Неизвестно", "Неизвестно", "Неизвестно", "Неизвестно", R.drawable.unknown);
        }
        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(v -> finish());
    }

    private void setWeatherData(String cityName, String temperature, String feelsLike, String morningTemp, String dayTemp, String nightTemp, String description, int iconResId) {
        TextView cityNameTextView = findViewById(R.id.cityName);
        ImageView weatherIcon = findViewById(R.id.weatherIcon);
        TextView weatherDescription = findViewById(R.id.weatherDescription);
        TextView temperatureTextView = findViewById(R.id.temperature);
        TextView feelsLikeTextView = findViewById(R.id.feelsLike);
        TextView morningTempTextView = findViewById(R.id.morningTemp);
        TextView dayTempTextView = findViewById(R.id.dayTemp);
        TextView nightTempTextView = findViewById(R.id.nightTemp);

        cityNameTextView.setText(cityName);
        weatherIcon.setImageResource(iconResId);
        weatherDescription.setText(description);
        temperatureTextView.setText(temperature);
        feelsLikeTextView.setText(feelsLike);
        morningTempTextView.setText(morningTemp);
        dayTempTextView.setText(dayTemp);
        nightTempTextView.setText(nightTemp);
    }
}

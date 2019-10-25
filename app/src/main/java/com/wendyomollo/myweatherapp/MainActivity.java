package com.wendyomollo.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.wendyomollo.myweatherapp.BuildConfig.APPID;
import static com.wendyomollo.myweatherapp.Constants.BASE_URL;
import static com.wendyomollo.myweatherapp.Constants.WEATHER_API_KEY;

public class MainActivity extends AppCompatActivity {

    public static String BaseUrl = BASE_URL;
    public static String AppId = WEATHER_API_KEY;
    private Button mSearchCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchCity = findViewById(R.id.buttonSearch);
        mSearchCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateCity();
            }
        });


    }
}

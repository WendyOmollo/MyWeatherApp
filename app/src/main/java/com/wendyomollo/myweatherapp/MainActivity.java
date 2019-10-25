package com.wendyomollo.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.wendyomollo.myweatherapp.BuildConfig.APPID;
import static com.wendyomollo.myweatherapp.Constants.BASE_URL;
import static com.wendyomollo.myweatherapp.Constants.WEATHER_API_KEY;

public class MainActivity extends AppCompatActivity {

    public static String BaseUrl = BASE_URL;
    public static String AppId = WEATHER_API_KEY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}

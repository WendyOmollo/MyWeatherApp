package com.wendyomollo.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wendyomollo.myweatherapp.WeatherResponse.WeatherResponse;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.wendyomollo.myweatherapp.BuildConfig.APPID;
import static com.wendyomollo.myweatherapp.Constants.BASE_URL;
import static com.wendyomollo.myweatherapp.Constants.WEATHER_API_KEY;

public class MainActivity extends AppCompatActivity {

    public static String BaseUrl = BASE_URL;
    public static String AppId = WEATHER_API_KEY;
    private Button mSearchCity;
    public String main = "Kenya";
    public String description = "Few clouds, a little sun";

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

           void generateCity(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherResponse response = retrofit.create(WeatherResponse.class);

           }
}

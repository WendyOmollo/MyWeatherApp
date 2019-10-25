package com.wendyomollo.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Button;

import android.widget.TextView;

import com.wendyomollo.myweatherapp.WeatherResponse.WeatherResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import static com.wendyomollo.myweatherapp.Constants.BASE_URL;
import static com.wendyomollo.myweatherapp.Constants.WEATHER_API_KEY;

public class MainActivity extends AppCompatActivity {

    public static String BaseUrl = "http://api.openweathermap.org/";
    public static String AppId = "ce27d6b3019108ce97ed883ce0ef5693";
    private Button mSearchCity;
    private TextView mTextView;
    public static String lat = "35";
    public static String lon = "139";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.dataTextView);
        mSearchCity = findViewById(R.id.buttonSearch);
        mSearchCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateCity();
            }
        });
    }

         public  void generateCity(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherService service = retrofit.create(WeatherService.class);
        Call<WeatherResponse> call = service.getCurrentWeatherData(lat,lon,AppId);
        call.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if(response.code() == 200){

                    WeatherResponse weatherResponse = response.body();
                    assert weatherResponse!=null;

                    String stringBuilder ="Country: " +
                            weatherResponse.sys.country +
                            "\n" +
                            "Temperature: " +
                            weatherResponse.main.temp +
                            "\n" +
                            "Temperature(Min): " +
                            weatherResponse.main.temp_min +
                            "\n" +
                            "Temperature(Max): " +
                            weatherResponse.main.temp_max +
                            "\n" +
                            "Humidity: " +
                            weatherResponse.main.humidity +
                            "\n" +
                            "Pressure: " +
                            weatherResponse.main.pressure;

                    mTextView.setText(stringBuilder);
                }

            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                mTextView.setText(t.getMessage());
                Log.d("Amazing","Incredible");
            }
        });

           }
}

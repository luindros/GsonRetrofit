package com.luindros.jsonretrofit.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.luindros.jsonretrofit.API.APIServices.WeatherService;
import com.luindros.jsonretrofit.API.Api;
import com.luindros.jsonretrofit.Model.City;
import com.luindros.jsonretrofit.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherService weatherService= Api.getApi().create(WeatherService.class);
        Call<City> cityCall= weatherService.getCityCelsius("London", Api.APPKEY, "metric");

        cityCall.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                City city=response.body();
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Error", Toast.LENGTH_LONG).show();
            }
        });

    }
}

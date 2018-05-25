package com.luindros.jsonretrofit.API.APIServices;

import com.luindros.jsonretrofit.Model.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    //http://api.openweathermap.org/data/2.5/find?q=London,uk&appid=62c44155efb775337d698e0089a05319&units=metric
    @GET("weather")
    Call<City> getCityCelsius(@Query("q") String city, @Query("appid") String key, @Query("units") String metric);
}

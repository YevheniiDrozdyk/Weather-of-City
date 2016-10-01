package com.indev.weatherofcity.network;

import android.support.annotation.NonNull;

import com.indev.weatherofcity.model.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("data/2.5/weather?units=metric")
    Call<City> getWeather(@NonNull @Query("q") String query);
}

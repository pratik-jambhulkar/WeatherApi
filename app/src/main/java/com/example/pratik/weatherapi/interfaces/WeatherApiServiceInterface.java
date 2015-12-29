package com.example.pratik.weatherapi.interfaces;

import com.example.pratik.weatherapi.beans.Example;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by pratik on 20-12-2015.
 */
public interface WeatherApiServiceInterface {

    //q=18.48,73.90&
    @GET("/free/v2/weather.ashx?key=0bf2cda0e05a26112e2aad3a46670&num_of_days=1&tp=24&format=json")
    public void getWeatherDetails(@Query("q") String query, Callback<Example> response);
}

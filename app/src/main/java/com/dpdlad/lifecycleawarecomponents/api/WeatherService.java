package com.dpdlad.lifecycleawarecomponents.api;

import com.dpdlad.lifecycleawarecomponents.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Praveen on 25/06/18.
 */
public interface WeatherService {

    @GET("data/2.5/weather")
    Call<WeatherResponse> fetchWeatherResponse(@Query("q") String name, @Query("appid") String appId);
}

package com.dpdlad.lifecycleawarecomponents.api;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/**
 * @author Praveen on 25/06/18.
 */
public class WeatherServiceHelper {

    public static WeatherServiceHelper getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public WeatherService getWeatherService() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://samples.openweathermap.org/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
        return retrofit.create(WeatherService.class);

    }

    private static class InstanceHolder {
        private static final WeatherServiceHelper INSTANCE = new WeatherServiceHelper();
    }
}

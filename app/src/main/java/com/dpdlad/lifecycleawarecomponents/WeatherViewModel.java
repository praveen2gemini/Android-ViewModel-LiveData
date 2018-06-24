package com.dpdlad.lifecycleawarecomponents;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.AsyncTask;
import android.util.Log;

import com.dpdlad.lifecycleawarecomponents.api.WeatherServiceHelper;
import com.dpdlad.lifecycleawarecomponents.model.WeatherResponse;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author Praveen on 25/06/18.
 */
public class WeatherViewModel extends ViewModel {

    private WeatherResponse weatherResponse;
    private MutableLiveData<WeatherResponse> liveWeatherResponse;
    public WeatherViewModel() {
        super();
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.e("######", "onCleared called!");
    }

    public LiveData<WeatherResponse> getLiveWeatherResponse() {
        liveWeatherResponse = new MutableLiveData<>();
        Call<WeatherResponse> weatherResponseCall = WeatherServiceHelper.getInstance().getWeatherService().fetchWeatherResponse("London,uk",
                "b6907d289e10d714a6e88b30761fae22");
        weatherResponseCall.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                liveWeatherResponse.setValue(response.body());
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                liveWeatherResponse.setValue(null);
            }
        });

        if (null == liveWeatherResponse.getValue()) {
            Log.e("######", "Data newly loaded");
        } else {
            Log.e("@@@@@@@", "Old Data retrieved");
        }
        return liveWeatherResponse;
    }

    public WeatherResponse getWeatherResponse() {
        if (null == weatherResponse) {
            try {
                weatherResponse = new WeatherTask().execute().get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            Log.e("######", "Data newly loaded");
        } else {
            Log.e("@@@@@@@", "Old Data retrieved");
        }
        return weatherResponse;
    }

    static class WeatherTask extends AsyncTask<String, Integer, WeatherResponse> {

        @Override
        protected WeatherResponse doInBackground(String... strings) {
            WeatherResponse weatherResponse = null;
            Call<WeatherResponse> s = WeatherServiceHelper.getInstance().getWeatherService().fetchWeatherResponse("London,uk",
                    "b6907d289e10d714a6e88b30761fae22");
            try {
                weatherResponse = s.execute().body();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return weatherResponse;
        }
    }
}

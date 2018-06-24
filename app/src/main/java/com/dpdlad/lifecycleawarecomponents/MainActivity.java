package com.dpdlad.lifecycleawarecomponents;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.dpdlad.lifecycleawarecomponents.model.WeatherResponse;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.status_view);
        WeatherViewModel weatherViewModel = ViewModelProviders.of(this).get(WeatherViewModel.class);

        //Todo live updates
        mutableCheck(weatherViewModel);

        //Todo: enable either one
//        normalCheck(weatherViewModel);


    }

    private void normalCheck(WeatherViewModel weatherViewModel) {
        WeatherResponse weatherResponse = weatherViewModel.getWeatherResponse();
        if (null == weatherResponse) return;
        Toast.makeText(this, "" + weatherResponse.getName(), Toast.LENGTH_SHORT).show();
        textView.setText(weatherResponse.getBase());
    }

    private void mutableCheck(WeatherViewModel weatherViewModel) {
        weatherViewModel.getLiveWeatherResponse().observe(this, new Observer<WeatherResponse>() {
            @Override
            public void onChanged(@Nullable WeatherResponse weatherResponse) {
                if (null == weatherResponse) return;
                Toast.makeText(MainActivity.this, "" + weatherResponse.getName(), Toast.LENGTH_SHORT).show();
                textView.setText(weatherResponse.getBase());
            }
        });
    }


}

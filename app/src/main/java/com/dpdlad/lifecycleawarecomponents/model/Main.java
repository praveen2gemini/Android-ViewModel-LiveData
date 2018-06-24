package com.dpdlad.lifecycleawarecomponents.model;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class Main{

	@Json(name = "temp")
	private double temp;

	@Json(name = "temp_min")
	private double tempMin;

	@Json(name = "humidity")
	private int humidity;

	@Json(name = "pressure")
	private int pressure;

	@Json(name = "temp_max")
	private double tempMax;

	public void setTemp(double temp){
		this.temp = temp;
	}

	public double getTemp(){
		return temp;
	}

	public void setTempMin(double tempMin){
		this.tempMin = tempMin;
	}

	public double getTempMin(){
		return tempMin;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setPressure(int pressure){
		this.pressure = pressure;
	}

	public int getPressure(){
		return pressure;
	}

	public void setTempMax(double tempMax){
		this.tempMax = tempMax;
	}

	public double getTempMax(){
		return tempMax;
	}

	@Override
 	public String toString(){
		return 
			"Main{" + 
			"temp = '" + temp + '\'' + 
			",temp_min = '" + tempMin + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",temp_max = '" + tempMax + '\'' + 
			"}";
		}
}
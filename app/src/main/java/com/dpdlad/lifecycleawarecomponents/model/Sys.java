package com.dpdlad.lifecycleawarecomponents.model;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class Sys{

	@Json(name = "country")
	private String country;

	@Json(name = "sunrise")
	private int sunrise;

	@Json(name = "sunset")
	private int sunset;

	@Json(name = "id")
	private int id;

	@Json(name = "type")
	private int type;

	@Json(name = "message")
	private double message;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setSunrise(int sunrise){
		this.sunrise = sunrise;
	}

	public int getSunrise(){
		return sunrise;
	}

	public void setSunset(int sunset){
		this.sunset = sunset;
	}

	public int getSunset(){
		return sunset;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setType(int type){
		this.type = type;
	}

	public int getType(){
		return type;
	}

	public void setMessage(double message){
		this.message = message;
	}

	public double getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"Sys{" + 
			"country = '" + country + '\'' + 
			",sunrise = '" + sunrise + '\'' + 
			",sunset = '" + sunset + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}
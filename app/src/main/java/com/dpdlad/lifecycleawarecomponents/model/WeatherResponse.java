package com.dpdlad.lifecycleawarecomponents.model;

import java.util.List;
import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class WeatherResponse{

	@Json(name = "dt")
	private int dt;

	@Json(name = "coord")
	private Coord coord;

	@Json(name = "visibility")
	private int visibility;

	@Json(name = "weather")
	private List<WeatherItem> weather;

	@Json(name = "name")
	private String name;

	@Json(name = "cod")
	private int cod;

	@Json(name = "main")
	private Main main;

	@Json(name = "clouds")
	private Clouds clouds;

	@Json(name = "id")
	private int id;

	@Json(name = "sys")
	private Sys sys;

	@Json(name = "base")
	private String base;

	@Json(name = "wind")
	private Wind wind;

	public void setDt(int dt){
		this.dt = dt;
	}

	public int getDt(){
		return dt;
	}

	public void setCoord(Coord coord){
		this.coord = coord;
	}

	public Coord getCoord(){
		return coord;
	}

	public void setVisibility(int visibility){
		this.visibility = visibility;
	}

	public int getVisibility(){
		return visibility;
	}

	public void setWeather(List<WeatherItem> weather){
		this.weather = weather;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCod(int cod){
		this.cod = cod;
	}

	public int getCod(){
		return cod;
	}

	public void setMain(Main main){
		this.main = main;
	}

	public Main getMain(){
		return main;
	}

	public void setClouds(Clouds clouds){
		this.clouds = clouds;
	}

	public Clouds getClouds(){
		return clouds;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSys(Sys sys){
		this.sys = sys;
	}

	public Sys getSys(){
		return sys;
	}

	public void setBase(String base){
		this.base = base;
	}

	public String getBase(){
		return base;
	}

	public void setWind(Wind wind){
		this.wind = wind;
	}

	public Wind getWind(){
		return wind;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"dt = '" + dt + '\'' + 
			",coord = '" + coord + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",weather = '" + weather + '\'' + 
			",name = '" + name + '\'' + 
			",cod = '" + cod + '\'' + 
			",main = '" + main + '\'' + 
			",clouds = '" + clouds + '\'' + 
			",id = '" + id + '\'' + 
			",sys = '" + sys + '\'' + 
			",base = '" + base + '\'' + 
			",wind = '" + wind + '\'' + 
			"}";
		}
}
package com.dpdlad.lifecycleawarecomponents.model;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class Coord{

	@Json(name = "lon")
	private double lon;

	@Json(name = "lat")
	private double lat;

	public void setLon(double lon){
		this.lon = lon;
	}

	public double getLon(){
		return lon;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"Coord{" + 
			"lon = '" + lon + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}
package com.dpdlad.lifecycleawarecomponents.model;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class Wind{

	@Json(name = "deg")
	private int deg;

	@Json(name = "speed")
	private double speed;

	public void setDeg(int deg){
		this.deg = deg;
	}

	public int getDeg(){
		return deg;
	}

	public void setSpeed(double speed){
		this.speed = speed;
	}

	public double getSpeed(){
		return speed;
	}

	@Override
 	public String toString(){
		return 
			"Wind{" + 
			"deg = '" + deg + '\'' + 
			",speed = '" + speed + '\'' + 
			"}";
		}
}
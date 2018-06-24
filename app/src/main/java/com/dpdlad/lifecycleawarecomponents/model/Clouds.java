package com.dpdlad.lifecycleawarecomponents.model;

import javax.annotation.Generated;
import com.squareup.moshi.Json;

@Generated("com.robohorse.robopojogenerator")
public class Clouds{

	@Json(name = "all")
	private int all;

	public void setAll(int all){
		this.all = all;
	}

	public int getAll(){
		return all;
	}

	@Override
 	public String toString(){
		return 
			"Clouds{" + 
			"all = '" + all + '\'' + 
			"}";
		}
}
package com.example.Car;
import org.springframework.stereotype.*;
import jakarta.persistence.*;
@Component
@Entity
public class Car {
	@Id
	private String carname;
//	private String model;
	private int price;
	private String color;
	private String fueltype;
	public void setcarname(String name) {
		this.carname=name;
	}
	
	public void setprice(int price) {
		this.price=price;
		
	}
	public void setcolor(String color) {
		this.color=color;
		
	}
	public void setfueltype(String type) {
		this.fueltype=type;
		
		
	}
//	public void setModel(String model) {
//		this.model=model;
//	}
	public String getcarname() {
		return carname;
	}public int getprice() {
		return price;
		
	}public String getcolor() {
		return color;
		
	}public String getfueltype() {
		return fueltype;
	}
//	public String getmodel() {
//		return model;
//	}
//	

}

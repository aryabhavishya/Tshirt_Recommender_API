package com.assignment.tshirtdetails.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TshirtData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long tid;
	
	private String name;
	private String colour;
	private String gender;
	private String size;
	private double price;
	private double rating;
	private String availability;
	

	public long getTid() {
		
		return tid;
	}


	public void setTid(long tid) {
		this.tid = tid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public String getAvailability() {
		return availability;
	}



	public void setAvailability(String availability) {
		this.availability = availability;
	}



	@Override
	public String toString() {
		return "TshirtData [tid=" + tid + ", name=" + name + ", colour=" + colour + ", gender=" + gender + ", size="
				+ size + ", price=" + price + ", rating=" + rating + ", availability=" + availability + "]";
	}

	
}

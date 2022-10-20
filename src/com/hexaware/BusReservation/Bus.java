package com.hexaware.BusReservation;

class Bus{
private int busId;
private String boarding;
private String destination;
private int price;
private int noOfSeats;
public int getBusId() {
	return busId;
}
public  void setBusId(int busId) {
	this.busId = busId;
}
public String getBoarding() {
	return boarding;
}
public void setBoarding(String boarding) {
	this.boarding = boarding;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getNoOfSeats() {
	return noOfSeats;
}
public void setNoOfSeats(int noOfSeats) {
	this.noOfSeats = noOfSeats;
}
public Bus(int busId, String boarding, String destination, int price, int noOfSeats) {
	super();
	this.busId = busId;
	this.boarding = boarding;
	this.destination = destination;
	this.price = price;
	this.noOfSeats = noOfSeats;
} 

public Bus() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "" + busId + "\t  " + boarding + "\t\t " + destination + "\t\t " + price
			+ "\t" + noOfSeats;
}

  
}
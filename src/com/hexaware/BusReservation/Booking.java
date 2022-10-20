package com.hexaware.BusReservation;

import java.util.*;

class Booking{
	protected ArrayList<Bus> li;
public void busDetails(){
//create a collection class and store bus details
	//List<Bus> li=new ArrayList<Bus>();
	Bus b1=new Bus(100,"HYD","KMM",200,30);
	Bus b2=new Bus(101,"HYD","WAR",300,20);
	Bus b3=new Bus(102,"HYD","KDD",400,30);
	Bus b4=new Bus(103,"HYD","MBNR",100,30);
	 li=new ArrayList<Bus>();
	
	li.add(b1);
	li.add(b2);
	li.add(b3);
	li.add(b4);
	
	  Iterator itr=li.iterator();
	  while(itr.hasNext()) {
	  System.out.println(itr.next());
	  
	  }
	
	}

public void bookSeats(int busId, String boarding,String
destination,int price,int noOfSeats){	
	boolean isValid=false;
	for(Bus b1:li) {
		if(b1.getBusId()==busId) {
			isValid=true;
		}
	}
	if(isValid) {
	if(noOfSeats<=0) {
		System.out.println("please select minimum one seat");
	}
	else if(noOfSeats>=5) {
		int total=price*noOfSeats;
		double dis=(total*10)/100;
		double cost=total-dis;
		System.out.println("Total cost is: "+total);
		System.out.println("discount is: "+dis);
		System.out.println("Total amount to pay is: "+cost); 
		
	}
	else {
		int total=price*noOfSeats;
		System.out.println("total amount to pay is"+total);
	}
	
}
	else {
		System.out.println("Invalid busid");
	}
}
}
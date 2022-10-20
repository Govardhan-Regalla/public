package com.hexaware.BusReservation;

import java.util.Scanner;

public class BusBooking {
	public static void main(String[] args) {
		Bus b = new Bus();
		Booking booking = new Booking();
		Scanner sc = new Scanner(System.in);
		System.out.println("____________________________________________________________________________________________");
		System.out.println();
		System.out.println("Bus ID \t Boarding \t Destination \t Price \tNo of seats");
		System.out.println("____________________________________________________________________________________________");
		booking.busDetails();
		System.out.println("Enter  bus id:");
		b.setBusId(sc.nextInt());
		System.out.println("Enter  boarding point:");
		b.setBoarding(sc.next());
		System.out.println("Enter  Destination point:");
		b.setDestination(sc.next());
		System.out.println("Enter  cost of seat:");
		b.setPrice(sc.nextInt());
		System.out.println("Enter  no. of seats:");
		b.setNoOfSeats(sc.nextInt());
		booking.bookSeats(b.getBusId(), b.getBoarding(), b.getDestination(), b.getPrice(), b.getNoOfSeats());

	}
}

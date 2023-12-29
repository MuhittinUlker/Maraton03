package com.muhittinu;

import java.util.LinkedList;
import java.util.Queue;

public class Runner {

	static Queue<Passenger> kuyruk = new LinkedList<>();
	
	static Bus bus = new Bus();
	
	public static void main(String[] args) {

		Passenger p1 = new Passenger();
		Passenger p2 = new Passenger();
		Passenger p3 = new Passenger();
		Passenger p4 = new Passenger();
		Passenger p5 = new Passenger();
		Passenger p6 = new Passenger();
		Passenger p7 = new Passenger();
		Passenger p8 = new Passenger();
		Passenger p9 = new Passenger();
		Passenger p10 = new Passenger();
		Passenger p11 = new Passenger();
		Passenger p12 = new Passenger();
		Passenger p13 = new Passenger();
		Passenger p14 = new Passenger();
		Passenger p15 = new Passenger();
		
		System.out.println("*****Kuyruğa giriliyor*****");
		kuyrugaGir(p1);
		kuyrugaGir(p2);
		kuyrugaGir(p3);
		kuyrugaGir(p4);
		kuyrugaGir(p5);
		kuyrugaGir(p6);
		kuyrugaGir(p7);
		kuyrugaGir(p8);
		kuyrugaGir(p9);
		kuyrugaGir(p10);
		kuyrugaGir(p11);
		kuyrugaGir(p12);
		kuyrugaGir(p13);
		kuyrugaGir(p14);
		kuyrugaGir(p15);
		
		System.out.println("*****Otobüse biniliyor*****");
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		
		System.out.println("*****Otobüsteki yolcular*****");
		bus.getPassengerList().forEach(p->{
			System.out.println("yolcu adı: "+p.getName());
		});
		
		System.out.println("*****Otobüsten iniliyor*****");
		bus.otobustenIn(p1);
		bus.otobustenIn(p2);
		bus.otobustenIn(p8);
			
		System.out.println("*****Otobüsteki yolcular*****");
		bus.getPassengerList().forEach(p->{
			System.out.println("yolcu adı: "+p.getName());
		});
		
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();
		bus.otobuseBin();	
		
		System.out.println("*****Otobüsteki yolcular*****");
		bus.getPassengerList().forEach(p->{
			System.out.println("yolcu adı: "+p.getName());
		});
		
		
		
		
	}
	
	public static void kuyrugaGir(Passenger passenger) {
		System.out.println(passenger.getName()+" kuyruğa girdi.");
		Runner.kuyruk.add(passenger);
	}
	
	
}



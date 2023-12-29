package com.muhittinu;

import java.util.ArrayList;
import java.util.List;

public class Bus {

	private List<Passenger> passengerList;
	
	public Bus() {
		this.passengerList = new ArrayList<>();
	}

	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void otobuseBin() {
		if (Runner.bus.getPassengerList().size()<10) {
			System.out.println(Runner.kuyruk.peek().getName()+" otobüse binecek");
			Runner.bus.getPassengerList().add(Runner.kuyruk.poll());
		}else {
			System.out.println("Otobüs dolu, Lütfen sonraki otobüsü bekleyin yolcu "+Runner.kuyruk.peek().getName());
		}	
	}
	
	public void otobustenIn(Passenger passenger) {
			System.out.println(passenger.getName()+" otobüsten indi.");
			Runner.bus.getPassengerList().remove(passenger);
	}

}

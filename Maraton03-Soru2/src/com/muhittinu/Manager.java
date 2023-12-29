package com.muhittinu;

import java.util.LinkedHashMap;
import java.util.Map;

public class Manager {

	static RandomGenerator generator = new RandomGenerator();
	
	private Map<EGunler ,Menu> menu = new LinkedHashMap<>();

	private Map<EGunler,Menu> getMenu() {
		return menu;
	}

	public void menuOlustur() {
		EGunler gun = EGunler.PAZARTESI;
		for (int i = 0; i < 7; i++) {
			switch (i) {
			case 0:
				gun = EGunler.PAZARTESI;
				break;
			case 1:
				gun = EGunler.SALI;
				break;
			case 2:
				gun = EGunler.CARSAMBA;
				break;
			case 3:
				gun = EGunler.PERSEMBE;
				break;
			case 4:
				gun = EGunler.CUMA;
				break;
			case 5:
				gun = EGunler.CUMARTESI;
				break;
			case 6:
				gun = EGunler.PAZAR;
				break;
			}
			this.getMenu().put(gun,new Menu(generator.corba(), generator.icecek(), generator.yemek(),generator.tatli()));
		}
		
	
	}
	
	public void menuleriListele() {
		for (Map.Entry<EGunler,Menu> entry : menu.entrySet()) {
			System.out.println(entry.getKey()+" gününün menüsü--->"+entry.getValue()+"\n");
		}
	}
	
}

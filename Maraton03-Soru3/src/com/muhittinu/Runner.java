package com.muhittinu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();
		Map<String, Double> productMap = new HashMap<>();
		
		productList.add(new Product("Ayakkabı", 4500));
		productList.add(new Product("Cep Telefonu", 9500));
		productList.add(new Product("Mum", 50));
		productList.add(new Product("Halı", 1500));
		productList.add(new Product("Rondo", 3000));
		productList.add(new Product("Kahve Makinesi", 7500));
		productList.add(new Product("Çorap", 10));
		productList.add(new Product("Çanta", 200));
		productList.add(new Product("Nevresim Takımı", 1450));
		productList.add(new Product("Dikiş Makinesi", 2500));
	
		productList.stream().filter(p-> p.getPrice()<5000 && p.getPrice()>1500).forEach(p->{
			productMap.put(p.getName(), p.getPrice());
		});
	
		for (Map.Entry<String, Double> product : productMap.entrySet()) {
			System.out.println("Ürün: "+product.getKey()+"\nFiyatı: "+product.getValue()+"\n");
		}
	
	}

}

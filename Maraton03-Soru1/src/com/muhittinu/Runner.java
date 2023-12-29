package com.muhittinu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

import com.muhittinu.utilities.RandomGenerator;

public class Runner {

	public static void main(String[] args) {

		RandomGenerator generator = new RandomGenerator();
		
		Map<Integer, Integer> generatedNumberMap = new HashMap<>();
		List<Integer> generatedNumberList = new ArrayList<>();
		
		// 1)** 1-100 arasında 10000 adet sayı üretip bir map içerisinde tutuyoruz.
		generatedNumberMap = generator.randomMapGenerator();
		
		// rastgele üretilen sayıların kaçar adet üretildiğini görüntüleyelim.
//		System.out.println("*****GENERATED NUMBERS as MAP*****");
//		generatedNumberMap.forEach((n,a)->{
//			System.out.println(n+"= "+a+" adet");
//		});
		
		// 2)** map'imizi listeye atıyoruz.
		for (Map.Entry<Integer,Integer> entry : generatedNumberMap.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				generatedNumberList.add(entry.getKey());
			}
		}
		
		// listemizi yazdırıyoruz
//		System.out.println("*****GENERATED NUMBERS as LIST*****");
//		System.out.println(generatedNumberList);
		
		// 3)** listemizi shuffle edip içinden rastgele 10 sayıyı 
		// "SET" (tekrarsız) şekilde bir collectionda tutalım.
		Collections.shuffle(generatedNumberList);
		Set<Integer> luckyTen = new HashSet<>();
		
		int selectionAmount = 10; // seçilecek sayı adedini belirleyelim
		
		for (int i = 0; i < generatedNumberMap.size(); i++) {
			if (luckyTen.size()<selectionAmount) {
				luckyTen.add(generator.randomGenerator());
			}
		}
		
		// şanslı 10 sayımızı yazdıralım
		System.out.println("*****LUCKY-TEN*****");
		System.out.println(luckyTen);
		System.out.println();
		
		// a) 42'den büyük sayıları getiren bir akış oluşturacağız.
		System.out.println("*****42'den büyükler*****");
		luckyTen.stream().filter(n-> n>42).forEach(n->System.out.print(n+" "));
		System.out.println();
		
		// b) Tüm sayıların toplamını getiren bir akış oluşturacağız.
		System.out.println("*****Şanslı sayıların toplamı*****");
		int sum = luckyTen.stream().mapToInt(n->n).sum();
		System.out.println("Toplam: "+sum);
		System.out.println();
		
		//c) Tüm sayıların ortalamasını getiren bir akış oluşturacağız.
		System.out.println("*****Şanslı sayıların ortalaması*****");
		double avrg = luckyTen.stream().mapToDouble(n->n).average().getAsDouble();
		System.out.println("Ortalama: "+avrg);
		System.out.println();
		
		//d) 42'den büyük sayıların toplamını getiren bir akış oluşturacağız.
		System.out.println("*****42'den büyüklerin toplamı*****");
		int filteredSum = luckyTen.stream().filter(n-> n>42).mapToInt(n->n).sum();
		System.out.println("42'den büyüklerin toplamı: "+filteredSum);
		System.out.println();
		
		//e) 42'den büyük sayıların ortalamasını getiren bir akış oluşturacağız.
		System.out.println("*****42'den büyüklerin ortalaması*****");
		double filteregAvrg = luckyTen.stream().filter(n-> n>42).mapToDouble(n->n).average().getAsDouble();
		System.out.println("42'den büyüklerin ortalaması: "+filteregAvrg);
		System.out.println();
		
		//f) En büyük değeri getiren bir akış oluşturacağız.
		System.out.println("*****En büyük değer*****");
		OptionalInt max = luckyTen.stream().mapToInt(n->n).max();
		System.out.println("En büyük değer: "+max.getAsInt());
		System.out.println();
		
		//g) En küçük değeri getiren bir akış oluşturacağız.
		System.out.println("*****En küçük değer*****");
		OptionalInt min = luckyTen.stream().mapToInt(n->n).min();
		System.out.println("En küçük değer: "+min.getAsInt());
		System.out.println();
		
		//h) 50'den büyük değerlerin sayısını getiren bir akış oluşturacağız.
		System.out.println("*****50'den büyük değerlerin sayısı*****");
		long biggerThan50 = luckyTen.stream().filter(n-> n>50).count();
		System.out.println("50'den büyük değerlerin sayısı: "+ biggerThan50);
		System.out.println();
		
		//i) Bu 10 sayıyı bir string listesine çevireceğiz.
		System.out.println("*****Set To StringList*****");
		List<String> stringLuckyTen = new ArrayList<>();
		luckyTen.stream().forEach(n->{
			stringLuckyTen.add(Integer.toString(n));
		});
		System.out.println(stringLuckyTen);
		System.out.println();
		
		//j) Daha sonra bu string listesini tek bir stringde aralarına virgül kullanarak yazdıralım.
		System.out.println("*****List To String*****");
		StringBuilder sb = new StringBuilder();
		sb.append(stringLuckyTen.stream().collect(Collectors.joining(",")));
		System.out.println("ListToString: "+sb);
		System.out.println();
		
		//aa) Bu listedeki elemanları karıştırın, sonra 250 değer atlayarak 20tane eleman seçiniz.
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbers.add(generatedNumberList.get(generator.randomGenerator()));
		}
		System.out.println("*****10000'den 20 tanesi*****");
		System.out.println(numbers);
		System.out.println();
		//bb)Daha sonra bu 20 eleman içinde 50 sayısı bulunup bulunmadığını kontrol edip 
		//true/false şeklinde geri dönenbir akış oluşturun.
		System.out.println("50'den büyük var mı: "+numbers.stream().anyMatch(n-> n>50));
		
	}

}

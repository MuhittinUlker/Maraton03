package com.muhittinu.utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomGenerator {

	static Random rnd = new Random();
	final int MIN_VALUE = 1;
	final int MAX_VALUE = 101;
	final int AMOUNT = 10000;
	
	private int number;

	// key olarak üretilen sayı, value olarak adedini tutmak için map kullandım.
	private Map<Integer, Integer> generatedNumbers; 
	
	public RandomGenerator() {
		this.generatedNumbers = new HashMap<>();
		for (int i = 1; i < 101; i++) {
			generatedNumbers.put(i, 0);
		}
	}

	public int getNumber() {
		return number;
	}

	public int getCount(int number) {
		return this.getGeneratedNumbers().get(number);
	}

	public int getMIN_VALUE() {
		return MIN_VALUE;
	}

	public int getMAX_VALUE() {
		return MAX_VALUE;
	}

	public Map<Integer, Integer> getGeneratedNumbers() {
		return generatedNumbers;
	}
	
	public Map<Integer, Integer> randomMapGenerator() {
		for (int i = 0; i < AMOUNT; i++) {
			this.number = rnd.nextInt(MIN_VALUE,MAX_VALUE);
			this.generatedNumbers.put(number, this.generatedNumbers.get(number)+1);
		}
		return this.generatedNumbers;
	}
	
	public int randomGenerator() {
		int number = rnd.nextInt(MIN_VALUE,MAX_VALUE);
		return number;
	}
	
}

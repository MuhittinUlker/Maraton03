package com.muhittinu;

import java.util.Random;

public class RandomGenerator {

	static Random rnd = new Random();
		
	public ECorbalar corba() {
		ECorbalar corba = ECorbalar.DOMATES;
		int num = rnd.nextInt(5);
		switch (num) {
		case 0:
			corba = ECorbalar.DOMATES;
			break;
		case 1:
			corba = ECorbalar.TARHANA;
			break;
		case 2:
			corba = ECorbalar.EZOGELIN;
			break;
		case 3:
			corba = ECorbalar.MERCIMEK;
			break;
		case 4:
			corba = ECorbalar.YAYLA;
			break;
		}
		return corba;
	}
	
	public EIcecekler icecek() {
		EIcecekler icecek= EIcecekler.KOLA;
		int num = rnd.nextInt(7);
		switch (num) {
		case 0:
			icecek = EIcecekler.KOLA;
			break;
		case 1:
			icecek = EIcecekler.AYRAN;
			break;
		case 2:
			icecek = EIcecekler.ICE_TEA;
			break;
		case 3:
			icecek = EIcecekler.FANTA;
			break;
		case 4:
			icecek = EIcecekler.GAZOZ;
			break;
		case 5:
			icecek = EIcecekler.MEYVE_SUYU;
			break;
		case 6:
			icecek = EIcecekler.LIMONATA;
			break;
		}
		return icecek;
	}
	
	public EYemekler yemek() {
		EYemekler yemek = EYemekler.FASULYE;
		int num = rnd.nextInt(5);
		switch (num) {
		case 0:
			yemek = EYemekler.FASULYE;
			break;
		case 1:
			yemek = EYemekler.TURLU;
			break;
		case 2:
			yemek = EYemekler.ISPANAK;
			break;
		case 3:
			yemek = EYemekler.KOFTE;
			break;
		case 4:
			yemek = EYemekler.DONER;
			break;
		}
		return yemek;
	}
	
	public ETatlilar tatli() {
		ETatlilar tatli = ETatlilar.SUTLAC;
		int num = rnd.nextInt(5);
		switch (num) {
		case 0:
			tatli = ETatlilar.SUTLAC;
			break;
		case 1:
			tatli = ETatlilar.PROFITEROL;
			break;
		case 2:
			tatli = ETatlilar.KAZANDIBI;
			break;
		case 3:
			tatli = ETatlilar.KEMALPASA;
			break;
		case 4:
			tatli = ETatlilar.SEKERPARE;
			break;
		}
		return tatli;
		
	}
	
}

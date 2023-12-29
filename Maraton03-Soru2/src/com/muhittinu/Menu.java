package com.muhittinu;

public class Menu {

	private ECorbalar corba;
	private EIcecekler icecek;
	private EYemekler yemek;
	private ETatlilar tatli;
	
	public Menu(ECorbalar corba, EIcecekler icecek, EYemekler yemek, ETatlilar tatli) {
		super();
		this.corba = corba;
		this.icecek = icecek;
		this.yemek = yemek;
		this.tatli = tatli;
	}

	public ECorbalar getCorba() {
		return corba;
	}

	public void setCorba(ECorbalar corba) {
		this.corba = corba;
	}

	public EIcecekler getIcecek() {
		return icecek;
	}

	public void setIcecek(EIcecekler icecek) {
		this.icecek = icecek;
	}

	public EYemekler getYemek() {
		return yemek;
	}

	public void setYemek(EYemekler yemek) {
		this.yemek = yemek;
	}

	public ETatlilar getTatli() {
		return tatli;
	}

	public void setTatli(ETatlilar tatli) {
		this.tatli = tatli;
	}

	@Override
	public String toString() {
		return "\nÇorba:" + corba + "\tİçecek=" + icecek + "\tYemek=" + yemek + "\tTatli=" + tatli;
	}
	
	
	
}

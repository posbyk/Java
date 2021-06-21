package oopInto;

//özellik tutan sýnýf
public class Product {
	
	//1 constructor çalýþmak zorunda, birden fazla constructor varsa sadece biri
	
	
	//ilk imzadaki default olarak çalýþýr
	public Product(){                 
		System.out.println("Ben çalýþtým");
	};
	
	
	//overloading
	//Ýkinci parametre alan imza için constructor bu çalýþýr
	public Product(int id, String name, double unitRice, String detail) { 
		this(); //default constructor'ý da çalýþtýrýyor.
		this.id=id;
		this.name=name;
		this.detail=detail;
		this.unitPrice=unitPrice;
	}
	int id;
	String name;
	double unitPrice;
	String detail;
	
}

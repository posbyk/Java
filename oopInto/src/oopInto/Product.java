package oopInto;

//�zellik tutan s�n�f
public class Product {
	
	//1 constructor �al��mak zorunda, birden fazla constructor varsa sadece biri
	
	
	//ilk imzadaki default olarak �al���r
	public Product(){                 
		System.out.println("Ben �al��t�m");
	};
	
	
	//overloading
	//�kinci parametre alan imza i�in constructor bu �al���r
	public Product(int id, String name, double unitRice, String detail) { 
		this(); //default constructor'� da �al��t�r�yor.
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

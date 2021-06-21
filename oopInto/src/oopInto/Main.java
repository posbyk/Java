package oopInto;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
/*1.    String[] products = {
				"Lenovo V14",
				"Lenovo V15",
				"Hp 5"
		};*/
		
		
		//String Product sýnýfý oldu
		//Ýlk imza
        Product product1 = new Product(); //örnek oluþturma, referans oluþturma, intance oluþturma,bellekte oluiuyor-deafult olarak oluþturuyor
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=1500;
		product1.detail="16 GB Ram";
		
		Product product2 = new Product(); 
		product2.id=1;
		product2.name="Lenovo V15";
		product2.unitPrice=1500;
		product2.detail="32 GB Ram";
		
		Product product3 = new Product(); 
		product3.id=1;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		
		Product[] products = {product1,product2, product3};
		
		for (Product product: products) {       //Product veri türü
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		
		//Ýkinci imza
		Product product4 = new Product(1,"Lenovo V14", 15000, "16 GB Ram");
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

		
		
	}

}

package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Today, weather is good";
		String newMessage = message.substring(0,2);
		System.out.println(newMessage);
		String newMessage2 = giveACity();
		System.out.println(newMessage2);

		int number = Add2();
		System.out.println(number);

		int number2 = Add3(5,6);
		System.out.println(number2);


	}
	
	public static void Add() {
		System.out.println("Added");
	}
	
    public static void Delete() {
		System.out.println("Deleted");
	}


   public static void Update() {
		System.out.println("Updated");	
   }
   
   
   //return sadece bitir demek
   //int classlarda return ile deðer dönmesi lazým
   public static int Add2() {
	   return 5;
   }
   
   public static String giveACity() {
	   return "Ýstanbul";
   }
   
   public static int Add3(int number1, int number2) {
	   return number1 + number2;
   }

}

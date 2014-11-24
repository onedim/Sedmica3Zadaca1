//vjezbe za subrutine/funkcije
public class Vjezba {
	
													// sabiranje 2 broja
	public static double sum(double num1, double num2) {
		System.out.println("Sabiranje double");
		double sum =num1 + num2;
		return sum;
	}	
	
	public static int sum(int num1, int num2) {
		System.out.println("Sabiranje intidzera");
		int sum =num1 + num2;
		return sum;
		

	}
	public static void main(String[] args){
				
		int num1=1;
		int num2=2;
		
		int sum = sum(num1, num2);
	System.out.println("Suma int :" + sum);
		double doubleSum = sum(0.3,0.5);
		System.out.println("Suma double :" + doubleSum);
	System.out.println("num1, num2: " +num1 + " " +num2);
		
	}

}

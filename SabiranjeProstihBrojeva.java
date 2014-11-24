/**
 * Korisnik unosi dva int broja koji cine interval,sabrati sve praim brojeve u tom intervalu
 * @author nedimomerovic
 *
 */
public class SabiranjeProstihBrojeva {

 	
public static boolean isPrime(int kraj){
	boolean isPrime=true;
	for (int i = 2; i< kraj; i++){
			if (kraj % i == 0){
				isPrime=false;
			}
	}
	return isPrime;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesite 2 broja koja cine pocetak i kraj niza");
		int pocetak=TextIO.getlnInt();
		int kraj=TextIO.getlnInt();
		int sum=1;
		for (int i=pocetak; pocetak<=kraj;pocetak++){
		if (isPrime(i) == true){
			sum=sum+i;
			}
		}
	System.out.println("Suma primarnih Brojeva je:" + sum);
	}
	
}


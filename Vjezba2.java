//nista se ne vraca iz 
public class Vjezba2 {
	
		/**
		 * zbrajanje dva double broja	
		 * @param numDouble1 kasnije uneseni broj
		 * @param numDouble2
		 * @return zbrajanje
		 */
		public static double zbrajanje(double numDouble1, double numDouble2) {
			
			double sumDouble =numDouble1 + numDouble2;
			return sumDouble;
		}	
		/**
		 * oduzima dva double broja
		 * @param numDouble1
		 * @param numDouble2 mora biti razlicit od 0
		 * @return razlika
		 */
		public static double oduzimanje(double numDouble1, double numDouble2) {
			
			double razDouble =numDouble1 - numDouble2;
			return razDouble;
		}	
		public static double mnozenje(double numDouble1, double numDouble2) {
			
			double proDouble =numDouble1 * numDouble2;
			return proDouble;
		}	
		public static double dijeljenje(double numDouble1, double numDouble2) {
			
			double dijDouble =numDouble1 / numDouble2;
			return dijDouble;
		}	

		public static int zbrajanje(int numInt1, int numInt2) {
			
			int sumInt =numInt1 + numInt2;
			return sumInt;
		}
		public static int oduzimanje(int numInt1, int numInt2) {
			
			int razInt =numInt1 - numInt2;
			return razInt;
		}		
		public static int mnozenje(int numInt1, int numInt2) {
			
			int proInt =numInt1 * numInt2;
			return proInt;
		}		
		public static int djeljenje(int numInt1, int numInt2) {
			
			int razInt =numInt1 / numInt2;
			return razInt;

		}		
		public static void main(String[] args){
		
			System.out.println("Unesite prvi double broj");
			double numDouble1=TextIO.getlnInt();
			System.out.println("Unesite drugi double broj");
			double numDouble2=TextIO.getlnInt();
			if (numDouble2<0){
				System.out.println("Unesite prvi int broj");	
			}
			System.out.println("Unesite prvi int broj");
			int numInt1=TextIO.getlnInt();	
			System.out.println("Unesite drugi double broj");
			int numInt2 = TextIO.getlnInt();
			
			zbrajanje(numDouble1, numDouble2);
			oduzimanje(numDouble1, numDouble2);
			mnozenje(numDouble1, numDouble2);
			djeljenje(numInt1, numInt2);
						
			zbrajanje (numInt1, numInt2);
			oduzimanje (numInt1, numInt2);
			mnozenje(numInt1, numInt2);
			djeljenje(numInt1, numInt2);
			
			System.out.println("Double suma je : " + zbrajanje(numDouble1, numDouble2) );
			System.out.println("Double oduzimanje je : " + oduzimanje(numDouble1, numDouble2) );
			System.out.println("Double mnozenje je : " + mnozenje(numDouble1, numDouble2) );
			System.out.println("Double djeljenje je : " + djeljenje(numInt1, numInt2) );
			System.out.println("Int suma je : " + zbrajanje(numInt1, numInt2) );
			System.out.println("Int razlika je : " + oduzimanje(numInt1, numInt2) );
			System.out.println("Int mnozenje je : " + mnozenje(numInt1, numInt2) );
			System.out.println("Int suma je : " + djeljenje(numInt1, numInt2) );
		}
		
			
	}



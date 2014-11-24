//iscrtavanje pravougaonika funkcijama
public class Pravougaonik {
	
	public static void main(String[] args) {
		System.out.println(pripremiPravougaonik(4, 6));
	}
	
	public static String pripremiPravougaonik(int sirina, int visina) {
		String str = "";
		str += pripremiPrviIliZadnjiRed(sirina) + "\n";
		for (int i = 2; i < visina; i++) {
			str += pripremiSrednjiRed(sirina) + "\n";
		}
		str += pripremiPrviIliZadnjiRed(sirina) ;
		return str;
	}

	private static String pripremiSrednjiRed(int sirina) {
		String str = "";
		str += pripremiProizvoljanRed(sirina, '|', ' ');
		return str;
	}

	private static String pripremiPrviIliZadnjiRed(int sirina) {
		String str = "";
		str += pripremiProizvoljanRed(sirina, 'A', 'B');
		return str;
	}

	private static String pripremiProizvoljanRed(int sirina, char c, char d) {
		String str = "";
		str += c;
		for (int i = 2; i < sirina; i++) {
			str += d;
		}
		str += c;
		return str;
	}
}

//zadatak 9
public class Zadatak9StringIBroj {

	public static void main(String[] args) {
		System.out.println("Prije try / catch bloka");
		try {
			System.out.println("Unutar try bloka 1");
			String str = "Neka rijec koju provjeravamo,ali ovaj zarez nas zeza."; // recenica
																					// koju
																					// pretrazujemo
			int redniBrojrijecikojuTrazimo = TextIO.getInt(); // redni broj
																// rijeci koju
																// trazimo

			System.out.println("To je rijec: "
					+ izvadiRijec(str, redniBrojrijecikojuTrazimo));
			System.out.println("Unutar try bloka 2");

		} catch (Exception e) {
			System.out.println("Unutar catch bloka");
			e.printStackTrace();
		}
		System.out.println("Poslije try / catch bloka");

	}

	private static String izvadiRijec(String recenica,
			int redniBrojrijecikojuTrazimo) throws Exception {
		if (redniBrojrijecikojuTrazimo <= 0) {
			throw new Exception("Broj ne moze biti nula i manji!");
		}
		String trazenaRijec = "";
		int trenutnaRijec = 0;
		int trenutniIndex = 0;
		while (trenutnaRijec < redniBrojrijecikojuTrazimo) {
			if (recenica.charAt(trenutniIndex) != ' ') {
				if (trenutniIndex == 0) {
					trenutnaRijec++;

				} else {
					if (recenica.charAt(trenutniIndex - 1) == ' ') {
						trenutnaRijec++;
					}

				}

			}

			trenutniIndex++;
			if (trenutniIndex >= recenica.length()) {
				throw new Exception("Ne moze biti veci od broja:"
						+ redniBrojrijecikojuTrazimo);
			}
		}
		trenutniIndex--;
		while (recenica.charAt(trenutniIndex) != ' ') {
			trazenaRijec += recenica.charAt(trenutniIndex);
			trenutniIndex++;

		}
		return trazenaRijec;
	}

}

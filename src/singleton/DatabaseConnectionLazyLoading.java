package singleton;

public class DatabaseConnectionLazyLoading {
	// DRUGI NACIN SINGLETONA
	// ne pravimo odma novi objekat, samo ga instanciramo
	private static DatabaseConnectionLazyLoading instance;

	private DatabaseConnectionLazyLoading() {
	
	}

	// u getter pravimo objekat, onda kada je pozvan 
	public static DatabaseConnectionLazyLoading getInstance() {
		// !!!BITNO!!! if nije dobro resenje za konkurentno programiranje
		// jer moze da se desi da 2 korisnika kreira insancu istovremeno (kad ima vise korisnika)
		// --> postoji sinronizacija klase - proverava da li je jos neko pokusao da kreira ono sto smo i mi kreirali
		// podrska za paralelno koriscenje (konkurentno programiranje) 
		// na testu je dovoljno da napisemo if, bez sinhronizacije
		if (instance == null) { // jeftina sa aspekta performansi
			synchronized(DatabaseConnectionLazyLoading.class) { // skupa metoda da bi se stalno pozivala, pa imamo prveru da li je instance null (da ne sinhronizujemo za dzabe)
				if (instance == null)
					instance = new DatabaseConnectionLazyLoading();
			}
		}
		return instance;
	}

}

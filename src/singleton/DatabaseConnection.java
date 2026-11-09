package singleton;

public class DatabaseConnection {
	
	// primer neke konekcije nad BP 
	// pravimo SAMO JEDAN objekat klase
	
	// PRVI NACIN SINGLETON OBRASCA
	// eager loading --> instanca se kreira bez obrzira da li koristimo konekciju (????) ili ne
	// moze biti prblematicno u velikim projektima jer zauzima puno memorije
	private static DatabaseConnection instance = new DatabaseConnection(); // instance znaci da postoji SAMO JEDNA pojava objekta neke klase
	
	// u drugim klasama ne mogu da se prave objekti nove klase
	/*public*/ private DatabaseConnection() {
		
	}

	// pristup objektu instance
	public static DatabaseConnection getInstance() {
		return instance;
	}
	
}

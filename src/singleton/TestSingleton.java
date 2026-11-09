package singleton;

public class TestSingleton {

	// testna klas pa mora da ima main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*DatabaseConnection connection1 = new DatabaseConnection();
		DatabaseConnection connection2 = new DatabaseConnection();
		
		System.out.println(connection1);
		System.out.println(connection2);
		*/
		
		// prvi nacin - eager loading
		DatabaseConnection connection1 = DatabaseConnection.getInstance();
		DatabaseConnection connection2 = DatabaseConnection.getInstance();
		
		// heksadecimalni zapis hash koda
		System.out.println(Integer.toHexString(connection1.hashCode()));
		System.out.println(Integer.toHexString(connection2.hashCode()));
		// nasa ideja je da ova dva hash koda prikazuju na istu vrednost 
		// u DatabaseConnection branimo pravljenje vise od jednog objekta
		
		// drug nacin - lazy loading
		DatabaseConnectionLazyLoading connectionLazy1 = DatabaseConnectionLazyLoading.getInstance();
		DatabaseConnectionLazyLoading connectionLazy2 = DatabaseConnectionLazyLoading.getInstance();
		
		System.out.println(connectionLazy1);
		System.out.println(connectionLazy2);
	}

}

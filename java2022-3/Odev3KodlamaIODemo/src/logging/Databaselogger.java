package logging;

public class Databaselogger implements Ilogger {

	@Override
	public void log() {
		System.out.println("Veritabanına Loglandı");
	}

}

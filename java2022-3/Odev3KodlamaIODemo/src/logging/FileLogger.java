package logging;

public class FileLogger implements Ilogger {

	@Override
	public void log() {
		System.out.println("Dosyaya Loglandı");
	}

}

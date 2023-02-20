package oopWhitNLayeredApp.core.logging;
//iplements logger gibi çalışacak anlamında
public class FileLogger implements Logger {
	@Override
	public void log(String data) {
		System.out.println("Dosyaya Loglandı:  "+data);
	}
	

}

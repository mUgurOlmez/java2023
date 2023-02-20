package logging;

public class MailLogger implements Ilogger {

	@Override
	public void log() {
		System.out.println("Mail Olarak loglandı");
	}

}

package youtubeDemo_;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		// Asker kredisine gore hesaplamaların yapılacağı alan
		System.out.println("Öğretmen Kredisi Hesaplandı");
	}

	public void save() {
		
	}
}

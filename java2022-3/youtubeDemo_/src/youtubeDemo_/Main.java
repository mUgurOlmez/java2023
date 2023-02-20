package youtubeDemo_;

public class Main {

	public static void main(String[] args) {
		//ioc container
		CostumerManager costumerManager = new CostumerManager(new Costumer(), new TeacherCreditManager());
		{
			costumerManager.giveCredit();

		}
	}
}

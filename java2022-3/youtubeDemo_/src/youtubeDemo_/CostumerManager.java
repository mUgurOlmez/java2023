package youtubeDemo_;

public class CostumerManager {
	private ICreditManager _creditManager;
	private Costumer costumer;
	public CostumerManager(Costumer costumer,ICreditManager creditManager) {
		this.costumer= costumer;
		_creditManager=creditManager;
	}
	public void save() {
		System.out.println("Müşteri Kaydedildi  ");
	}

	public void delete() {
		System.out.println("Müşteri Silindi  ");
	}
	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("Kredi Verildi");
		
	}
} 
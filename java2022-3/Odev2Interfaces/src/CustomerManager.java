
public class CustomerManager {
	
	
	private ICostumerDal customerdaDal;

	public CustomerManager(ICostumerDal customerDal) {
		
		this.customerdaDal=customerDal;
	} 
		
	

	public void add() {
		// iş kodları yazılır
		customerdaDal.add();

	}

}

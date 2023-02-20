package sesliHarflerEgitimCozumu;

public class main {

	public static void main(String[] args) {
		char harf='A';
		
		
		switch (harf) {
		case 'A': 
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
			default:
				System.out.println("ince sesli harf");
		}
		
		}

}

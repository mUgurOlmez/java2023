package sesliHarfler;

public class main {

	public static void main(String[] args) {
		char harf='A';
		boolean kalindir=true;		
		char[] kalinUnluHarf=new char[4];
		kalinUnluHarf[0]='A';
		kalinUnluHarf[1]='I';
		kalinUnluHarf[2]='O';
		kalinUnluHarf[3]='U';
		
		char[] inceUnluHarf=new char[4];
		inceUnluHarf[0]='E';
		inceUnluHarf[1]='İ';
		inceUnluHarf[2]='Ö';
		inceUnluHarf[3]='Ü';
		
		
		
		
		for(int i=0;i<=3;i++) {
			if(harf==kalinUnluHarf[i]) {
				System.out.println("kalın sesli harftir");
				return;
			}else {
				for(int j=0;j<=3;j++) {
					if(harf==inceUnluHarf[j]) {
						kalindir=false;
						System.out.println("ince sesli harftir");
						return;
				
			}else {
				
				System.out.println("yanlıs harf girdiniz");
				return;
			}
					
					}
					}
		}
				
				
	}

}

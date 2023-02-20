package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		//220-284
		int sayi1=200;
		int sayi2=284;
		int total1=0;
		int total2=0;
		
		for(int i=1;i<sayi1;i++) {
			if (sayi1%i==0) {
				total1=total1+i;
			}
			
		}
		for(int j=1;j<sayi2;j++) {
			if (sayi2%j==0) {
				total2=total2+j;
			}
			
		}
		
				if(total1==sayi2) {
			if(total2==sayi1)
			System.out.println("sayılar arkadaş sayıdır");
		}else {
			System.out.println("sayılar arkadaş sayı değildir");
		}
	}

}

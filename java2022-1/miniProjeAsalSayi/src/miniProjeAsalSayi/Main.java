package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
//bug hata acık
		int number=-4;
		int remainder = number%2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("asal sayı değildir");
			return;//metod peşin peşin bitirmeye yarıyor
		}
		if(number<1) {
			System.out.println("geçersiz sayı");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				isPrime=false;
			}
			
		}
		
		if(isPrime) {//kullanım true eşitse anlamında //bolean
			System.out.println("asal sayıdır ");
		}else {
			System.out.println("asal sayı değildir");
		}
		
		
		
		
		
		
	}

}

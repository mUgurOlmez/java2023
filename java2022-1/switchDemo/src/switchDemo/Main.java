package switchDemo;

public class Main {

	public static void main(String[] args) {
		//grade not
		char grade = 'C';
		switch(grade) {
		case 'A': //case durum demek
			System.out.println("Mükemmel : Geçtiniz");
			break;//kodu sonlandır
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;	
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef  : Kaldınız");
			break;
		default://girilen değer eşleşmiyorsa veya hatalı giriş yapıldıysa
				System.out.println("Geçersiz not girdiniz");
		}
		
	}

}

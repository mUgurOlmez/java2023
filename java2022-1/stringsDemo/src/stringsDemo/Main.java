package stringsDemo;

public class Main {

	public static void main(String[] args) {
	String mesaj = "  bugün hava çok güzel   ";
	System.out.println(mesaj);
		//System.out.println("Eleman sayısı  :"+mesaj.length());
		//System.out.println("3. eleman :  "+mesaj.charAt(4));//'ncı eleman bulma
		//System.out.println(mesaj.concat(" Yaşasın!"));//concat birleştirme
		//System.out.println(mesaj.startsWith("A"));//A ile başlıyorsa true değilse false deüeri döner
		//System.out.println(mesaj.endsWith("."));//. ile bitiyorsa true bitmiyorsa false döner
		//char[] karakterler = new char[5];
		//mesaj.getChars(0, 5, karakterler, 0);//karakterleri getir
		//System.out.println(karakterler);
		//System.out.println(mesaj.indexOf("av"));//kacıncı karakter a ilk bulduğunu verir fonksiyonu bitirir sağdan gelen ilk a
		//System.out.println(mesaj.lastIndexOf("a"));//aramaya sağdan başlar saymaya soldan başlar. soldan gelen ilk a
		
	String yeniMesaj = (mesaj.replace(' ', '-'));//karakter değiştirme metin belgesindeki bul değiştir gibi
	System.out.println(yeniMesaj);	//boşluklarda "-" değiştir
	System.out.println(mesaj.substring(2));//seçilen metinin seçilenden sonuna kadar al
	System.out.println(mesaj.substring(2,5));//2 den başla 5 e kadar al sonuncu dahıl olmaz
	
		for(String kelime : mesaj.split(" ")) {//parantez içindeki karaktere göre kelimeleri ayır
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());//küçük harflerle yazdırma
		System.out.println(mesaj.toUpperCase());//büyük harflerle yazdırma
		//aramalarda sıklıkla kullanılıyor
		
		System.out.println(mesaj.trim());//baştaki ve sonraki boşlukları siliyor
	
	
	
	}
	
	
	
	}


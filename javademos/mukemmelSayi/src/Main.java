public class Main {
    public static void main(String[] args) {
        int sayi = 0;
        int toplam = 0;
        for (int i = 1; i < 6; i++) {
            if (sayi % i == 0) {
                toplam = toplam + i;
            }


        }
        if (toplam == sayi) {
            System.out.println("mükemmel sayidir");
        } else {

            System.out.println("mükemmel sayi değildir");
        }
    }
}
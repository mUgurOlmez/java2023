public class Main {
    public static void main(String[] args) {
        int number = 2;

        if(number<2){
            System.out.println("Geçersiz sayı");
        }
        int kalan;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            kalan = number % i;
            if (kalan == 0) {
                isPrime = false;
            }

           }

            if(isPrime){
                System.out.println("asaldır");

            }else{
                System.out.println("asal değildir");
    }
}
}

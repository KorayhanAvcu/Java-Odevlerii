import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        int sayi = inp.nextInt();
        int toplam = 0,  sayac = 0;
        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                sayac++;

            }
        }
        System.out.print("Sonuc : " + (toplam / sayac));
        /*
            Eger girilen sayi dahilse aşağıdaki gibi olacak kod
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    toplam += i;
                    sayac++;

                }
            }
            System.out.print("Sonuc : " + (toplam / sayac));
        */

    }
}

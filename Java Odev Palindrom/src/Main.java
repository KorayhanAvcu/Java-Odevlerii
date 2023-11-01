import java.util.Scanner;
public class Main {
    static int isPalindrom(int sayi){
        int gcc=sayi, tersSayi=0, sonNumara;
        while(gcc!=0){
            sonNumara = gcc%10;
            tersSayi = (tersSayi*10)+sonNumara;
            gcc/=10;
        }

        if(sayi==tersSayi){
            return 1;
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);

        System.out.print("sayi giriniz : ");
        sayi=inp.nextInt();
        int sonuc = isPalindrom(sayi);
        if(sonuc==1){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Palindrom Degil!");
        }
    }

}
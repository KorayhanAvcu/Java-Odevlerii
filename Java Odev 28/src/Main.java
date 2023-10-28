import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi gireceksiniz :");
        n = input.nextInt() ;
        for(int i = 1 ; i < n ; i++){
            if(n%i==0){
                toplam+=i;
            }
        }
        if(n==1){
            System.out.print(n + " mukemmel sayi degildir");
        }
        else{
            if(toplam==n){
                System.out.print(n + " mukemmel sayidir");
            }
            else{
                System.out.print(n + " mukemmel sayi degildir");
            }
        }

    }
}
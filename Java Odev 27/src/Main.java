import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int enb=0,enk=0,n,sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac sayi gireceksiniz :");
        n = input.nextInt() ;
        for(int i = 0 ; i < n ; i++){
            System.out.print(i+1 + ". Sayiyi Giriniz : ");
            sayi=input.nextInt();
            if(i==0){
                enb=sayi;
                enk=sayi;
            }
            else{
                if(enb<sayi){
                    enb=sayi;
                }
                if(enk>sayi){
                    enk=sayi;
                }
            }
        }
        System.out.println("En buyuk sayi : " + enb);
        System.out.println("En kucuk sayi : " + enk);
    }
}
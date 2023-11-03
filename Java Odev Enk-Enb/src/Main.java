import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(list);
        Scanner inp = new Scanner(System.in);
        int enk = list[0];
        int enb = list[0];
        int sayi;
        System.out.print("Bir sayi giriniz : ");
        sayi = inp.nextInt();
        for (int i : list) {
            if(i<sayi){
                enk=i;
            }

        }
        for (int i : list) {
            if(i>sayi){
                enb=i;
                break;
            }

        }
        System.out.println("En Yakın Kucuk Değer " + enk);
        System.out.println("En Yakın Buyuk Değer " + enb);


    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,d=1, b=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz : ");
        n = inp.nextInt();
        System.out.print("4 'ün katları : ");
        while (d <= n){
            System.out.print(d + " ");
            d*=4;
        }

        System.out.println();
        System.out.print("5 'in katları : ");
        while (b <= n){
            System.out.print(b + " ");
            b*=5;
        }
    }
}

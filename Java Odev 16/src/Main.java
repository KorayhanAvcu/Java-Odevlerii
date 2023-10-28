import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        int yil = inp.nextInt();

        if((yil%4==0) && (yil%100!=0 || yil%400==0)){
            System.out.print(yil + " bir artik yildir");
        }
        else{
            System.out.print(yil + " bir artik yil degildir");
        }


    }
}
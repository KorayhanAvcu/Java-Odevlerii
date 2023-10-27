import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s1,s2,s3;

        Scanner input = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        s1= input.nextInt ();

        System.out.print("Ikinci sayiyi giriniz : ");
        s2= input.nextInt ();

        System.out.print("Ucuncu sayiyi giriniz : ");
        s3= input.nextInt ();
        if((s1<s2) && (s2<s3)){
            System.out.print(s1 + "<" + s2 + "<" + s3);
        }
        else if((s1<s3) && (s3<s2)){
            System.out.print(s1 + "<" + s3 + "<" + s2);
        }
        else if((s2<s1) && (s1<s3)){
            System.out.print(s2 + "<" + s1 + "<" + s3);
        }
        else if((s2<s3) && (s3<s1)){
            System.out.print(s2 + "<" + s3 + "<" + s1);
        }
        else if((s3<s1) && (s1<s2)){
            System.out.print(s3 + "<" + s1 + "<" + s2);
        }
        else if((s3<s2) && (s2<s1)){
            System.out.print(s3 + "<" + s2 + "<" + s1);
        }
    }
}
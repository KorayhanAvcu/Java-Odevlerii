import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int s1,s2, i;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Giriniz : ");
        s1 = inp.nextInt();
        System.out.print("Us Giriniz : ");
        s2 = inp.nextInt();
        double sonuc=1;
        for(i=0;i<s2;i++){
            sonuc*=s1;
        }
        System.out.println(s1 + "^" + s2 + " = " + sonuc);
    }
}

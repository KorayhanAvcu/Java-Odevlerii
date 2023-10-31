import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int taban,ust;
        Scanner inp = new Scanner(System.in);


        System.out.print("Taban giriniz : ");
        taban=inp.nextInt();
        System.out.print("Us giriniz : ");
        ust=inp.nextInt();
        System.out.println("Sonuc : " + ustAlma(taban,ust));
    }
    static int ustAlma(int taban,int ust){
        if(ust==0) return 1;
        else return taban*ustAlma(taban,ust-1);
    }
}
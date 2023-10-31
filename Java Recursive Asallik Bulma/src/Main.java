import java.util.Scanner;
public class Main {
    static int asalMi(int n,int m){
        if(n!=1){
            if(m==1) return 1;
            else{
                if(n%m==0) return 0;
                else return asalMi(n,m-1);
            }
        }
        else return 0;

    }
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);


        System.out.print("Pozitif bir tam sayi giriniz : ");
        n=inp.nextInt();
        if(n<=0){
            System.out.println("Hatali giris yaptiniz");
        }
        else{
            int sonuc = asalMi(n,n-1);
            if(sonuc==1){
                System.out.print(n + " Sayisi Asaldir!");
            }
            else{
                System.out.print(n + " Sayisi Asal değildir!");
            }
        }
    }


}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r, nfak=1,rfak=1,n_rfak=1,n_r, i;
        Scanner inp = new Scanner(System.in);
        System.out.print("N Giriniz : ");
        n = inp.nextInt();
        System.out.print("r Giriniz : ");
        r = inp.nextInt();
        n_r=n-r;
        for(i=1;i<=n;i++){
            nfak*=i;
        }
        for(i=1;i<=r;i++){
            rfak*=i;
        }
        for(i=1;i<=n_r;i++){
            n_rfak*=i;
        }
        double sonuc = nfak / (rfak*n_rfak);
        System.out.print("Sonuc : "+ sonuc);
    }
}

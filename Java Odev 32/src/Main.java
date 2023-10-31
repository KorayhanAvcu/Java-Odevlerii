import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);


        System.out.print("Pozitif bir tam sayi giriniz : ");
        n=inp.nextInt();
        recursiveIslem(n,n);
    }
    static void recursiveIslem(int sayi,int n){
        if(sayi<=0) System.out.print(sayi + " ");
        else{
            System.out.print(sayi + " ");
            recursiveIslem(sayi -5 ,n);
            if(sayi<=n){

                System.out.print(sayi + " ");
                sayi+=5;
            }
        }
    }
}
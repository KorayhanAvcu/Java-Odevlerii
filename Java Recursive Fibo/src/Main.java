import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        int[] fib;

        System.out.print("n giriniz : ");
        n=inp.nextInt();
        System.out.print("Sonuc : " + recursive_fibo(n));
    }
    static int recursive_fibo(int x){
        if(x==0) {
            
            return 0;
        }
        else if(x==1){

            return 1;
        }
        else {

            return recursive_fibo(x-2)+recursive_fibo(x-1);
        }
    }
}
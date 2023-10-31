import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2;
        Scanner inp = new Scanner(System.in);
        int ebob=1,ekok,i;

        System.out.print("n1 giriniz : ");
        n1=inp.nextInt();
        System.out.print("n2 giriniz : ");
        n2=inp.nextInt();
        if(n1>n2){
            i=n2;
            while(i>=1){

                if(n1%i==0 && n2%i==0){
                    ebob=i;
                    i=1;
                }
                i--;
            }
        }
        else{
            i=n1;
            while(i>=1){

                if(n1%i==0 && n2%i==0){
                    ebob=i;
                    i=1;
                }
                i--;
            }
        }
        System.out.println("EBOB : " +ebob);
        System.out.print("Ekok : " + ((n1*n2)/ebob));
    }

}
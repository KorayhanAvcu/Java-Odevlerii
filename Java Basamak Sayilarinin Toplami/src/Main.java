import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        sayi=inp.nextInt();
        while(sayi>10){
            toplam+=(sayi%10);
            sayi/=10;
        }
        toplam+=sayi;
        System.out.print(toplam);
    }
}
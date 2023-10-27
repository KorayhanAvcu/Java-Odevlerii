import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik,sayac=0;
        double toplam=0,avarage=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat= input.nextInt ();
        if(mat<0 || mat>100){
            toplam+=mat;

        }

        System.out.print("Türkce notunuz : ");
        turkce = input.nextInt();
        if(turkce<0 || turkce>100){
            toplam+=turkce;

        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt ();
        if(fizik<0 || fizik>100){
            toplam+=fizik;

        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100){
            toplam+=kimya;

        }

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt ();
        if(muzik<0 || muzik>100){
            toplam+=muzik;

        }

        if(sayac==5){
            avarage=0;
        }
        else{
            avarage = (mat+turkce+fizik+kimya+muzik-toplam)/5;
        }

        if (avarage <= 55) {
            System.out.println("Sinifta kaldiniz,seneye tekrar gorusmek uzere!");
            System.out.println("Ortalamaniz :" + avarage);
        }else{
            System.out.println("Tebrikler, sinifi gectiniz !");
            System.out.println("Ortalamaniz : " + avarage);
        }

    }
}
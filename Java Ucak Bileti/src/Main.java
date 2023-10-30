import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        double tutar;
        int yas, secim,mesafe;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz : ");
        mesafe=inp.nextInt();
        if(mesafe>0){
            tutar=mesafe*0.10;
            System.out.println("Tutar : "+tutar);
            System.out.print("Yasinizi Giriniz : ");
            yas=inp.nextInt();
            if(yas>=0){
                if(yas<12){
                    tutar-=(tutar*0.5);

                }
                else if(yas>=12 && yas<=24){
                    tutar-=(tutar*0.10);

                }
                else if(yas>65){
                    tutar-=(tutar*0.30);

                }

                System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
                secim=inp.nextInt();
                if(secim==1){
                    System.out.println("Toplam Tutar : " + tutar);
                }else if(secim==2){
                    tutar-=(tutar*0.20);
                    tutar*=2;
                    System.out.println("Toplam Tutar : " + tutar);
                }else{
                    System.out.println("Hatali veri girdiniz.");
                }
            }else{
                System.out.println("Hatali veri girdiniz.");
            }
        }else{
            System.out.println("Hatali veri girdiniz.");
        }
    }
}
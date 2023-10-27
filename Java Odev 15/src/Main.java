import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz: ");
        int dogumTarihi = scanner.nextInt();


        String burc = "";

        if (dogumTarihi%12 == 0) {
            burc = "Maymun";
        } else if (dogumTarihi%12 == 1) {
            burc = "Horoz";
        } else if (dogumTarihi%12 == 2) {
            burc = "Köpek";
        } else if (dogumTarihi%12 == 3) {
            burc = "Domuz";
        } else if (dogumTarihi%12 == 4) {
            burc = "Fare";
        } else if (dogumTarihi%12 == 5) {
            burc = "Öküz";
        } else if (dogumTarihi%12 == 6) {
            burc = "Kaplan";
        } else if (dogumTarihi%12 == 7) {
            burc = "Tavşan";
        } else if (dogumTarihi%12 == 8) {
            burc = "Ejderha";
        } else if (dogumTarihi%12 == 9) {
            burc = "Yılan";
        } else if (dogumTarihi%12 == 10) {
            burc = "At";
        } else if (dogumTarihi%12 == 11) {
            burc = "Koyun";
        }

        System.out.println("Cin Zodyagi Burcunuz: " + burc);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz : ");
        sicaklik= input.nextInt ();
        switch (sicaklik){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("Kayak yapin");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.print("Sinema gidin");
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                System.out.print("Piknige gidin");
                break;
            default:
                System.out.print("Yuzmeye gidin");
                break;
        }
    }
}
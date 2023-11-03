import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        int elemanSayisi,sayi;
        Scanner inp = new Scanner(System.in);

        System.out.printf("Dizinin boyutu n: ");
        elemanSayisi = inp.nextInt();
        int[] list = new int[elemanSayisi];
        int temp;
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i <elemanSayisi; i++) {
            System.out.print((i+1) + ". Elemani = ");
            sayi=inp.nextInt();
            list[i]=sayi;
        }
        for (int i = 0; i <elemanSayisi-1; i++) {
            for(int j = 1 ; j<elemanSayisi; j++){
                if(list[j] < list[i]){

                    int gcc = list[j];
                    list[j] = list[i];
                    list[i]=gcc;


                }
            }


        }
        for (int i = 0; i <elemanSayisi; i++) {
            System.out.println(list[i]);

        }
    }
}
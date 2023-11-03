import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int elemanSayisi,sayi;
        Scanner inp = new Scanner(System.in);

        System.out.printf("Dizinin boyutu n: ");
        elemanSayisi = inp.nextInt();
        int[] list = new int[elemanSayisi];
        for (int i = 0; i <elemanSayisi; i++) {
            System.out.print((i+1) + ". Elemani = ");
            sayi=inp.nextInt();
            list[i]=sayi;
        }
        int[] duplicate = new int[list.length];
        int startIndex = 0,sayac=0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j]) ) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;

                }

            }
        }
        for (int value: duplicate) {
            if (value != 0) {
                sayac++;
            }
        }
        int[] list2=new int[sayac];
        int j=0,sayac2=0;
        for (int value: duplicate) {
            if (value != 0) {
                list2[j] = value;
                j++;
            }
        }
        for(int i=0;i<list2.length; i++){
            for(int x=0; x< list.length; x++){
                if(list2[i]==list[x]){
                    sayac2++;
                }
            }
            System.out.println(list2[i] + " sayisi " + sayac2 + " kere tekrar edildi!");
            sayac2=0;
        }
    }
}
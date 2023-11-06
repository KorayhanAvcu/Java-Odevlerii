import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int satir,sutun;
        Scanner inp = new Scanner(System.in);
        System.out.print("Satir giriniz : ");
        satir=inp.nextInt();
        System.out.print("Sutun giriniz : ");
        sutun=inp.nextInt();
        int matrix[][] = new int[satir][sutun];
        int reverseMatrix[][] = new int[sutun][satir];
        for(int i=0 ; i<satir;i++){
            for(int j=0; j<sutun; j++){
                System.out.print("matrix[" + i + "]" + "[" + j + "] :");
                matrix[i][j]=inp.nextInt();
            }

        }

        for(int i=0 ; i<satir;i++){
            for(int j=0; j<sutun; j++){
                System.out.print(" [" + i + "]" + "[" + j + "] :" + matrix[i][j] + " ");

            }
            System.out.println();
        }

        for(int i=0 ; i<satir;i++){
            for(int j=0; j<sutun; j++){
                reverseMatrix[j][i]=matrix[i][j];

            }

        }
        System.out.println();
        for(int i=0 ; i<sutun;i++){
            for(int j=0; j<satir; j++){
                System.out.print(" [" + i + "]" + "[" + j + "] :" + reverseMatrix[i][j] + " ");

            }
            System.out.println();
        }
    }
}
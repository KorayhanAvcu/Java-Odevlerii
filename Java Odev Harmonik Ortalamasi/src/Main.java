public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,6};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0/numbers[i];

        }
        
        double sonuc = numbers.length / sum;
        System.out.print("Sonuc : " + sonuc);

    }
}
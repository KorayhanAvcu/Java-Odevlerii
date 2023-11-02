public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        int randomNum = (int)(Math.random() * 2);
        if(randomNum==1){
            System.out.println("Başlayan Dövüşçü: " + marc.name);
        } else {
            System.out.println("Başlayan Dövüşçü: " + alex.name);
            Fighter temp = marc;
            marc = alex;
            alex = temp;
        }
        r.run();
    }
}

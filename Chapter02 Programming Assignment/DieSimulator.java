import java.util.Random;

class DieSimulator{
    public static void main(String[]args) {
        System.out.println("Your result after rolling five dice is...");
        Random genRandom = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println((genRandom.nextInt(6) + 1));
        }
    }

}
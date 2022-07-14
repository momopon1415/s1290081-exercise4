import java.util.Random;

public class Heads_or_Tails {
    public static void main(String[] args) {
        Random random = new Random();
        int Heads = 0;
        int Tails = 0;
        System.out.println("Tossing a coin...");
        for (int i = 1; i < 4; i++) {
            int randomValue = random.nextInt(2);
            System.out.print("Round " + i + ": ");
            if (randomValue == 1) {
                System.out.println("Heads");
                Heads++;
            } else {
                System.out.println("Tails");
                Tails++;
            }
        }

        System.out.println("Heads: " + Heads + " Tails: " + Tails);

    }
}
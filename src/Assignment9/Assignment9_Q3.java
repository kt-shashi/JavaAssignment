package Assignment9;

import java.util.*;

public class Assignment9_Q3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input;
        char reDo;

        Random random = new Random();
        int card1 = random.nextInt(10) + 1;
        int card2 = random.nextInt(10) + 1;
        int card = random.nextInt(10) + 1;

        int total1 = card1 + card2;
        int total2 = total1 + card;

        System.out.print("First cards: " + card1 + ", " + card2 + "\n");
        System.out.print("Total: " + total1 + "\n");

        boolean loop = true;

        while (loop) {

            System.out.print("Do you want another card? (y/n): ");
            input = sc.nextLine();
            reDo = input.charAt(0);

            if (reDo == 'y' || reDo == 'Y') {
                System.out.print("Card: " + card + "\n");
                System.out.print("Total: " + total2 + "\n");
            } else if (reDo == 'n' || reDo == 'N')
                loop = false;

        }

    }
}

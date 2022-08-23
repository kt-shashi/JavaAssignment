    // Assignment 1
    // Question 2

    // Shashi Kant | 2021PGCACA050

    import java.util.Scanner;

    class Assignment1_Question2 {

        public static void main(String[] args) {

            // User input
            System.out.println("Enter a number: ");
            Scanner inputHelper = new Scanner(System.in);
            int n = inputHelper.nextInt();

            System.out.print("X  ");
            for (int i = 0; i < n; i++)
                System.out.print(i + " ");
            System.out.println();

            for (int i = 0; i < n; i++) {
                System.out.print(i + " " + " ");
                for (int j = 0; j < n; j++)
                    System.out.print((i * j) % n + " ");
                System.out.println();
            }

        }

    }

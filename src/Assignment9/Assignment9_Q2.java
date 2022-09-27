package Assignment9;

import java.util.*;

public class Assignment9_Q2 {

    static Map<String, String> loginDatabase = new HashMap<>();

    public static void main(String[] args) {

        Scanner inputHelper = new Scanner(System.in);

        int choice = 1;
        while (choice != 0) {
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Signup");
            System.out.println("2. Signin");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = inputHelper.nextInt();

            switch (choice) {
                case 1:
                    signup();
                    break;
                case 2:
                    signin();
                    break;
                case 3:
                    choice = 0;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

    public static void signup() {
        Scanner inputHelper = new Scanner(System.in);
        System.out.println("Enter ID");
        String id = inputHelper.nextLine();
        System.out.println("Enter password");
        String password = inputHelper.nextLine();
        if (loginDatabase.containsKey(id)) System.out.println("User already exist");
        else {
            loginDatabase.put(id, password);
            System.out.println("Account created");
        }
    }

    public static void signin() {
        Scanner inputHelper = new Scanner(System.in);

        System.out.println("Enter ID");
        String id = inputHelper.nextLine();
        System.out.println("Enter password");
        String password = inputHelper.nextLine();

        if (loginDatabase.containsKey(id)) {
            if (loginDatabase.get(id).equals(password))
                System.out.println("Login successful");
            else
                System.out.println("Invalid password");
        } else
            System.out.println("Invalid user");
    }

}

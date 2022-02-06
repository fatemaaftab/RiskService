package main.java;

import java.util.Scanner;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

//Scenario 1: if user login is seen
        final String IsUserKnown = "yes";
        //Additional functionality--> if the User is know, the user has three attempts to put in the correct password. Otherwise the login will be denied.
        for (int passAttempts = 0; passAttempts < 3; passAttempts++) {
            System.out.print("\nIs User Known: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (!(inputPass.equals(IsUserKnown))) {
                System.out.println("\nLogin Denied");
            } else {
                System.out.println("\nLogin Allowed!");
                break;
            }
        }
        // Scenario 2: if the computer ever seen before
        final String IsClientKnown = "yes";
        System.out.println("\n Is Client Known: ");
        Scanner input = new Scanner(System.in);
        String inputPass = input.nextLine();

        if (!(inputPass.equals(IsClientKnown))) {
            System.out.println("\nLogin Denied");
        } else {
            System.out.println("\nLogin Allowed!");
        }

        //Scenario 3: if the connecting IP ever seen before
        final String IsIPKnown = "10.97.2.1";
        System.out.println("\n Is IP Known: ");
        input = new Scanner(System.in);
        inputPass = input.nextLine();

        if (!(inputPass.equals(IsIPKnown))) {
            System.out.println("\nLogin Denied");
        } else {
            System.out.println("\nLogin Allowed!");
        }

        //Scenario 4: if the IP address is equal to the IP address above
        final String IsIPInternal = "10.97.2.0";
        System.out.println("\n Is IP Internal: ");
        input = new Scanner(System.in);
        inputPass = input.nextLine();

        if (!(inputPass.equals(IsIPInternal))) {
            System.out.println("\nLogin Denied");
        } else {
            System.out.println("\nLogin Allowed!");
        }

        //Scenario 5: Number of logins failed
        final String LastSuccessfulLoginDate= "Jan 21 2021";
        System.out.println("\n Is Last Successful Login Date: ");
        input = new Scanner(System.in);
        inputPass = input.nextLine();

        if (!(inputPass.equals(LastSuccessfulLoginDate))) {
            System.out.println("\nLogin Denied");
        } else {
            System.out.println("\nLogin Allowed!");
        }

        //Scenario 6: Number of logins failed
        final String LastFailedLoginDate= "March 1 2019";
        System.out.println("\n What is Last Failed Login Date: ");
        input = new Scanner(System.in);
        inputPass = input.nextLine();

        if (!(inputPass.equals(LastFailedLoginDate))) {
            System.out.println("\nLogin Denied");
        }

    }
}




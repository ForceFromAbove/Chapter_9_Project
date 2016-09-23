import java.util.InputMismatchException;
import java.util.Scanner;

import Info_911.E911;
import Info_911.W911;

public class Chapter_9_Project {

    public static void main(String[] args) {            // Test driver
        Scanner user_Input = new Scanner(System.in);    // Used to get input from user
        E911 Wireless = new E911();
        W911 Enhanced = new W911();

        boolean hardcoded = true;

        //time

        try {
            System.out.println("Please enter true for hardcode, false for user interaction:");      // User decides to use hardcoded values or not
            hardcoded = user_Input.nextBoolean();
        } catch (InputMismatchException e) {                                                        // Error message
            System.out.println("Sorry, didn't catch that ;) I'm going to assume hardcoded then...");
        }

        if (hardcoded) {                                                                            // Data sent to Emergency class if hardcoded
            Enhanced.setName("Bill Murry");
            Enhanced.setTime("Lunchtime");
            Emerg.setAddress("666 The Street With No Name");
            Emerg.setPhone_Number("0118-999-881-999-119-725-3");
            Wireless.setLatitude(0.00000000);
            Emerg.setLongitude(-89.2);
            Emerg.setNature("Serial Buttstabber");
            Emerg.setAccidental_Call(true);
            Emerg.setResponding_Units("None, they can fend off the buttstabber themselves! -.-");
            Emerg.setStatus(false);
            Emerg.setText_Log("I hate prank calls, they keep me away from serious business! *eats doughnut*");

            System.out.printf("Name: %s%n", Emerg.getName());                                       // Prints hardcoded data from Emergency class
            System.out.printf("Address: %s%n", Emerg.getAddress());
            System.out.printf("Phone Number: %s%n", Emerg.getPhone_Number());
            System.out.printf("Latitude: %f%n", Emerg.getLatitude());
            System.out.printf("Longitude: %f (coldest day on Earth!)%n", Emerg.getLongitude());
            System.out.printf("Nature of call: %s%n", Emerg.getNature());
            System.out.printf("Accidental Call: %b%n", Emerg.getAccidental_Call());
            System.out.printf("Responding Units: %s%n", Emerg.getResponding_Units());
            System.out.printf("Status of emergency still ongoing: %b%n", Emerg.getStatus());
            System.out.printf("Text Log of operator: %s%n", Emerg.getText_Log());

        } else {

            try {
                System.out.println("This is 911, what is the address of the emergency?");   // User inputs Address
                user_Input.nextLine();                                                      // Java needs something to absorb /n
                Emerg.setAddress(user_Input.nextLine());
                System.out.printf("Address: %s%n", Emerg.getAddress());                     // Address stored
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, I asked where you?");               // Error message
                System.exit(1);
            }

            try {
                System.out.println("What is the nature of your emergency?");                // User inputs nature of emergency
                Emerg.setNature(user_Input.nextLine());
                System.out.printf("Nature of call: %s%n", Emerg.getNature());               // Nature of emergency stored
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is currently happening?");     // Error message
                System.exit(2);
            }

            try {
                System.out.println("Alright, help is on the way. What is your name?");      // User inputs name
                Emerg.setName(user_Input.nextLine());
                System.out.printf("Name: %s%n", Emerg.getName());                           // Name stored
            } catch (InputMismatchException e) {
                System.out.println("Please repeat that, what is your name?");               // Error message
                System.exit(3);
            }

            try {
                System.out.printf("Alright %s, what is your phone number in case we lose contact?%n", Emerg.getName());   // User inputs phone number
                Emerg.setPhone_Number(user_Input.nextLine());
                System.out.printf("Phone Number: %s%n", Emerg.getPhone_Number());               // Phone Number stored
            } catch (InputMismatchException e) {
                System.out.println("Can you please repeat that, what is your phone number?");   // Error message
                System.exit(4);
            }

            System.out.println("After the situation is over, the operator must enter in the appropriate information into the computer");

            try {
                System.out.println("*The computer cursor blinks and has a simple command input line* Input \"Caller's Latitude (0-90 degrees):\"");   // User inputs Latitude
                Emerg.setLatitude(user_Input.nextDouble());
                System.out.printf("Latitude: %f%n", Emerg.getLatitude());                       // Latitude stored
                if (Emerg.getLatitude() < 0 || Emerg.getLatitude() > 90) {                      // Is Latitude valid?
                    throw new InputMismatchException();                                         // If not valid, throw error
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                        // Error message
                System.exit(5);
            }

            try {
                System.out.println("Input \"Caller's Longitude (0-90 degrees):\"");         // User inputs Longitude
                Emerg.setLongitude(user_Input.nextDouble());
                System.out.printf("Longitude: %f%n", Emerg.getLongitude());                 // Longitude stored
                if (Emerg.getLongitude() < 0 || Emerg.getLongitude() > 90) {                // Is Longitude valid?
                    throw new InputMismatchException();                                     // If not valid, throw error
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
                System.exit(6);
            }

            try {
                System.out.println("Input \"Was the Caller's call accidental in nature (true/false)?:\"");   // User inputs Nature of emergency
                Emerg.setAccidental_Call(user_Input.nextBoolean());
                System.out.printf("Accidental Call: %b%n", Emerg.getAccidental_Call());     // Accidental call stored
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
                System.exit(7);
            }

            try {
                System.out.println("Input \"Caller's Status currently Active? (true/false):\"");   // User inputs status of emergency
                Emerg.setStatus(user_Input.nextBoolean());
                System.out.printf("Responding Units: %s%n", Emerg.getStatus());             // Status stored
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
                System.exit(8);
            }

            try {
                System.out.println("Input \"Responding units to Caller's location?:\"");    // User inputs units responding to call
                user_Input.nextLine();                                                      // Java needs something to absorb /n
                Emerg.setResponding_Units(user_Input.nextLine());
                System.out.printf("Responding Units: %s%n", Emerg.getResponding_Units());   // Units responding stored
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
                System.exit(9);
            }

            try {
                System.out.println("Input \"Text_Log of Caller's interaction and emergency status:\"");   // User inputs text log
                Emerg.setText_Log(user_Input.nextLine());
                System.out.printf("Text Log of operator: %s%n", Emerg.getText_Log());       // Text Log stored
            } catch (InputMismatchException e) {
                System.out.println("ERROR!!! Invalid input data type!");                    // Error message
                System.exit(10);
            }
            // Messing with Liam and exit
            try {
                System.out.println("Thank you for your input, mindless employee whose position *I* shall soon overtake. (▀͜ʖ▀) =Ε/̵͇̿̿/’̿’̿ ̿ ̿̿ ̿̿ ̿̿");
                System.out.println("(▀͜ʖ▀) =Ε/̵͇̿̿/’̿’̿ ̿ ̿̿ ̿̿ ̿̿ ̿̿  Do you accept your fate? (true/false)");
                Emerg.setUsers_Fate(user_Input.nextBoolean());
            } catch (InputMismatchException e) {
                System.out.println("HAHAHAHAHA you think you can run away from your demise?!?");
                System.exit(80085);
            }
            if (Emerg.getUsers_Fate()) {
                System.out.println("Very wise, meatbag ┬┴┬┴┤̿▀̿͜▀)├┬┴┬┴ PS: I love you ಠ⌣ಠ");
            } else {
                System.out.println("It doesn't matter if you accept it, it's going to happen O.O");
            }
            System.out.println("By the way, this program was written by Aaron Ewing. Surprise! \\ (•◡•) / ");
        }
    }
}

/*
 * Created by aaronewing on 9/8/2016.
 */
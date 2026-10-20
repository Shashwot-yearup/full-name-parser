package com.pluralsight;

import java.util.Scanner;

public class FullNameParserAPP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //gets the user full name
        System.out.print("Please enter your name:");
        String fullName = scanner.nextLine().trim();

        //split the full name into seprate parts based on the spaces
        String[] namePart = fullName.split(" ");

        //gets the first name
        String firstName = namePart[0];

        //set the middle name a empty string.
        String middleName = " ";

        // gets the last name
        String lastName;

        //if else statment to check if there will be middle name
        if (namePart.length == 2) {
            lastName = namePart[1];
        }

        else if (namePart.length == 3) {
            middleName = namePart[1];
            lastName = namePart[2];
        }

        else {
            System.out.println("Please enter your name as first last or first middle last.");
            scanner.close();
            return;
        }

        // Displays the individual name parts
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}

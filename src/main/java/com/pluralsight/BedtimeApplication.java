package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class BedtimeApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int command;
        String input;

        try {
            //option 1
            FileReader fileReaderOne = new FileReader("src/main/goldilocks.txt");
            BufferedReader bufReaderOne = new BufferedReader(fileReaderOne);

            //sotry option
            BufferedReader storyOption = new BufferedReader(fileReaderOne);

            //option 2
            FileReader fileReaderTwo = new FileReader("src/main/hansel_and_gretel.txt");
            BufferedReader bufReaderTwo = new BufferedReader(fileReaderTwo);

            //option 3
            FileReader fileReaderThree = new FileReader("src/main/mary_had_a_little_lamb.txt");
            BufferedReader bufReaderThree = new BufferedReader(fileReaderThree);

            System.out.println("###############################");
            System.out.println("What option you want?: "
                    + "\n 1 - Goldi locks" +
                    "\n 2 - Hansel and Gretel" +
                    "\n 3 - MARY HAD A LITTLE LAMB, LITTLE LAMB");
            userInput = myScanner.nextLine();
            command = Integer.parseInt(userInput);
            switch (command) {
                case 1 -> {
                    storyOption = bufReaderOne;
                }
                case 2 -> {
                    storyOption = bufReaderTwo;
                }
                case 3 -> {
                    storyOption = bufReaderThree;
                }
                default -> {
                    System.out.println("invalid input");
                }

            }
            while ((input = storyOption.readLine()) != null) {
                System.out.println(input);
            }

            bufReaderOne.close();
            bufReaderTwo.close();
            bufReaderThree.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

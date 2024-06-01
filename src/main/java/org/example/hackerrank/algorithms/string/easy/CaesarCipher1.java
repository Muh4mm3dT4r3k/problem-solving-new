package org.example.hackerrank.algorithms.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CaesarCipher1 {
    private static final ArrayList<Character> LOWER_LETTERS =
            new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
    private static final ArrayList<Character> UPPER_LETTERS =
            new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'k', 'L',
                    'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'));

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner scanner = new Scanner(System.in);
        String userInput = getUserInput(scanner);
        int key = getKey(scanner);

        while (true) {
            int option= getOption(scanner);
            switch (option) {
                case 1:
                    userInput = encrypt(userInput, key);
                    System.out.print("Encrypted messaged: " + userInput + "\n");
                    break;
                case 2:
                    userInput = decrypt(userInput, key);
                    System.out.print("Decrypted messaged: " + userInput + "\n");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Wrong option!, Please choose 1 (encrypt), 2 (decrypt), or 0 (exit) and try again!");
            }
            scanner.nextLine();
            if (askForContinue(scanner)) {
                userInput = getUserInput(scanner);
                key = getKey(scanner);
            }else {
                System.out.println("Goodbye!");
                System.out.println("Exiting program...");
                System.exit(0);
            }

        }
    }

    private static boolean askForContinue (Scanner scanner) {
        System.out.print("Do you want to continue? (y/n): ");
        char c = scanner.nextLine().toLowerCase().charAt(0);
        while (true) {
            if (c == 'y') {
                return true;
            }
            if (c == 'n') {
                return false;
            }
            System.out.print("Invalid input! Try again enter y/n or yes/no: ");
            c = scanner.nextLine().toLowerCase().charAt(0);
        }

    }


    private static String getUserInput(Scanner in) {
        System.out.print("Enter the text you want to encrypt/decrypt: ");
        return in.nextLine();
    }

    private static int getKey(Scanner in) {
        System.out.print("Enter the encryption/decryption key (integer): ");
        while (!in.hasNextInt()) {
            System.out.println("Invalid key. Please enter an integer and try again.");
            in.nextLine();
        }
        return in.nextInt();
    }




    private static int getOption(Scanner in) {
        System.out.println("-------------------------");
        System.out.println("Choose an option: ");
        System.out.println("1 - Encrypt");
        System.out.println("2 - Decrypt");
        System.out.println("0 - Exit");
        System.out.print("Enter your choice: ");
        while (!in.hasNextInt()) {
            System.out.println("Invalid option. Please enter an integer(1, 2, or 0) Try again.");
            in.nextLine();
        }
        return in.nextInt();
    }

    private static String encrypt(String plainText, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            if(Character.isLetter(plainText.charAt(i))){
                if(Character.isUpperCase(plainText.charAt(i))){
                    int charIndex = UPPER_LETTERS.indexOf(plainText.charAt(i));
                    int shift = (charIndex + key) % 26 ;
                    encrypted.append(UPPER_LETTERS.get(shift));
                } else if(Character.isLowerCase(plainText.charAt(i))){
                    int charIndex = LOWER_LETTERS.indexOf(plainText.charAt(i));
                    int shift = (charIndex + key) % 26 ;
                    encrypted.append(LOWER_LETTERS.get(shift));
                }
            }else {
                encrypted.append(plainText.charAt(i));
            }
        }
        return encrypted.toString();
    }


    private static String decrypt(String cipherText, int key) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++) {
            if(Character.isLetter(cipherText.charAt(i))){
                if(Character.isUpperCase(cipherText.charAt(i))){
                    int charIndex = UPPER_LETTERS.indexOf(cipherText.charAt(i));
                    int shift = ((charIndex - key) % 26) < 0 ?
                            ((charIndex - key) % 26) + 26 :
                            (charIndex - key) % 26;
                    decrypted.append(UPPER_LETTERS.get(shift));
                } else if(Character.isLowerCase(cipherText.charAt(i))){
                    int charIndex = LOWER_LETTERS.indexOf(cipherText.charAt(i));
                    int shift = ((charIndex - key) % 26) < 0 ?
                            ((charIndex - key) % 26) + 26 :
                            (charIndex - key) % 26;

                    decrypted.append(LOWER_LETTERS.get(shift));
                }
            }else {
                decrypted.append(cipherText.charAt(i));
            }
        }
        return decrypted.toString();
    }

}

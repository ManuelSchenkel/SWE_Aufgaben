/*
 * Titel: StringManipulationen
 * Firma: ABB TS
 * Autor: Marco Bontognali

 * Aufgabenstellung:
 *
 * myString1 bis myString5 sollen manipuliert und dann
 * dem resultString zugewiesen werden. Die Manipulation
 * soll dem originalString entsprechen. (Dies wird mit
 * den Methoden toUpperCase(), toLowerCase(), trim()
 * und replace() realisiert).
 *
 * Anschliessend sollen die Manipulation mit equals() und
 * endsWith() überprüft werden.
 */

import java.util.Random;
import java.util.Scanner;

class StringManipulationen {
    public static void main(String[] args) {
        String myString1 = "Heute ";
        String myString2 = "XRBEITEN";
        String myString3 = "wir   ";
        String myString4 = "   mit";
        String myString5 = "Strings.";

        String resultString = "";
        String originalString = "HEUTE arbeiten wir mit Strings. ";

        //String Manipulation

        resultString = myString1.toUpperCase() + myString2.replace("X","A").toLowerCase().concat(" ")
                    + myString3.trim().concat(" ") + myString4.trim().concat(" ") + myString5.concat(" ");

        if (resultString.equals(originalString) && resultString.endsWith(" ")) {
            System.out.println("Strings stimmen überein");
        } else {
            System.out.println("Strings stimmen nicht überein");
        }

        //Satz-Generator
        String[] namen = {"Manuel", "Andrea", "Elina", "Linja"};
        String[] verben = {"kocht", "backt", "baut", "isst"};
        String[] nomen = {"Spaghetti","Kuchen","Häuser","Erdbeeren"};

        //Originalsätze definieren
        String[] originale = {"Manuel backt Kuchen", "Andrea isst Erdbeeren", "Elina baut Häuser"};
        int origCount = 0;

        for (int i = 1; i < 11 ; i++) {
            Random random = new Random();
            int wort = random.nextInt(namen.length);
            String satz = namen[wort];
            wort = random.nextInt(verben.length);
            satz = satz + " " + verben[wort];
            wort = random.nextInt(nomen.length);
            satz = satz + " " + nomen[wort];
            for (int j = 0; j < originale.length ; j++) {
                if(originale[j].equals(satz)) {
                    origCount++;
                    satz = satz.concat(" (original)");
                    break;
                }
            }

            System.out.println(i + ": " + satz);
        }
        System.out.println("Originale: " + origCount);

        //Palindrome
        Scanner input = new Scanner(System.in);
        System.out.println("Eingabe (Wort):");
        String eingabe = input.nextLine();
        if (checkPalindrome(eingabe)) {
            System.out.println(eingabe + " ist ein Palindrom");
        } else {
            System.out.println(eingabe + " ist kein Palindrom");
        }

        System.out.println("Eingabe (Satz):");
        eingabe = input.nextLine();
        String[] worte = eingabe.split(" ");
        for (String wort : worte) {
            if(checkPalindrome(wort)) {
                System.out.println(wort + " ist ein Palindrom");
            } else {
                System.out.println(wort + " ist kein Palindrom");
            }
        }

    }

    public static boolean checkPalindrome(String wort) {
        int tests;
        if (wort.length() % 2 == 1) {
            tests = (wort.length() - 1);
        } else {
            tests = wort.length();
        }

        tests = tests / 2;

        boolean isPalindrome = true;
        for (int i = 0; i < tests ; i++) {
            if(wort.toLowerCase().charAt(i) != wort.toLowerCase().charAt(wort.length()-(i+1))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}

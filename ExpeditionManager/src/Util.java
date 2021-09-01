import java.util.Scanner;

public class Util {
    public static int positiveInteger() {
        Scanner input = new Scanner(System.in);
        int zahl = 0;
        do {
            if(input.hasNextInt()) {
                zahl = input.nextInt();
                input.nextLine();
                if (zahl < 0) {
                    System.out.println("Ungültige Eingabe, nur positive Ganzzahlen erlaubt (true)");
                    System.out.println("Erneute Eingabe:");
                }
            } else {
                input.nextLine();
                System.out.println("Ungültige Eingabe, nur positive Ganzzahlen erlaubt (false)");
                System.out.println("Erneute Eingabe:");
            }
        } while (zahl <= 0);
        return zahl;
    }
}

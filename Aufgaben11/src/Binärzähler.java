import java.util.Scanner;

public class Binärzähler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Wert für Zähler eingeben:");
        if (input.hasNextInt()) {
            int eingabe = input.nextInt();
            for (int i = 0; i <= eingabe; i++) {
                System.out.println(Integer.toBinaryString(i));
            }
        }
    }
}


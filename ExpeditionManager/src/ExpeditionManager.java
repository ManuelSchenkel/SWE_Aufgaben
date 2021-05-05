import java.util.Scanner;

public class ExpeditionManager {
    public static void main(String[] args) {
        boolean runApp = true;
        int weight = 0, profit = 0;
        String name = "";

        while (runApp == true) {

            showMenu();

            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                int eingabe = input.nextInt();
                switch (eingabe) {
                    case 1:
                        System.out.println("Erfasse neuen Gegenstand");
                        System.out.println("Name:");
                        if (input.hasNext()) {
                            name = input.next();
                            input.nextLine();
                        }
                        System.out.println("Gewicht:");
                        weight = positiveInteger();
                        System.out.println("Profit:");
                        profit = positiveInteger();
                        pressEnter();
                        break;
                    case 2:
                        System.out.println("Starte Methode anschauen");
                        System.out.println("Name:" + name);
                        System.out.println("Gewicht:" + weight);
                        System.out.println("Profit:" + profit);
                        pressEnter();
                        break;
                    case 0:
                        System.out.println("Beende App");
                        runApp = false;
                        break;
                    default:
                        System.out.println("Ungültige Eingabe");
                        break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("Expedition");
        System.out.println("1. erfassen");
        System.out.println("2. anzeigen");
        System.out.println("3. öffnen");
        System.out.println("4. speichern");
        System.out.println("5. Limite setzen");
        System.out.println("6. Algorithmus wählen");
        System.out.println("7. Packung optimieren");
        System.out.println("8. Hilfe");
        System.out.println("9. Info");
        System.out.println("0. App beenden");
        System.out.println("");
        System.out.println("Ihre Eingabe:");
    }

    public static void pressEnter() {
        System.out.println("Press enter to continue...");
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }

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

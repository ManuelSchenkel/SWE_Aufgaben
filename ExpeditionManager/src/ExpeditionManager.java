import java.util.ArrayList;
import java.util.Scanner;

public class ExpeditionManager {
    static ArrayList<Item> items = new ArrayList<Item>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        boolean runApp = true;
        Item item = null;

        while (runApp == true) {
            showMenu();

            if (input.hasNextInt()) {
                int eingabe = input.nextInt();
                switch (eingabe) {
                    case 1:
                        add();
                        pressEnter();
                        break;
                    case 2:
                        System.out.println("[+] Gegenstand anzeigen");
                        if (items != null) {
                            items.forEach((e) -> System.out.println(e));

                        } else {
                            System.out.println("Es wurde noch kein Gegenstand erfasst");
                        }
                        pressEnter();
                        break;
                    case 0:
                        System.out.println("[+] Beende App");
                        runApp = false;
                        break;
                    default:
                        System.out.println("[+] Ungültige Eingabe");
                        break;
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("Expedition");
        System.out.println("1. Gegenstand erfassen");
        System.out.println("2. Gegenstand anzeigen");
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

    static void add() {
        String name = null;
        System.out.println("[+] Erfasse neuen Gegenstand");
        System.out.println("Name:");
        if (input.hasNext()) {
            name = input.next();
            input.nextLine();
        }
        System.out.println("Gewicht:");
        int weight = Util.positiveInteger();
        System.out.println("Profit:");
        int profit = Util.positiveInteger();
        System.out.println("Gegenstand wurde erfasst");
        Item item = new Item(name, weight, profit);
        items.add(item);
    }

}

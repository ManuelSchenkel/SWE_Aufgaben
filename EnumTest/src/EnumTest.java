public class EnumTest {
    public static void main(String[] args) {
        //Stellt die definierten Werte zur Verfügung und
        //steuert, welche Werte zugewiesen können
        Wochentag day = Wochentag.FR;

        switch (day) {
            case MO: case DI: case MI: case DO: case FR: {
                System.out.println("Arbeitstag");
                break;
            }
            case SA: case SO: {
                System.out.println("Wochenende");
                break;
            }
            default: {
                System.out.println("???");
            }

        }

        //Gibt den "Index" des Werts in der Enum Klasse an
        System.out.println("Ordinal: " + day.ordinal());

        if (day.equals(Wochentag.SO)) {
            System.out.println("Heute ist Sonntag");
        }

        Wochentag[] wochentage = Wochentag.values();
        System.out.println("Anzahl Wochentage in Enum Klasse: " + wochentage.length);

        for (Wochentag tag : wochentage) {
            System.out.println(tag);
        }
    }
}

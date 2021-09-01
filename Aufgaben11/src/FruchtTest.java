public class FruchtTest {
    public static void main(String[] args) {
        Frucht frucht = Frucht.Apfel;

        switch (frucht) {
            case Apfel: case Birne: {
                System.out.println("Kernobst");
                break;
            }
            case Kiwi: case Mango: {
                System.out.println("Exotisch");
                break;
            }
            default: {
                System.out.println("???");
            }

        }

        //Gibt den "Index" des Werts in der Enum Klasse an
        System.out.println("Ordinal: " + frucht.ordinal());
        String frucht2 = "Kiwi";
        if (frucht2.equals(Frucht.Kiwi.toString())) {
            System.out.println("Ist auch ein Vogel");
        }

        Frucht[] fruechte = Frucht.values();
        System.out.println("Anzahl Früchte in Enum Klasse: " + fruechte.length);

        for (Frucht fruechtchen : fruechte) {
            System.out.println(fruechtchen);
        }
    }
}

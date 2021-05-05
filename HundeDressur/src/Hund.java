public class Hund {
    String name;
    int gewicht;

    void gibLaut(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            gibLautNachGewicht();
        }
    }

    void gibLautNachGewicht() {
        if (gewicht < 5) {
            System.out.println("Kläff");
        } else {
            System.out.println("Wuff");
        }
    }
}

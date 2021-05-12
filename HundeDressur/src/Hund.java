public class Hund {
    private String name;
    private int gewicht;

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Hund Name: " + name + ", Gewicht " + gewicht;
    }

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

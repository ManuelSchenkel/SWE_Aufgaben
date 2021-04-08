public class JavaBasics {
    public static void main(String[] args) {
        System.out.println("Hallo");

        boolean runden = true;
        int anzahl;
        double summe = 0;
        double schnitt;
        String text = "Der Durchscnitt ist ";
        int[] zahlen = {5, 7, 2, 9, 15};

        anzahl = zahlen.length;
        for (int i = 0; i < anzahl; i++) {
            summe = summe + zahlen[i];
        }
        System.out.println(summe);

        schnitt = summe / anzahl;
        if (runden) {
            schnitt = Math.round(schnitt);
        }
        System.out.println(schnitt);
        schnitt = rechneSumme(zahlen) / anzahl;
        System.out.println(schnitt);
    }

    static double rechneSumme(int[] zahlen) {
        double rSumme = 0;
        for (int zahl : zahlen) {
            rSumme += zahl;
        }
        return rSumme;
    }
}

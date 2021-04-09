public class AufgabenSerieA {

    public static void main(String[] args) {
        //Raum un Zeit
        //1 Distanz
        double xDifferenz, yDifferenz, distanz;
        int xPosition1 = 165;
        int xPosition2 = 142;
        int yPosition1 = 142;
        int yPosition2 = 131;

        xDifferenz = xPosition1 - xPosition2;
        yDifferenz = yPosition1 - yPosition2;
        distanz = Math.sqrt(Math.pow(xDifferenz,2) + Math.pow(yDifferenz, 2));
        System.out.println("Distanz zwischen X und Y: " + distanz);

        //2 Zeiteinheiten umwandeln #1
        int sekunden = 5;
        int minuten = 3;
        int stunden = 1;

        int zeitInSekunden = (stunden * 3600) + (minuten * 60) + sekunden;
        System.out.println("Zeit in Sekunden: " + zeitInSekunden);

        //3 Zeiteinheiten umwandeln #2
        sekunden = 5000;
        stunden = sekunden / 3600;
        minuten = (sekunden % 3600) / 60;
        int restSekunden = (sekunden % 3600) % 60;
        System.out.println("Stunden: " + stunden);
        System.out.println("Minuten: " + minuten);
        System.out.println("Sekunden: " + restSekunden);

        //4 Reisezeit
        distanz = 300; //km
        double geschwindigkeit = 120; //km/h
        double reisezeit = distanz / geschwindigkeit;
        System.out.println("Reisezeit: " + reisezeit);

        //Aufgabe 5 Brüche multiplizieren
        int zaehler1 = 3, nenner1 = 4;
        int zaehler2 = 5, nenner2 = 6;
        int zaehler3 = zaehler1 * zaehler2;
        int nenner3 = nenner1 * nenner2;
        System.out.println("Bruch: " + zaehler3 + "/" + nenner3);

        //Aufgabe 6 Brüche dividieren
        int zaehler4 = zaehler1 * nenner2;
        int nenner4 = nenner1 * zaehler2;
        System.out.println("Bruch: " + zaehler4 + "/" + nenner4);

        //Aufgabe 7 Monate ausgeben
        String[] monate = {"Januar","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
        System.out.println(monate[4]);

        //Aufgabe 8 Tage summieren
        int[] tageProMonat = {31,28,31,30,31,30,31,31,30,31,30,31};
        int summeTage = 0;
        for (int i = 3; i < 7; i++) {
            summeTage = summeTage + tageProMonat[i-1];
        }
        System.out.println(summeTage);

        //Aufgabe 9 Tage seit Zeitrechnung
        int tag = 7, monat = 10, jahr = 2016;
        int tageJahre = (jahr-1) * 365;
        int tageMonate = 0;
        for (int i = 0; i < monat-1; i++) {
            tageMonate = tageMonate + tageProMonat[i];
        }
        summeTage = tageJahre + tageMonate + tag;
        System.out.println(summeTage);

    }
}

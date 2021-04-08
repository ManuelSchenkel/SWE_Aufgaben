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

    }
}

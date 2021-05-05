class Ort {
    String name;
    int xPosition;
    int yPosition;

    void anzeigen() {
        System.out.println("Ort: " + name);
        System.out.println("xPosition: " + xPosition);
        System.out.println("yPosition: " + yPosition);
    }

    double rechneDistanz(Ort ziel) {
        double xDifferenz, yDifferenz, distanz;
        xDifferenz = xPosition - ziel.xPosition;
        yDifferenz = yPosition - ziel.yPosition;
        distanz = Math.sqrt(Math.pow(xDifferenz,2) + Math.pow(yDifferenz, 2));
        return distanz;
    }
}
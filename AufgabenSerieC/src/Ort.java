// Titel:          Trainingsserie B
// Autor:          Marco Bontognali
// Firma:          ABB TS
// Beschreibung:   Einfache Klasse.

class Ort {
  private String name;
  private int xPos;        // km, Genf = 0
  private int yPos;        // km, Genf = 0

  Ort(String name, int xPos, int yPos) {
    this.name = name;
    this.xPos = xPos;
    this.yPos = yPos;
  }

  public int getxPos() {
    return xPos;
  }

  public int getyPos() {
    return yPos;
  }

  // Luftlinie in km
  public double rechneDistanz(Ort ziel) {
    double a = ziel.xPos - xPos;
    double b = ziel.yPos - yPos;
    return Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
  }
  
  public String toString() {
    return name + ": " + xPos + " km, " + yPos + " km";
  }

  public String getName() {
    return name;
  }
}



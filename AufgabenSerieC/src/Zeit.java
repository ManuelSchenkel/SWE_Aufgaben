// Titel:          Trainingsserie B
// Autor:          Marco Bontognali
// Firma:          ABB TS
// Beschreibung:   Einfache Klasse.

class Zeit {
  private int sekunden;
  private int minuten;
  private int stunden;
  
  public Zeit(int stunden, int minuten, int sekunden) {
    this.stunden = stunden;
    this.minuten = minuten;
    this.sekunden = sekunden;
  }

  // Stunden  mit Nachkommastellen
  public Zeit(double stunden) {
    this((int)(stunden * 3600));
  }
  
  // Wandelt in Sekunden, Minuten, Stunden um
  public Zeit(int sek) {
    setSekMinStd(sek);
  }
  
  // Wandelt Zeit in Sekunden um
  public int inSekunden() {
    return stunden * 3600 + minuten * 60 + sekunden;
  }

  // Wandelt Zeit in Sekunden, Minuten und Stunden um und speichert diese ab
  public void setSekMinStd(int sek) {
    stunden = sek / 3600;
    int rest = sek % 3600;
    minuten = rest / 60;
    sekunden = rest % 60;
  }

  // Addiert zwei Zeiten
  public Zeit add(Zeit zeit) {
    int sek = inSekunden() + zeit.inSekunden();
    return new Zeit(sek);
  }
  
  public String toString() {
    return stunden + ":" + minuten + ":" + sekunden;
  }

  public int getSekunden() {
    return sekunden;
  }

  public int getMinuten() {
    return minuten;
  }

  public int getStunden() {
    return stunden;
  }
}

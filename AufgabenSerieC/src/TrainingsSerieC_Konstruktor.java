// Titel:          Trainingsserie B
// Autor:          Marco Bontognali
// Firma:          ABB TS
// Beschreibung:   Einfache Klasse mit Konstruktor.

class TrainingsSerieC_Konstruktor {
    static final int ZU_FUSS = 5;
    static final int VELO = 15;
    static final int AUTO = 80;
    static final int ZUG = 100;
    static final int FLUGZEUG = 500;

    public static void main(String[] args) {
        Route route = new Route(ZUG);

        route.add(new Ort("Genf",0, 0));
        route.add(new Ort("Baden",165, 142));
        route.add(new Ort("Zürich",185, 31));
        route.add(new Ort("Chur",262, 73));

        route.anzeigen();
    }
}

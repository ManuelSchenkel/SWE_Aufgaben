import java.util.ArrayList;
import java.util.List;

public class Route {

    private List<Ort> orte;
    private int geschwindigkeit;

    public Route(int geschwindigkeit) {
        orte = new ArrayList<>();
        this.geschwindigkeit = geschwindigkeit;

    }

    public void add(Ort ort) {
        orte.add(ort);
    }

    public void anzeigen() {
        StringBuilder route = new StringBuilder();
        for (Ort ort : orte ) {
            if (ort == orte.get(orte.size()-1)) {
                route.append(ort.getName());
            } else {
                route.append(ort.getName() + " -> ");
            }
        }
        System.out.println("Route: " + route);
        System.out.println("Distanz: " + rechneDistanz() + " km");
        System.out.println("Reisezeit: " + rechneReisezeit(geschwindigkeit) + " (HH:mm:ss)");

        //System.out.println(System.currentTimeMillis());
        Zeit startZeit = new Zeit(15,20,0);
        System.out.println("Ankunftszeit: " + rechneAnkunft(startZeit, geschwindigkeit) + " Uhr");
        //System.out.println(startZeit);
    }

    public double rechneDistanz() {
        double distanz = 0;
        for (int i = 0; i < orte.size()-1; i++) {
            distanz += orte.get(i).rechneDistanz(orte.get(i+1));
        }
        return Math.round(distanz);
    }

    public Zeit rechneReisezeit(int geschwindigkeit) {
        double reiseZeit = rechneDistanz()/geschwindigkeit;
        Zeit zeit = new Zeit(reiseZeit);
        return zeit;

    }

    public Zeit rechneAnkunft(Zeit start, int geschwindigkeit) {
        return start.add(rechneReisezeit(geschwindigkeit));
    }

}

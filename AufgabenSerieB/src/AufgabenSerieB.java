import java.text.DecimalFormat;

public class AufgabenSerieB {
    public static void main(String[] args) {
        Ort a = new Ort();
        a.name = "Baden";
        a.xPosition = 165;
        a.yPosition = 142;

        Ort b = new Ort();
        b.name = "Zürich";
        b.xPosition = 185;
        b.yPosition = 131;

        DecimalFormat formatter = new DecimalFormat("#.###");

        //a.anzeigen();
        System.out.println("Distanz: " + formatter.format(a.rechneDistanz(b)) + " km");
        //System.out.println(formatter.format(b.rechneDistanz(a)));

        Zeit c = new Zeit();
        Zeit d = new Zeit();
        Zeit e;

        c.stunden = 0;
        c.minuten = 45;
        c.sekunden = 50;

        d.stunden = 1;
        d.minuten = 45;
        d.sekunden = 50;

        e = c.add(d);
        e.anzeigen();
    }
}




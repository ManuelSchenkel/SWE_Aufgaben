public class HundeDressur {
    public static void main(String[] args) {
        Hund fido = new Hund();
        fido.name = "Fido";
        fido.gewicht = 4;
        Hund bello = new Hund();
        bello.name = "Bello";
        bello.gewicht = 12;

        System.out.println(fido.name + " ist " + fido.gewicht + " kg schwer.");
        System.out.println(bello.name + " ist " + bello.gewicht + " kg schwer.");
        fido.gibLaut(4);
        bello.gibLaut(3);
    }
}

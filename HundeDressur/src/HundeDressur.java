public class HundeDressur {
    public static void main(String[] args) {
        Hund fido = new Hund();
        fido.setName("Fido");
        fido.setGewicht(4);
        Hund bello = new Hund();
        bello.setName("Bello");
        bello.setGewicht(12);

        fido.gibLaut(4);
        bello.gibLaut(3);
        System.out.println(fido);
        System.out.println(bello);
    }
}
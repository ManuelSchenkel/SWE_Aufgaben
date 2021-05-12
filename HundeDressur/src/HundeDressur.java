public class HundeDressur {
    public static void main(String[] args) {
        Hund fido = new Hund();
        fido.setName("Fido");
        fido.setGewicht(4);
        Hund bello = new Hund();
        bello.setName("Bello");
        bello.setGewicht(12);

        System.out.println(fido.getName() + " ist " + fido.getGewicht() + " kg schwer.");
        System.out.println(bello.getName() + " ist " + bello.getGewicht() + " kg schwer.");
        fido.gibLaut(4);
        bello.gibLaut(3);
        System.out.println(fido);
        System.out.println(bello);
    }
}
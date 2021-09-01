import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();

        liste.add("Mars");
        liste.add("Venus");
        liste.add("Jupiter");
        System.out.println(liste.size());
        liste.remove(1);
        System.out.println(liste.size());
        System.out.println(liste.get(1));

        for ( String wort : liste ) {
            System.out.println(wort);
        }

    }
}

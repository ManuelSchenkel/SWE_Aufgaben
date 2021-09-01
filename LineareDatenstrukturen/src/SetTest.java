import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<>(); //Abspeicherung kann wahllos erfolgen
        Set<String> set = new LinkedHashSet<>(); //Abspeicherung erfolgt nach Einfügereihenfolge

        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        set.add("9");
        set.add("10");

        System.out.println(set);
        set.remove("a");
    }
}

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");

        System.out.println(list);
        System.out.println(list.get(1));
        list.set(0, "x");
        System.out.println(list);
        list.add(1, "y");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        List<String> list2 = new ArrayList<>();
        list2.add("c");
        list.removeAll(list2);
        System.out.println(list);

        List<Person> team = new ArrayList<>();
        team.add(new Person("Mike", 25));
        team.add(new Person("John", 27));
        System.out.println(team);
    }
}



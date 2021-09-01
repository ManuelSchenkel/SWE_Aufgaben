import java.lang.reflect.Method;
import java.util.ArrayList;

public class PerformanceTest {
    static ArrayList<String> liste = new ArrayList<>();
    static long time, duration;

    public static void main(String[] args) {


        for (int i = 0; i < 1000000; i++) {
            liste.add("String " + i );
        }

        runOperation("add", 10);
        System.out.println("Runtime: " + duration);
        runOperation("remove", 10);
        System.out.println("Runtime: " + duration);
        runOperation("read", 499999);
        System.out.println("Runtime: " + duration);
        runOperation("write", 499999);
        System.out.println("Runtime: " + duration);

    }

    public static void runOperation(String operation, int position) {
    switch (operation) {

        case "add":
                time = System.nanoTime();
                liste.add(position, "new object");
                duration = (System.nanoTime() - time)/1000;
            case "remove":
                time = System.nanoTime();
                liste.remove(position);
                duration = (System.nanoTime() - time)/1000;
            case "read":
                time = System.nanoTime();
                liste.get(position);
                duration = (System.nanoTime() - time)/1000;
            case "write":
                time = System.nanoTime();
                liste.set(position, "new object");
                duration = (System.nanoTime() - time)/1000;
        }
    }
}

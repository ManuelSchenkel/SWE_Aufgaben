import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Map<String, String> map = new HashMap<>();
        Map<String, String> map = new LinkedHashMap<>();

        map.put("a", "AAAAAAAAAAAA");
        map.put("b", "BBBBBBBBBBBB");
        map.put("c", "CCCCCCCCCCCC");
        map.put("d", "DDDDDDDDDDDD");
        map.put("e", "EEEEEEEEEEEE");

        System.out.println(map);
        System.out.println(map.get("a"));
        System.out.println(map.get("c"));
        map.remove("d");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}

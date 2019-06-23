import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        people.put(123, "Ala");
        people.put(456, "Jan");
        people.put(789, "Karol");

    Set<Integer> keys = people.keySet();

        for (Integer key : keys) {
            System.out.println(key);
        }

        Collection<String> values = people.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<Integer, String>> entries = people.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }


//
//        System.out.println(people.get(456));
//        System.out.println(people.keySet());
//        System.out.println(people.entrySet());
//        System.out.println(people.size());

    }
}

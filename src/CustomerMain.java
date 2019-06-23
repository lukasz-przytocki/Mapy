import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomerMain {
    public static void main(String[] args) {

        HashMap<Integer, Customer> people = new HashMap<>();
        people.put(123, new Customer(123, "Jan", "Kowalski", 5050));
        people.put(456, new Customer(456, "Natalia", "Nowak", 2424));
        people.put(789, new Customer(789, "Filip", "Jezioro", 123454));
        people.put(112, new Customer(112, "Krystyna", "Awa", 45456));

        Set<Integer> keys = people.keySet();

        for (Integer key : keys) {
            System.out.println("Klucze: "+ key);

        }
        Collection<Customer> values = people.values();
        for (Customer value : values) {
            System.out.println(value);
        }

//        Set<Map.Entry<Integer, Customer>> entries = people.entrySet();
//        for (Map.Entry<Integer, Customer> entry : entries) {
//            System.out.println(entry);
//        }


        System.out.println(people.keySet());
        System.out.println(people.values());


    }
}

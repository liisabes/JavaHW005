import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void countOfNames(String[] people) {
        Map<String, Integer> namePeople = new HashMap<>();

        for (String person : people) {
            String name = person.split(" ")[0];
            if (namePeople.containsKey(name)) {
                namePeople.put(name, namePeople.get(name) + 1);
            } else {
                namePeople.put(name, 1);
            }
        }
        System.out.println(namePeople);
    }

}
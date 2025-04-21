
import java.util.*;

public class Test1a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> mapC = new HashMap<>();
        mapC.put("123", "Justin");
        mapC.put("456", "Owen");
        mapC.put("789", "Hugo");

        Map<String, String> mapD = new HashMap<>();
        mapD.put("123", "George");
        mapD.put("555", "Jack");
        mapD.put("888", "Julian");

        System.out.println("mapC: " + mapC);
        System.out.println("mapD: " + mapD);

        // Combine mapD into mapC (overwriting any same keys)
        mapC.putAll(mapD);

        // Print the merged map
        System.out.println("Combined employee map (mapC): " + mapC + "\n");

        System.out.println("When putAll is executed, the value associated with \"123\" in mapC gets replaced with \"George\".\n" +
                "So the value \"Justin\" is removed (overwritten), and that’s why it no longer appears in the result. " + "\n");

        System.out.print("Values where key contains '5': ");
        for (Map.Entry<String, String> entry : mapC.entrySet()) {
            if (entry.getKey().contains("5")) {
                System.out.print(entry.getValue() + " ");
            }
        }
        System.out.println();
        System.out.println("Map before removing entries with 'o': " + mapC);

        Iterator<Map.Entry<String, String>> iterator = mapC.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().toLowerCase().contains("o")) {
                iterator.remove();
            }
        }

        System.out.println("Map after removing entries with 'o': " + mapC + "\n");

        String str = "111222888222555";
        System.out.println("Original string: " + str);

        // Reverse
        str = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + str);


        int lastIndex = str.lastIndexOf("222");
        if (lastIndex != -1) {
            str = str.substring(0, lastIndex) + "aaa" + str.substring(lastIndex + 3);
        }
        System.out.println("After replacing last '222' with 'aaa': " + str);

        scanner.close();
    }
}

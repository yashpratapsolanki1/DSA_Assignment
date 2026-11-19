import java.util.HashMap;
import java.util.Map;
public class HashMapFrequency {
    public static void main(String[] args) {
        int[] values = {2, 3, 2, 5, 3, 2, 8};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : values)
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet())
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
    }
}
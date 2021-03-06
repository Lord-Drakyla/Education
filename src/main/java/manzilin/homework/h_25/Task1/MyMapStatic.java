package manzilin.homework.h_25.Task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyMapStatic<K,V> extends HashMap {
    /**
     * Ожидается, что будет такого типа, хотя сработает и для других.
     * Map<String, String> mymap = new HashMap<>();
     *
     * Варианты заполнения [набора] из [карты]
     * Set<String> set = new HashSet<>()
     * for (String s:map.values()) {
     * set.add(s);
     * }
     *
     * Set<String> set = new HashSet<>()
     * set.addAll(map.values());
     *
     *
     * @return -
     */
    public static boolean isUniqueSimple(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        return set.size() == map.values().size();
    }
}

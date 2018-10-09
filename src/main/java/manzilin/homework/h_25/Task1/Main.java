package manzilin.homework.h_25.Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String> mymap = new HashMap<>();

        mymap.put("Вася", "Иванов");
        mymap.put("Петр", "Петров");
        mymap.put("Виктор", "Сидоров");
        mymap.put("Сергей", "Савельев");
        mymap.put("Вадим", "Викторов");
        System.out.println("Для первого случая " + isUniqueSimple(mymap));

        mymap.put("Вася", "Иванов");
        mymap.put("Петр", "Петров");
        mymap.put("Виктор", "Иванов");
        mymap.put("Сергей", "Савельев");
        mymap.put("Вадим", "Петров");
        System.out.println("Для второго случая " + isUniqueSimple(mymap));

    }

    /**
     *
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
     * @param map
     * @return
     */
    static public boolean isUniqueSimple(Map<String, String> map) {
        Set<String> set = new HashSet<>(map.values());
        return set.size() == map.values().size();
    }
}

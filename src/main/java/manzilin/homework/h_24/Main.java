package manzilin.homework.h_24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    private static String[] test = new String[]{"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"};

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        for (String s : test
        ) {
            if (s != null) set.add(s);
        }

        System.out.println(set);
        set = removeEvenLength(set);
        System.out.println(set);


    }

    /**
     * Удаляет из Множества все четные элементы.
     * <p>
     * Можно было добавить иным образом
     * Set<String> newSet = new HashSet<>();
     * newSet.addAll(set);
     *
     * @param set - Множество изначальное
     * @return - исправленное множество.
     */
    public static Set<String> removeEvenLength(Set<String> set) {
        Set<String> newSet = new HashSet<String>(Arrays.asList(test));
        for (String s : set) {
            if (s.length() % 2 == 0) newSet.remove(s);
        }

        return newSet;
    }
}

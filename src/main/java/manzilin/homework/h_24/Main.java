package manzilin.homework.h_24;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    private static String[] test = new String[]{"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude", null};

    /**
     * Можно было добавить иным образом
     * for (String s : test
     * ) {
     * if (s != null) set.add(s);
     * }
     */
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(Arrays.asList(test));
        System.out.println(set);
        set = removeEvenLength(set);
        System.out.println(set);

    }

    /**
     * Удаляет из Множества все четные элементы.
     *
     * @param set - Множество изначальное
     * @return - исправленное множество.
     */
    public static Set<String> removeEvenLength(@NotNull Set<String> set) {
        Set<String> newSet = new LinkedHashSet<>();
        set.remove(null);
        newSet.addAll(set);
        for (String s : set) {
            if (s.length() % 2 == 0) newSet.remove(s);
        }

        return newSet;
    }
}

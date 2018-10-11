package manzilin.homework.h_24;

import com.sun.istack.internal.NotNull;

import java.util.*;

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
        set = new LinkedHashSet<>(Arrays.asList(test));
        System.out.println(set);
        set = removeEvenLengthAnother(set);
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
    /**
     * Удаляет из Множества все четные элементы ,используя итератор.
     *
     * @param set - Множество изначальное
     * @return - исправленное множество.
     */
    public static Set<String> removeEvenLengthAnother(@NotNull Set<String> set) {
        set.remove(null);
        Iterator iter = set.iterator();
        while (iter.hasNext()){
            String s = (String) iter.next();
            if (s.length() % 2 == 0) iter.remove();
        }

        return set;
    }
}

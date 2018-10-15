package manzilin.homework.h_24;

import com.sun.istack.internal.NotNull;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Можно было добавить иным образом
 * for (String s : test
 * ) {
 * if (s != null) set.add(s);
 * }
 *
 *
 */
public class SetToNoEven {
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

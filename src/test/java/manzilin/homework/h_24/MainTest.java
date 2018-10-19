package manzilin.homework.h_24;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static String[] source= new String[]
            {"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude", null};
    private static String[] expected = new String[]{"foo", "bar", "spoon", "!"};

    @Test
    void removeEvenLength() {
        Set<String> sourceSet = new LinkedHashSet<>(Arrays.asList(source));
        Set<String> expectedSet = new LinkedHashSet<>(Arrays.asList(expected));
        sourceSet = SetToNoEven.removeEvenLength(sourceSet);
        assertEquals(expectedSet,sourceSet,
                "Должны остаться только слова с нечетным количеством символов");
    }

    @Test
    void removeEvenLengthAnother() {
        Set<String> sourceSet = new LinkedHashSet<>(Arrays.asList(source));
        Set<String> expectedSet = new LinkedHashSet<>(Arrays.asList(expected));
        sourceSet = SetToNoEven.removeEvenLengthAnother(sourceSet);
        assertEquals(expectedSet,sourceSet,
                "Должны остаться только слова с нечетным количеством символов");
    }
}
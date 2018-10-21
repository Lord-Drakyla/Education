package manzilin.homework.h_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final String[] source= new String[]
            {"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude", null};
    private final String[] expected = new String[]{"foo", "bar", "spoon", "!"};
    private Set<String> sourceSet ;
    private Set<String> expectedSet ;
    @BeforeEach
    void init() {
        sourceSet = new LinkedHashSet<>(Arrays.asList(source));
        expectedSet = new LinkedHashSet<>(Arrays.asList(expected));
    }
    @Test
    void removeEvenLength() {
        sourceSet = SetToNoEven.removeEvenLength(sourceSet);
        assertEquals(expectedSet,sourceSet,
                "Должны остаться только слова с нечетным количеством символов");
    }

    @Test
    void removeEvenLengthAnother() {
        sourceSet = SetToNoEven.removeEvenLengthAnother(sourceSet);
        assertEquals(expectedSet,sourceSet,
                "Должны остаться только слова с нечетным количеством символов");
    }
}
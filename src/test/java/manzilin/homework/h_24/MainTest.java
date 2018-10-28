package manzilin.homework.h_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final String[] SOURCE = new String[]
            {"foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude", null};
    private final String[] EXPECTED = new String[]{"foo", "bar", "spoon", "!"};
    private final String[] UNEXPECTED = new String[]{"buzz", "fork", "bort", null};
    private Set<String> sourceSet;
    private Set<String> expectedSet;
    private Set<String> UNexpectedSet;

    @BeforeEach
    void init() {
        sourceSet = new LinkedHashSet<>(Arrays.asList(SOURCE));
        expectedSet = new LinkedHashSet<>(Arrays.asList(EXPECTED));
        UNexpectedSet = new LinkedHashSet<>(Arrays.asList(UNEXPECTED));
    }

    @Test
    void ToLeaveEvenWords() {
        sourceSet = SetToNoEven.removeEvenLength(sourceSet);
        assertEquals(expectedSet, sourceSet,
                "Должны остаться только слова с нечетным количеством символов");
    }

    @Test
    void DoNotToLeaveEvenWords() {
        sourceSet = SetToNoEven.removeEvenLength(sourceSet);
        assertNotEquals(UNexpectedSet, sourceSet,
                "Проверяются слова с четным количеством символов");
    }

    @Test
    void ToLeaveEvenWordsAnotherWay() {
        sourceSet = SetToNoEven.removeEvenLengthAnother(sourceSet);
        assertEquals(expectedSet, sourceSet,
                "Должны остаться только слова с нечетным количеством символов");
    }


    @Test
    void DoNotToLeaveEvenWordsAnotherWay() {
        sourceSet = SetToNoEven.removeEvenLengthAnother(sourceSet);
        assertNotEquals(UNexpectedSet, sourceSet,
                "Проверяются слова с четным количеством символов");
    }
}
package manzilin.homework.h_29;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private static Map<String, Person> hashMap;
    private final String expectedStr = "Person{\nage=15,\t family='Иванов',\t name='Василий'}";
    private final int expectedHash = -1467136901;
    private final Person expectedPerson = new Person(15, "Василий", "Иванов");
    @BeforeAll
    static void setUp() {
        hashMap = new HashMap<>();
        hashMap.put("1", new Person());
        hashMap.put("2", new Person(12, "Василий"));
        hashMap.put("3", new Person(15, "Василий"));
        hashMap.put("4", new Person(12, "Саша"));
        hashMap.put("5", new Person(15, "Саша"));
        hashMap.put("6", new Person("Василий"));
        hashMap.put("7", new Person("Саша"));
        hashMap.put("9", new Person(12, "Василий", "Иванов"));
        hashMap.put("10", new Person(15, "Василий", "Иванов"));
        hashMap.put("11", new Person(12, "Саша", "Иванов"));
        hashMap.put("12", new Person(15, "Саша", "Иванов"));
        for (String str : hashMap.keySet()) {
            System.out.println(str + ":  " + hashMap.get(str));
        }
    }

    @Test
    void checkEqualsMethod() {
        assertEquals(expectedPerson, hashMap.get("10"));
    }
    @Test
    void checkHashMethod() {
        assertEquals(expectedHash, hashMap.get("10").hashCode());
    }
    @Test
    void checkStringMethod() {
        assertEquals(expectedStr, hashMap.get("10").toString());
    }
    @Test
    void NegCheckEqualsMethod() {
        assertNotEquals(expectedPerson, hashMap.get("11"));
    }
    @Test
    void NegCheckHashMethod() {
        assertNotEquals(expectedHash, hashMap.get("11").hashCode());
    }
    @Test
    void NegCheckStringMethod() {
        assertNotEquals(expectedStr, hashMap.get("11").toString());
    }
}
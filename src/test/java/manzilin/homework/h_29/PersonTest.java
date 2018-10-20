package manzilin.homework.h_29;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    static Map<String, Person> hashMap;
    String expectedStr = "\nage=15	, name='Василий	, family=Иванов";
    int expectedHash = -1467136901;
    Person expectedPerson = new Person(15, "Василий", "Иванов");
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
}
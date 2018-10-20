package manzilin.homework.h_29;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Map<String, Person> hashMap;

    @BeforeEach
    void setUp() {
        hashMap = new HashMap<>();
        hashMap.put("1", new Person());
        hashMap.put("2", new Person(12, "Василий"));
        hashMap.put("3", new Person(15, "Василий"));
        hashMap.put("4", new Person(12, "Саша"));
        hashMap.put("5", new Person(15, "Саша"));
        hashMap.put("6", new Person("Василий"));
        hashMap.put("7", new Person("Саша"));
        hashMap.put("9", new Person(12, "Василий","Иванов"));
        hashMap.put("10", new Person(15, "Василий","Иванов"));
        hashMap.put("11", new Person(12, "Саша","Иванов"));
        hashMap.put("12", new Person(15, "Саша","Иванов"));
    }
    @AfterEach
    void tierDown() {
        hashMap.clear();
    }

    @Test
    void printIt(){
        for (String str:hashMap.keySet()) {
            System.out.println(str+":  "+hashMap.get(str));
        }
    }
}
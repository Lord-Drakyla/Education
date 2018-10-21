package manzilin.homework.h_25.Task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyMapStaticTest {

    private final boolean expectedCase1 = true;
    private final boolean expectedCase2 = false;
    private final Map<String, String> map = new MyMap<>();

    @BeforeEach
    void init() {
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");
    }

    @AfterEach
    void end() {
        map.clear();
    }


    @Test
    void isUniqueCase1() {
        assertEquals(expectedCase1, MyMapStatic.isUniqueSimple(map),
                "Все фамилии должны быть уникальны");
    }
    @Test
    void isUniqueCase2() {
        assertEquals(expectedCase2, MyMapStatic.isUniqueSimple(map),
                "Две и более фамилии должны быть не уникальны");
    }
}
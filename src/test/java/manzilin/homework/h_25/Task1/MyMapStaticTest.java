package manzilin.homework.h_25.Task1;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MyMapStaticTest {

    private boolean expectedCase1 = true;
    private boolean expectedCase2 = false;


    @Test
    void isUniqueCase1() {

        Map<String, String> map = new MyMap<>();

        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");
        assertEquals(expectedCase1, MyMapStatic.isUniqueSimple(map),
                "Все фамилии должны быть уникальны");
    }
    @Test
    void isUniqueCase2() {
        Map<String, String> map = new MyMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Иванов");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Петров");
        assertEquals(expectedCase2, MyMapStatic.isUniqueSimple(map),
                "Две и более фамилии должны быть не уникальны");
    }
}
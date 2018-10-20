package manzilin.homework.h_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private final String EXPECTEDNAME = "Мафусаил";
    Person person = new Person("Мафусаил", 9999);
    Person upperperson = new Person("Лафусаил", 9999);
    Person lowerperson = new Person("Нафусаил", 9999);

    @BeforeEach
    void setUp() {
        assertNotNull(person);
    }

    @Test
    void nameOfPerson() {
        assertEquals(EXPECTEDNAME, person.getName(), "Имя библейского долгожителя");
    }

    @Test
    void SamePerson() {
        assertEquals(0, person.compareTo(person));
    }

    @Test
    void NextPerson() {
        assertEquals(1, person.compareTo(upperperson));
    }

    @Test
    void PreviousPerson() {
        assertEquals(-1, person.compareTo(lowerperson));
    }

}
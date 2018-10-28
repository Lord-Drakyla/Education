package manzilin.homework.h_22;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private final Person person = new Person("Мафусаил", 9999);
    private final Person upperperson = new Person("Лафусаил", 9999);
    private final Person lowerperson = new Person("Нафусаил", 9999);

    @BeforeEach
    void setUp() {
        assertNotNull(person);
    }

    @Test
    void nameOfPerson() {
        final String EXPECTEDNAME = "Мафусаил";
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
    @Test
    void notSamePerson() {
        assertNotEquals(2, person.compareTo(person));
    }

    @Test
    void notNextPerson() {
        assertNotEquals(2, person.compareTo(upperperson));
    }

    @Test
    void notPreviousPerson() {
        assertNotEquals(2, person.compareTo(lowerperson));
    }
}
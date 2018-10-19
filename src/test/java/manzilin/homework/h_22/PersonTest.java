package manzilin.homework.h_22;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private final String EXPECTEDNAME = "Мафусаил";
    private final int EXPECTEDRESULT = 0;

    Person person = new Person("Мафусаил", 9999);
    @BeforeEach
    void setUp() {
      assertNotNull(person);
    }

    @Test
    void getName() {
        assertEquals(EXPECTEDNAME, person.getName(), "Имя библейского долгожителя");
    }

    @Test
    void compareTo() {
        assertEquals(EXPECTEDRESULT, person.compareTo(person));
    }

}
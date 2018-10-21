package manzilin.homework.h_08.Task5;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    Contract testContract = new Contract(
            0,
            new String[]{},
            null);
    Act expectedAct = new Act(
            1,
            new String[]{},
            LocalDate.now());
    Act result;

    /**
     * expected IllegalArgumentException
     */

    @Test
    void NullArgumentForConverter() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class,
                        () -> result = Converter.convertContractToAct(null)),
                () -> assertThrows(IllegalArgumentException.class,
                        () -> result = Converter.anotherConvertContractToAct(null))
        );
    }

    @Test
    void chechBuildInstance() {
        assertEquals(expectedAct, new Act(
                0,
                new String[]{},
                null));
    }

    @Test
    void MissingFieldIntoContract() {
        assertAll(
                () -> assertEquals(expectedAct, Converter.convertContractToAct(testContract)),
                () -> assertEquals(expectedAct, Converter.anotherConvertContractToAct(testContract))
        );
    }

    @Test
    void WorkOfClasses() {
        System.out.println(expectedAct.toPrint());
        System.out.println(testContract.toPrint());
        result = Converter.convertContractToAct(testContract);
        System.out.println(result.toPrint());
    }
}
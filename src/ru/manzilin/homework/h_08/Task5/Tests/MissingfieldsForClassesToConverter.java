package ru.manzilin.homework.h_08.Task5.Tests;

import ru.manzilin.homework.h_08.Task5.Act;
import ru.manzilin.homework.h_08.Task5.Contract;
import ru.manzilin.homework.h_08.Task5.Converter;

/**
 * @Test expeceted result
 * number: 1
 * List: []
 * date: 2018-09-30
 *
 */

class MissingfieldsForClassesToConverter {
    static int number;

    public static void main(String[] args) {

        Contract contract = new Contract(
                number,
                new String[]{},
                null);
        Act newAct = Converter.convertContractToAct(contract);
        System.out.println(newAct.toPrint());
    }

}

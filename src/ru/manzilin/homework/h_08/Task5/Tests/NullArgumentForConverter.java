package ru.manzilin.homework.h_08.Task5.Tests;

import ru.manzilin.homework.h_08.Task5.Act;
import ru.manzilin.homework.h_08.Task5.Contract;
import ru.manzilin.homework.h_08.Task5.Converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;

/**
 * @Test expeceted IllegalArgumentException
 */

class NullArgumentForConverter {
    public static void main(String[] args) {
        Contract contract = new Contract(
                220,
                new String[]{"1", "2"},
                LocalDate.of(2018, 9, 21));
        Act newAct = Converter.convertContractToAct(null);
    }

}

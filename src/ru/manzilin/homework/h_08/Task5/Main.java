package ru.manzilin.homework.h_08.Task5;
/**
 * DONE:добавить проверки конвертер!!!!
 */


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Contract contract = new Contract(
                220,
                new String[]{"1", "2"},
                LocalDate.of(2018, 9, 21)
        );
        System.out.println(contract.toPrint());
        System.out.println(Converter.convertContractToAct(contract).toPrint());
        Act newAct = Converter.convertContractToAct(contract);
        System.out.println(newAct.toPrint());
        System.out.println(Converter.anotherConvertContractToAct(contract).toPrint());
        Act anotherAct = Converter.anotherConvertContractToAct(contract);
        System.out.println(anotherAct.toPrint());

    }
}

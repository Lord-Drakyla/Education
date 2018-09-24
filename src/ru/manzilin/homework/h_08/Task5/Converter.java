package ru.manzilin.homework.h_08.Task5;

import java.lang.reflect.Field;

public class Converter {

  public static Act convertContractToAct(Contract contract){
  return new Act (contract.getNumber(), contract.getList(), contract.getDate());
  }

  public static Act anotherConvertContractToAct(Contract contract){
    Act act = new Act();
    try {
      Field[] fields = Contract.class.getDeclaredFields();
      Field[] fieldsAct = Act.class.getDeclaredFields();
      for (int i = 0; i < fields.length; i++) {
        fields[i].setAccessible(true);
        fieldsAct[i].setAccessible(true);
        Object value = fields[i].get(contract);
        fieldsAct[i].set(act, value);
      }

    } catch ( IllegalAccessException e) {
      e.printStackTrace();
    }

    return act;
  }

}

package manzilin.homework.h_08.Task5;


import java.lang.reflect.Field;

public class Converter {

    public static Act convertContractToAct(Contract contract) {
        if (contract != null) {
            Act act = new Act(contract.getNumber(), contract.getList(), contract.getDate());
            return act;
        } else {
            throw new IllegalArgumentException("Нельзя превратить неправильный договор в акт");
        }
    }

    public static Act anotherConvertContractToAct(Contract contract) {
        if (contract != null) {
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

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return act;
        } else {
            throw new IllegalArgumentException("Нельзя превратить неправильный договор в акт");
        }


    }

}


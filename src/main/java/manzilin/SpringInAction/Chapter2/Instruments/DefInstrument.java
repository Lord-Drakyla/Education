package manzilin.SpringInAction.Chapter2.Instruments;

import manzilin.SpringInAction.Chapter2.CookingException;

public class DefInstrument implements Instrument {
    private String name;
    private String mainAction;

    public DefInstrument() {
        this("Anything","Anything");}

    public DefInstrument(String mainAction) {
        this("Anything",mainAction);
    }

    public DefInstrument(String name, String mainAction) {
        this.name = name;
        this.mainAction = mainAction;
    }

    @Override
    public void use() throws CookingException {
        System.out.println(mainAction);
    }
}

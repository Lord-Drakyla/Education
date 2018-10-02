package manzilin.homework.h_08.Task4;

public class Man {
    private static int count;
    private String name;

    public Man(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;

    }

    public static int getCount() {
        return count;
    }
}

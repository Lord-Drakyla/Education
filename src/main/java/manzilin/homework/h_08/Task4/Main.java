package manzilin.homework.h_08.Task4;

public class Main {
    public static void main(String[] args) {
        countMan one = new countMan("Василий");
        countMan two = new countMan("Василий");
        countMan three = new countMan("Василий");
        countMan four = new countMan("Василий");
        countMan five = new countMan("Василий");
        System.out.println(countMan.getCount());
        System.out.println(one.getCount());
        System.out.println(two.getCount());
        System.out.println(three.getCount());
        // И даже если поменять имена экземляров счетчик будет одинаков.
    }
}

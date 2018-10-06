package manzilin.homework.h_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class originalApp {
    public static void main(String[] args) {

        List<PersonSimple> peopleSimple = new ArrayList<>();


        peopleSimple.add(new PersonSimple("Alice", 12));
        peopleSimple.add(new PersonSimple("Bill", 11));
        peopleSimple.add(new PersonSimple("Alice", 10));
        peopleSimple.add(new PersonSimple("Bill", 9));

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 12));
        people.add(new Person("Bill", 11));
        people.add(new Person("Alice", 10));
        people.add(new Person("Bill", 9));


        iterate(people);

        for (PersonSimple personSimple : peopleSimple) {
            System.out.println(personSimple);
        }
        System.out.println();
        System.out.println("Simple people list");
        System.out.println();

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("People list");
        System.out.println();

        Collections.sort(people);
        Collections.sort(peopleSimple, new PersonComparator());

        for (PersonSimple person : peopleSimple) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Sorted Simple people list");
        System.out.println();

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Sorted people list");
        System.out.println();
        Collections.sort(peopleSimple, new PersonSuperComparator());
        for (PersonSimple person : peopleSimple) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println("Super Sorted Simple people list");

    }


    private static void iterate(List<Person> people) {
        Iterator i = people.iterator();
        while (i.hasNext()) {
            System.out.print(i.next());
            System.out.print(" : ");
        }
        System.out.println();
    }
}

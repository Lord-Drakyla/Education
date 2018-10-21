package manzilin.homework.h_22;

import java.util.ArrayList;
import java.util.List;


/**
 * Вопрос о динамимеском изменении arrayList продемострирован с помощью побитового сдвига.
 */
public class TestApp {

    public static void main(String[] args) {
        List<PersonSimple> peopleSimple = new ArrayList<>();
        peopleSimple.add(new PersonSimple("Alice", 12));
        peopleSimple.add(new PersonSimple("Bill", 11));
        peopleSimple.add(new PersonSimple("Alice", 10));
        peopleSimple.add(new PersonSimple("Bill", 9));
        int a = 10;
        a = a >> 1;
        System.out.println(a);

        a = 15;
        a = a >> 1;
        System.out.println(a);

        a = 22;
        a = a >> 1;
        System.out.println(a);

        PersonComparator comprate = new PersonComparator();
        System.out.println(comprate.compare(peopleSimple.get(0), peopleSimple.get(1)));
        System.out.println(comprate.compare(peopleSimple.get(1), peopleSimple.get(0)));
        System.out.println(
                comprate.compare(peopleSimple.get(0), peopleSimple.get(1))
                        ==
                        -(comprate.compare(peopleSimple.get(1), peopleSimple.get(0))));
        peopleSimple.sort(new PersonSuperComparator());
        PersonSuperComparator supcomprate = new PersonSuperComparator();
        System.out.println(supcomprate.compare(peopleSimple.get(0), peopleSimple.get(1)));
        System.out.println(supcomprate.compare(peopleSimple.get(1), peopleSimple.get(0)));
        System.out.println(
                supcomprate.compare(peopleSimple.get(0), peopleSimple.get(1))
                        ==
                        -(supcomprate.compare(peopleSimple.get(1), peopleSimple.get(0))));


    }
}


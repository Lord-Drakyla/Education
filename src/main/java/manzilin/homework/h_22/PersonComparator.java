package manzilin.homework.h_22;

import java.util.Comparator;

/**
 * Created by arty on 12.09.2018.
 */
public class PersonComparator implements Comparator<PersonSimple> {

    public int compare(PersonSimple a, PersonSimple b) {

        return a.getName().compareTo(b.getName());
    }

}


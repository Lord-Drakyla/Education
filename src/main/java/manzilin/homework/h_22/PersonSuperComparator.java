package manzilin.homework.h_22;

import java.util.Comparator;

class PersonSuperComparator implements Comparator<PersonSimple> {
//    final PersonSimple one;
//    final PersonSimple two;
//
//    public PersonSuperComparator(PersonSimple one, PersonSimple two) {
//        this.one = one;
//        this.two = two;
//    }

    public int compare(PersonSimple one, PersonSimple two) {
        int result = one.getName().compareTo(two.getName());
        boolean conditionName = result == 0;
        if (conditionName) {
            result = compareAge(one.getAge(), two.getAge());
        }
        return result;
    }

    private int compareAge(int one, int two) {
        int result = 0;
        if (one < two) {
            result = -1;
        } else if (one > two) {
            result = 1;
        }
        return result;

    }

}
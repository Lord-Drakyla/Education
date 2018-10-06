package manzilin.homework.h_23;

public interface Validateable<T> {

    default void ValideData (T...v) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < v.length; i++)
            if (v[i] != null) {
                System.out.println(String.format("Arg %d - %s: является правильным", i, v[i].toString()));
            } else {
                System.out.println(String.format("Arg %d : является неправильным", i));
            }
    }
}

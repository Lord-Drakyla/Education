package manzilin.homework.h_29;

import java.util.Objects;

public class Person {
    final private int age;
    final private String family;
    final private String name;

    public Person() {
        this("JOHN");
    }

    public Person(String name) {
        this(0, name);
    }

    public Person(int age, String name) {
        this(age, name, "DOE");
    }

    public Person(int age, String name, String family) {
        this.age = age;
        this.name = name;
        this.family = family;
    }



    /**
     * Можно использовать
     * Objects.hash(age,family,name);
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + family.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    /**
     * Соглашение об equals требует чтобы была обработка NPE
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        boolean result = true;
        if (this == obj) {
            result = true;
        } else if (!(obj instanceof Person)) {
            result = false;
        } else {
            Person person = (Person) obj;
            if (family != person.family ||
                    age != person.age ||
                    name != person.name
            ) result = false;

        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("age=").append(age);
        sb.append("\t").append(", name='").append(name);
        sb.append("\t").append(", family=").append(family);
        return sb.toString();
    }
}

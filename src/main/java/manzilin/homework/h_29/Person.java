package manzilin.homework.h_29;

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
     */
    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (this == obj) {
            result = true;
        } else if (!(obj instanceof Person)) {
            result = false;
        } else {
            Person person = (Person) obj;
            result = family.equals(person.family) &&
                    age == person.age &&
                    name.equals(person.name);
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

package manzilin.lesson.MyParking.entities;

import java.time.LocalDate;

/**
 * DTO - владелец
 */
public class Owner implements OwnerReader {
    private int id;
    private String name;
    private LocalDate birthDay;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay (LocalDate birthDay ) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return String.format("%4d|%10.10s|%10.10s", id, name, birthDay);
    }
}

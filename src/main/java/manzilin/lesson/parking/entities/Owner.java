package manzilin.lesson.parking.entities;

import java.sql.Date;

/**
 * POJO владелец
 */
public class Owner implements OwnerReader {
    private int id;
    private String name;
    private Date birthDate;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%4d|%10.10s|%10.10s", id, name, birthDate);
    }
}

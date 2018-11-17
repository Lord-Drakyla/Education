package manzilin.lesson.parking;

import java.util.Date;

/**
 * DTO - владелец
 */
public class Owner {
    private String name;
    private int id;
    private Date birthday;

    public Owner(String name, int id, Date birthday) {
        this.name = name;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

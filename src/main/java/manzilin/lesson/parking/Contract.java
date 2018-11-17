package manzilin.lesson.parking;

import java.util.Date;
import java.util.Set;

/**
 * DTO -  договор
 */
public class Contract {
    private int id;
    private Date signDate;
    private Owner owner;
    private Set <Place> places;

    public Contract(int id, Date signDate, Owner owner, Set<Place> places) {
        this.id = id;
        this.signDate = signDate;
        this.owner = owner;
        this.places = places;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

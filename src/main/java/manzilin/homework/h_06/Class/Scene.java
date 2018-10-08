package manzilin.homework.h_06.Class;

import java.time.LocalDate;
import java.util.Arrays;

public class Scene extends LitObject {
    private String location;
    private GunOnWall[] membersGun;
    private Person[] membersPerson;

    public Scene(){

    }
    public Scene(String bookTitle, String author, LocalDate yearPublish, String location,
                 GunOnWall[] membersGun, Person[] membersPerson) {
        super(bookTitle, author, yearPublish);
        this.location = location;
        this.membersGun = membersGun;
        this.membersPerson = membersPerson;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public GunOnWall[] getMembersGun() {
        return membersGun;
    }

    public void setMembersGun(GunOnWall[] membersGun) {
        this.membersGun = membersGun;
    }

    public Person[] getMembersPerson() {
        return membersPerson;
    }

    public void setMembersPerson(Person[] membersPerson) {
        this.membersPerson = membersPerson;
    }

    @Override
    public String toString() {
        return "Scene{" +
                "location='" + location + '\'' +
                ", membersGun=" + Arrays.toString(membersGun) +
                ", membersPerson=" + Arrays.toString(membersPerson) +
                "} " + super.toString();
    }
}

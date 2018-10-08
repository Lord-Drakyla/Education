package manzilin.homework.h_06.Class;

import java.time.LocalDate;
import java.time.Period;


public class Person extends Animate{
    private int age;

    public int getAge() {
        int local;
        LocalDate date = LocalDate.now();
        Period period = Period.between(date, super.getBirthDay());
        local= (age!=0) ? age : Integer.valueOf(period.getYears());
        return local;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                "} " + super.toString();
    }
}

package manzilin.homework.h_06.Class;

import java.time.LocalDate;

public class Animate extends LitObject{
        private Sex sex;
        private LocalDate birthDay;

    public Animate() {
    }

    public Animate(String bookTitle, String author, Sex sex, LocalDate birthDay) {
        super(bookTitle, author);
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public Animate(String bookTitle, String author, LocalDate yearPublish, Sex sex, LocalDate birthDay) {
        super(bookTitle, author, yearPublish);
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Animate{" +
                "sex=" + sex +
                ", birthDay=" + birthDay +
                "} " + super.toString();
    }
}


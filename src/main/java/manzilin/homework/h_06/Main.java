package c;


import manzilin.homework.h_06.Class.*;

import java.time.LocalDate;

public class Main {


    public static void main (String[] arg){
        Person mainHero = new Person();
        Person secondHero = new Person();
        GunOnWall colt = new GunOnWall("Murder into night","Ellery Queen",
                1,5);
        Scene saloon = new Scene("Murder into night","Ellery Queen",
                LocalDate.of(1942,1,1),"New York",
                new GunOnWall[]{colt}, new Person[]{mainHero, secondHero});
        System.out.println(saloon);
    }
}

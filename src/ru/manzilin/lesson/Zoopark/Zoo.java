package ru.manzilin.lesson.Zoopark;

import ru.manzilin.lesson.Animal;

import java.io.Serializable;

public class Zoo implements Serializable {
    private Guard guard;
    private Animal[] animals = new Animal[0];

    public Zoo(Guard guard) {
        this.guard = guard;
    }

    /**
     *
     */
    public void addAnimals(){
// TODO: 19.09.2018 добавление животных
        final int newsize = animals.length+1;

    }
    public void checkAnimals(){
        for (Animal animal:animals) {
            System.out.print(animal.getName()+" ");
            animal.doSome();

        }
    }
    public void openZoo(){

    }
    public void closeZoo(){

    }
}

package manzilin.homework.h_09.Task1;


import manzilin.homework.h_09.Task2.*;

public class Duck extends Animal implements Fly, Run, Swim {


    public Duck() {
    }

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(this.getClass().getSimpleName()+" - "+name+", говорит "+say());
    }
    @Override
    public String say() {
        return "Кря-кря";
    }

    @Override
    public void canFly() {
        System.out.println("Может и на юг полететь");
    }

    @Override
    public void canRun() {
        System.out.println("Быстрый гусиный шаг");
    }

    @Override
    public void canWalk() {
        System.out.println("Ходит гусиным шагом");
    }

    @Override
    public void canSwim() {
        System.out.println("Стаей на "+Swim.PLACE);
    }
}

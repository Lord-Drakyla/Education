package manzilin.SpringInAction.Chapter2;

import manzilin.SpringInAction.Chapter2.Cooks.Cook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "springKitchen.xml");
        Cook cook = (Cook) ctx.getBean("Ivanov");
        cook.Dish();
        System.out.println("-----------------------");
        Cook chefcook = (Cook) ctx.getBean("Chef");
        chefcook.Dish();
    }
}

package manzilin.homework.h_03.task_star;;


import java.util.Scanner;

public class Task_star {

    public static void main(String[] args) {
        int previos = 0;
        int numberTarget = 1 + (int) (Math.random()*100);
        System.out.println(numberTarget);
        Scanner console = new Scanner(System.in);
        System.out.println("Поиграем в игру \"Горячо-Холодно\"");
        System.out.println("Мы загадаем число, а вы пишите варианты. От 1 до 100");
        System.out.println("Выйти можно напечатав \"стоп\" ");
        do {
            if (console.hasNextInt()) {
                int current = console.nextInt();
                int diffCurr = Math.abs(current-numberTarget);
                int diffPrv = Math.abs(previos-numberTarget);
                if ((current<1)|(current>100)){
                    System.out.println("Неверное число");
                    continue;
                }
                else if (current == numberTarget) {
                    System.out.println("Правильный выбор");
                    break;
                }
                else if (diffPrv<diffCurr) {
                    System.out.println("Холодно");
                }
                else if (diffPrv>diffCurr) {
                    System.out.println("Горячо");
                }

                previos = current;
            }
            else  if (console.hasNext("стоп")) {
                System.out.println("Жаль, что вы нас покидаете");
                break;
            }
            else{
                System.out.println("Подходят только числа: ");
            }
        } while (0==0);
        console.close();
    }
}

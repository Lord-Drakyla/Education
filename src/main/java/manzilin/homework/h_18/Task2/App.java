package manzilin.homework.h_18.Task2;
//todo переделать
import manzilin.homework.h_18.Task1.Copy;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) {
        Copy copy = new Copy(
                new File("C:\\Users\\Tairn\\Downloads\\NumbPhones.txt"),
                new File("C:\\Users\\Tairn\\Downloads\\NumbPhonesOut.txt"),
                StandardCharsets.UTF_8,
                StandardCharsets.UTF_8);
        copy.run();

    }
}

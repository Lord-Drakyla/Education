package manzilin.homework.h_18.Task1;

import java.io.File;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) {
        Copy copy = new Copy(
                new File("Task1_source.txt"),
                new File("Task1_target.txt"),
                StandardCharsets.US_ASCII,
                StandardCharsets.UTF_8);
        copy.run();

    }
}

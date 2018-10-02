package manzilin.homework.h_15;

import manzilin.homework.h_15.Task1.FileUserRun;
import manzilin.homework.h_15.Task2.RecurseUser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ProblemApp {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Tairn\\IdeaProjects\\Education\\src");
        Path pFile = file.toPath();
        RecurseUser ProblemPathTask2 = new RecurseUser();
        ProblemPathTask2.PathPrint(pFile, 0);
        ProblemPathTask2.deepToPrint();
        try {
            FileUserRun ProblemFileTask1 = new FileUserRun(file.getParent() + "\\Task1.txt");
            ProblemFileTask1.Run();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

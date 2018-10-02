package manzilin.homework.h_15.Task2;


import java.io.File;
import java.nio.file.Path;

public class RecurseUser {
    private int deepS;
    private int deep;

    public void PathPrint(Path path, int deep) {
        this.deep = deep;
        if (deep == 0) {
            System.out.println(path);
            deepS = path.getNameCount();
        }
        System.out.println(SpaceCount(path.getNameCount())+path.getFileName());
        //System.out.println(SpaceCount(deep) + path.getFileName());
        File[] files = path.toFile().listFiles();
        if (files != null) {
            for (File file : files
            ) {


                PathPrint(file.toPath(), deep += 1);
                //PathPrint(file.toPath(), (file.isDirectory()) ? deep += 1 : deep);

            }

        }

    }

    public void deepToPrint() {
        System.out.println(String.format("Глубина рекурсии равна %s", deep));
    }

    private String SpaceCount(int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count - deepS; i++) {
        //for (int i = 0; i < count; i++) {
            sb.append("\t");
        }
        return sb.toString();
    }

}

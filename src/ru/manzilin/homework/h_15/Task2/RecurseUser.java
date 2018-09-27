package ru.manzilin.homework.h_15.Task2;


import java.io.File;
import java.nio.file.Path;

public class RecurseUser {
    private  int deepS;
    private  int deep;

   public void PathPrint(Path path){
       if (deep == 0) {
                 System.out.println(path);
           deepS = path.getNameCount();
       }
       System.out.println(SpaceCount(path.getNameCount())+path.getFileName());
       if (path.toFile().isDirectory()) {deep++;}
       File[] files = path.toFile().listFiles();
       if (files !=null) {
           for (File file:files
                ) {

               PathPrint(file.toPath());

           }

       }

   }

   private String SpaceCount (int count){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <count-deepS ; i++) {
            sb.append("\t");
        }
        return sb.toString();
   }

}

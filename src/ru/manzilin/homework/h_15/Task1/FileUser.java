package ru.manzilin.homework.h_15.Task1;

import java.io.File;
import java.io.IOException;


public class FileUser {
    private final String path;
    private File file;

    FileUser(String path) throws IOException {
        this.path = path;
        file = new File(path);
        file.createNewFile();
    }

    protected FileUser doCopy(String pathOfCopy) throws IOException {
        return new FileUser(pathOfCopy);
    }

    protected FileUser doRename(String newName) throws IOException {
        FileUser local = this.doCopy(newName);
        file.delete();
        return local;
    }

    protected void doGetPath() throws IOException {
        System.out.println(String.format("Это мой путь на диске %s. А это мой обычный путь %s",
                file.getCanonicalPath(), path));
    }


}


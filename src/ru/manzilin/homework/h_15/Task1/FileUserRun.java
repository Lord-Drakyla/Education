package ru.manzilin.homework.h_15.Task1;

import java.io.IOException;

public class FileUserRun {
    private final String path;
    private FileUser fileUser;

    public FileUserRun(String path) throws IOException {
        this.path = path;
        fileUser = new FileUser(this.path);
    }

    public void Run() throws IOException {
        fileUser.doGetPath();
        fileUser= fileUser.doCopy("Copy.txt");
        fileUser.doGetPath();
        fileUser=fileUser.doRename("NewName.txt");
        fileUser.doGetPath();
    }



}

package manzilin.homework.h_18.Task1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class CopyApp {
    private final File file1;
    private final File file2;
    private final Charset charsetSource;
    private final Charset charsettarget;
    //TODO: определение кодировки.
    public CopyApp(File source, File target, Charset charsetSource, Charset charsettarget) {
        this.file1 = source;
        this.file2 = target;
        this.charsetSource = charsetSource;
        this.charsettarget = charsettarget;
    }

    private void run(){
        new WriteClass(
                new ReadClass(charsetSource)
                        .doReadFile(file1),
                charsettarget
        ).doWriteFile(file2);

    }
    public static void main(String[] args) {
        CopyApp copyApp = new CopyApp(
                new File("Task1_source.txt"),
                new File("Task1_target.txt"),
                StandardCharsets.US_ASCII,
                StandardCharsets.UTF_8);
        copyApp.run();

    }


}

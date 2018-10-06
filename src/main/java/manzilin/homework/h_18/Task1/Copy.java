package manzilin.homework.h_18.Task1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class Copy {
    private final File file1;
    private final File file2;
    private final Charset charsetSource;
    private final Charset charsettarget;

    //TODO: определение кодировки.
    public Copy(File source, File target, Charset charsetSource, Charset charsettarget) {
        this.file1 = source;
        this.file2 = target;
        this.charsetSource = charsetSource;
        this.charsettarget = charsettarget;
    }



    public void run(){
        new WriteClass(
                new ReadClass(charsetSource)
                        .doReadFile(file1),
                charsettarget
        ).doWriteFile(file2);

    }



}

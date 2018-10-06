package manzilin.homework.h_18.Task2;

import manzilin.homework.h_18.Task1.Copy;
import manzilin.homework.h_18.Task1.ReadClass;
import manzilin.homework.h_18.Task1.WriteClass;

import java.io.File;
import java.nio.charset.Charset;

public class CopywithoutNumbers  {
    private final File file1;
    private final File file2;
    private final Charset charsetSource;
    private final Charset charsettarget;

    public CopywithoutNumbers(File source, File target, Charset charsetSource, Charset charsettarget) {
        this.file1 = source;
        this.file2 = target;
        this.charsetSource = charsetSource;
        this.charsettarget = charsettarget;
    }


    public void run() {

        new WriteClass(
                new goneNumb(
                            new ReadClass(this.charsetSource)
                                    .doReadFile(this.file1)
                            ).gone(),
                this.charsettarget
        ).doWriteFile(this.file2);
    }
}

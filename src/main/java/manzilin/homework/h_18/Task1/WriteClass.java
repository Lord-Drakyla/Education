package manzilin.homework.h_18.Task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;


public class WriteClass {
    private final String content;
    private final Charset charset;


    public WriteClass(String content, Charset charset) {
        this.content = content;
        this.charset = charset;


    }

    void  doWriteFile(File targetFile){
        try(OutputStream os = new FileOutputStream(targetFile)){
            os.write(this.content.getBytes(this.charset));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

}

package manzilin.homework.h_18.Task1;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class ReadClass {

    private String content;
    private final Charset charset;
    public ReadClass(Charset charset) {
        this.charset = charset;

    }

    public String doReadFile(File file) {
        try (InputStream is = new FileInputStream(file)) {
            int b;
            byte[] buffer = new byte[1000];
            if ((b = is.read(buffer)) != -1) {
                content = new String(buffer, this.charset);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}

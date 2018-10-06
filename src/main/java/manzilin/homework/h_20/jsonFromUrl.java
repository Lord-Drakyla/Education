package manzilin.homework.h_20;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class jsonFromUrl {
    public String get(String testUrl) throws MalformedURLException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL(testUrl);
        try (
                InputStream stream = url.openStream();
                Reader reader = new InputStreamReader(stream);
                BufferedReader br = new BufferedReader(reader)
        ) {

            while (br.ready()) {
                //System.out.println(br.readLine());
                sb.append(br.readLine()).append("\r\n");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}



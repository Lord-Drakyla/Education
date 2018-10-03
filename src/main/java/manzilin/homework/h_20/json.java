package manzilin.homework.h_20;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class json {
    public static void main(String[] args) throws MalformedURLException {
        StringBuilder sb = new StringBuilder();
        URL url = new URL("https://xkcd.com/info.0.json");
        try (InputStream stream = url.openStream();
             Reader reader = new InputStreamReader(stream);
             BufferedReader br = new BufferedReader(reader)
        ) {

            while (br.ready()) {
                //System.out.println(br.readLine());
                sb.append(br.readLine()).append("\r\n");

            }
            System.out.println(sb.toString());

            ObjectMapper mapper = new ObjectMapper();
            XKCD bulbasuar = mapper.readValue(sb.toString(), XKCD.class);
            System.out.println(bulbasuar.toPrint());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


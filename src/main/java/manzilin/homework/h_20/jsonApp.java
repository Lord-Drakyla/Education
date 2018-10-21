package manzilin.homework.h_20;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;

public class jsonApp {
    private static final String testUrl = "https://xkcd.com/info.0.json";

    public static void main(String[] args) {
        try {
            String json = new jsonFromUrl().get(testUrl);
            ObjectMapper mapper = new ObjectMapper();
            jsonComics comics = mapper.readValue(json, jsonComics.class);
            System.out.println(comics.toPrint());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}


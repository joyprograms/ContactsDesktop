package sample;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by meekinsworks on 8/16/16.
 */
public class ReadWriteJson {

    public static void main(String[] args) throws IOException {

        Contact c = new Contact();

        File f = new File("Contact.json");

        JsonSerializer serializer = new JsonSerializer();

        String json = serializer.serialize(c);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        JsonParser parser = new JsonParser();
        Contact c2 = parser.parse(contents, Contact.class);

        System.out.println(c2);

    }
    }



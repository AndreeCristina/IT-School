package session_17_equals_hashcode_generics.challenge.exercise_18;

import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.nio.file.Files;

public class ConvertXmlToJson {
    private static final String XML_FILE_PATH = "C:\\Personal\\IT School\\src\\main\\java\\session_17_equals_hashcode_generics\\challenge\\exercise_18\\bookstore.xml";

    public static void main(String[] args) throws Exception {
        File xmlFile = new File(XML_FILE_PATH);

        byte[] b = Files.readAllBytes(xmlFile.toPath());

        String xml = new String(b);

        JSONObject obj = XML.toJSONObject(xml);

        System.out.print(obj);
    }
}
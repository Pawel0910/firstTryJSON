import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Crunchify.com
 */

public class jsonTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        File file = new File("file12.json");
        JSONObject obj = new JSONObject();
        obj.put("Name", "crunchify.com");
        obj.put("Author", "App Shah");

        JSONArray company = new JSONArray();
        company.add("Compnay: eBay");
        company.add("Compnay: Paypal");
        company.add("Compnay: Google");
        obj.put("Company List", company);

        // try-with-resources statement based on post comment below :)
        try (FileWriter file1 = new FileWriter("file12.json")) {
            file1.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        }
    }
}
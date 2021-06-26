import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;

public class Task {
    public static void main(String[] args) {
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }

    public JsonObject readJson(String filename)
    {
        return Jsoner.deserialize(filename, new JsonObject());
    }

    public String readFile(String filename) {
        String contents = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String s = reader.readLine();
            while (s != null) {
                contents = contents + s;
                s = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return contents;
    }
}




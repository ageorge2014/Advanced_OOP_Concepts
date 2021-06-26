import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import jdk.nashorn.internal.parser.JSONParser;

public class Database {
    JsonObject o;

    public Database(JsonObject data){
       this.o = data;
    }

    public JsonObject getRestaurant(String name){
        JSONParser = new JSONParser();
        JsonObject obj = (JsonObject) o.get("name");
    JsonArray list = (JsonArray) this.o.get("list");
        /* TODO
Complete this method as specified. */
    }

    public double getAvgReviews(String name){
        JSONParser = new JSONParser();
        JsonArray arr = (JsonArray) o.get("name");
        for (int i = 0; i < array.size(); i++) {
            JsonObject obj = (JsonObject) arr.get(i);
            this.name[i] = new dou
        }
    }
}

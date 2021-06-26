import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;


public class OnlineRecipeDatabase {

    String baseUrl = "http://www.recipepuppy.com/api/?";

    public JsonObject getRecipesByIngredients(String ingredients) throws Exception {
        String content = "";
        try {
            URL url = new URL(baseUrl + "i=" + ingredients);
            Scanner urlScanner = new Scanner(url.openStream());

            while (urlScanner.hasNextLine()) {
                content = content + urlScanner.nextLine();
            }
            urlScanner.close();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        return Jsoner.deserialize(content, new JsonObject());
    }

    public JsonObject getRecipesByDish(String dish) throws Exception {
        String content = "";
        try {
            URL url = new URL(baseUrl + "q=" + dish);


            Scanner urlScanner = new Scanner(url.openStream());

            while (urlScanner.hasNextLine()) {
                content = content + urlScanner.nextLine();
            }
            urlScanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Jsoner.deserialize(content, new JsonObject());
    }


    public String formatRecipeAsString(JsonObject doc) {
        String results = "";
        /* TODO 
This should return a String with each recipe in three lines:
Title:the title of the recipe
Link:the link to the recipe
Ingredients:The ingredients of teh recipe.*/
        String title = (String) doc.get("title");
        String link = (String) doc.get("href");
        JsonArray ingredients = (JsonArray) doc.get("ingredients");
        results += "title:" + title + "," + "href:" + link + "," + "ingredients:" + ingredients;

        return results;
    }

    public void saveRecipes(String text, String outfile) {
        try (FileOutputStream out = new FileOutputStream(outfile)) {
                out.write(text.getBytes());
                //out.flush();

        } catch (FileNotFoundException e) {
            System.out.print("Not Found");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

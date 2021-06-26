import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris.data");
    }

    public Database readCSV(String filename) {
        String contents = "";
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))) {
            byte[] buffer = new byte[1024];
            int lengthRead;

            if ((lengthRead = in.read(buffer)) > 0) {
                contents = contents + new String(buffer, 0, lengthRead);

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("No File");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        return new Database(contents);
    }
}

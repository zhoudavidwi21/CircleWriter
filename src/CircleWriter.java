import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CircleWriter {
    public static void saveCirclesToCSVFile(List<Circle> circles, String filename) {
        // implement this
        try (FileWriter out = new FileWriter(filename)) {
            //write the header
            out.write("x,y,radius\n");

            //write each list element
            for (Circle c : circles) {
                out.write(String.format(Locale.ROOT, "%f,%f,%f\n", c.getCenter().getX(), c.getCenter().getY(), c.getRadius()));
            }

        } catch (IOException e) {
            //required handeling of possible IOExceptions
            e.printStackTrace();
        }
    }
}

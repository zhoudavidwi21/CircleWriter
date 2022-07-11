import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CircleReader {
    public static List<Circle> loadCirclesFromCSVFile(String filename){
        List<Circle> circles = new LinkedList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(filename))){
           CircleCSVParser parser = new CircleCSVParser();
           String line = in.readLine();
           if (line != null){
               parser.parseHeader(line);
               while ((line = in.readLine())!= null){
                   Circle circle = parser.parse(line);
                   circles.add(circle);
               }
           }
        } catch (IOException | IllegalElementFormatException e){
            e.printStackTrace();
        }
        return circles;
    }
}

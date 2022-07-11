public class CircleCSVParser {
    public void parseHeader(String headerLine){}

    public Circle parse(String line) throws IllegalElementFormatException{
        String [] tokens = line.split(",");

        try{
            double x = Double.parseDouble(tokens[0]);
            double y = Double.parseDouble(tokens[1]);
            double radius = Double.parseDouble(tokens[2]);
            Circle circle = new Circle(new Position(x,y), radius);
            return circle;
        } catch (NumberFormatException e){
            throw new IllegalElementFormatException(e.getMessage() + "in line " + line, e);
        }
    }

}

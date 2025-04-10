public class Rechteck {
    private double width; //Breite
    private double height; //Hoehe

    //Schritt 1 - Konstruktor
    Rechteck(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Schritt 2 - Get
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    //Schritt 3 - Set
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Schritt 4 - getArea --> Flache des Rechtecks berechnen und zurueckgeben
    public double getArea(){
        double flaeche = width * height;
        return flaeche;

        //Auch so moeglich
        //return (width * height);
    }

    //Schritt 5 - getPerimeter --> Umfang des Rechtecks berechnen und zurueckgeben
    public double getPerimeter(){
        return 2 * (width + height);
    }
}

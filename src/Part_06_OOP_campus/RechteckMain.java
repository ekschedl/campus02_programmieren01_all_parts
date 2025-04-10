public class RechteckMain {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(7.5,3);
        Rechteck r2 = new Rechteck(10.4,6.8);

        //Hier wird uns die Flaeche der Rechtecke als double zurueckgeliefert
        //Direkt in die Ausgabe verpacken
        System.out.println("Die Flaeche von R1 = "+r1.getArea());

        //Ueber eine Variable aufnehmen und dann weiter verarbeiten
        double r2Flaeche = r2.getArea();
        System.out.println("Die Flache von R2 = "+r2Flaeche);
        System.out.println("Die doppelte Flaeche von R2 = "+FlacheVerdoppeln(r2Flaeche));

        //Hier wird uns der Umfang der Rechtecke als double zurueckgeliefert
        System.out.println("Der Umfang von R1 = "+r1.getPerimeter());
        System.out.println("Der Umfang von R2 = "+r2.getPerimeter());
    }

    public static double FlacheVerdoppeln(double flaeche){
        return 2*flaeche;
    }

}

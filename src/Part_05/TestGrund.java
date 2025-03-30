package Part_05;

public class TestGrund {
    public static void main(String[] args) {

        // zum Testen: ein zweidimensionales Array - mit Typ, Länge und Breite
        int[][] grundstuecke = {
                {1, 30, 40},
                {2, 20, 50},
                {3, 10, 30}
        };

        // aufrufen der Methode zur Berechnung der Gesamtsteuer und speichern in variable steuer
        double steuer = Grundsteuer.grundsteuerBerechnen(grundstuecke);

        //Ausgabe von Gesamtsteuer für alle Grundstücke
        System.out.println("Gesamtsteuer: " + steuer + " Euro");
    }
}

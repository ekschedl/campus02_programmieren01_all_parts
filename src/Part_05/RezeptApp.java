package Part_05;

public class RezeptApp {
    public static void main(String[] args) {
        // Daten zum Rezept
        String[] zutatenName = {"Nudeln", "Tomatensoße", "Milch", "Käse"};
        double[][] zutaten = {{300, 1.0}, {100, 2.0}, {50, 0.5}, {25, 1.5}};

        // Rezeptobjekt
        Rezept rezept = new Rezept(4, zutatenName, zutaten);

        // Ausgabe vom Rezept
        System.out.println(rezept.toString());

        System.out.println(rezept.allergisch("Käse"));

        // Laktosefreie Methode aufrufen,  Ergebnis speichern
        boolean istLaktoseFrei = rezept.laktoseFrei();

        //ob Laktose entfernt wurde
        System.out.println("Laktose entfernt: " + istLaktoseFrei);

        // Ausgabe der Zutaten nach der Umwandlung in ein laktosefreies Rezept
        for (int i = 0; i < zutatenName.length; i++) {
            System.out.println(zutatenName[i] + ": Menge = " + zutaten[i][0] + " g, Preis = " + zutaten[i][1] + " Euro");
        }

        System.out.println(rezept.kostet());
        System.out.println(rezept.kostetProPerson());

    }
}

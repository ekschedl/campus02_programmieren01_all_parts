package Part_05;

public class Rezept {
    private int anzahlPersonen; //  Anzahl der Personen, für die das Rezept gedacht ist
    private String[] zutatenName; // Namen der Zutaten, z.B. "Nudeln"

    // Zweidimensionales Array, das Menge und Preis der Zutaten speichert.
    // Beispiel: [[300, 1.0], [100, 2.0]]
    // Hier wird die Menge der Zutat und deren Preis gespeichert.
    private double[][] zutaten;

    // Konstruktor
    public Rezept(int anzahlPersonen, String[] zutatenName, double[][] zutaten) {
        this.anzahlPersonen = anzahlPersonen;
        this.zutatenName = zutatenName;
        this.zutaten = zutaten;
    }

    // Getter für AnzahlPersonen
    public int getAnzahlPersonen() {
        return anzahlPersonen;
    }

    //Setter für AnzahlPersonen
    public void setAnzahlPersonen(int anzahlPersonen) {
        this.anzahlPersonen = anzahlPersonen;
    }

    // nur Getter für die Zutaten-Namen, zum ablesen
    public String[] getZutatenName() {
        return zutatenName;
    }

    // nur Getter für die die Zutaten-Menge und Preis, zum ablesen
    public double[][] getZutaten() {
        return zutaten;
    }

    @Override
    public String toString() {
        String result = "Rezept für " + anzahlPersonen + " Personen:\n";
        for (int i = 0; i < zutatenName.length; i++) {
            result += zutatenName[i] + ": Menge = " + zutaten[i][0] + " g, Preis = " + zutaten[i][1] + " Euro\n";
        }
        return result;
    }

    public boolean allergisch(String zutat) {
        for (String zutatItem : zutatenName) {
            if (zutatItem.equalsIgnoreCase(zutat)) {
                System.out.printf("Allergisch gegen Zutat " + zutat + ": ");
                return true;  // Allergisch gegen die Zutat
            }
        }
        System.out.printf("Allergisch gegen Zutat " + zutat + ": ");
        return false;  // Nicht allergisch gegen die Zutat
    }

    public boolean laktoseFrei() {
        boolean entfernt = false;  // wird anzeigt, ob eine Zutat entfernt wurde

        // laktosehaltige Produkten Liste
        String[] laktoseProdukte = {"milch", "käse"};

        // Schleife, die durch alle RezeptZutaten
        for (int i = 0; i < zutatenName.length; i++) {
            // zweite Schleife, die durch das laktoseProdukt
            for (int j = 0; j < laktoseProdukte.length; j++) {
                // Wenn der Zutatname milch oder käse hat
                if (zutatenName[i].toLowerCase().contains(laktoseProdukte[j])) {
                    // die Menge und den Preis dieser Zutat auf 0 (laktosefrei machen)
                    zutaten[i][0] = 0; // Menge auf 0
                    zutaten[i][1] = 0; // Preis auf 0
                    entfernt = true; //  wenn eine Zutat entfernt wurde

                }
            }
        }
        //wenn mindestens eine Zutat entfernt wurde gibt zurück
        return entfernt;
    }

    public double kostet() {
        double gesamtKosten = 0;
        // Durchlaufe alle Zutaten und berechne die Gesamtkosten
        for (int i = 0; i < zutaten.length; i++) {
            gesamtKosten += zutaten[i][0] * zutaten[i][1]; // Menge * Preis
        }
        System.out.println("GesamtKosten: " + gesamtKosten + " Euro"); // Ausgabe von Gesamtkosten
        return gesamtKosten; // Rückgabe der Gesamtkosten
    }



    public double kostetProPerson() {
        double gesamtKosten = kostet();  //   die Gesamtkosten berechnet
        // Berechne die Kosten pro Person
        double kostenProPerson = gesamtKosten / anzahlPersonen;

        System.out.println("Kosten pro Person: " + kostenProPerson + " Euro");  // Ausgabe der Kosten pro Person
        return kostenProPerson;
    }
}

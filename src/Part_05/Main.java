package Part_05;

public class Main {
    public static void main(String[] args) {

//        1.1 Übung 1 – Quader
//        Erstellen Sie eine Klasse Quader mit den Eigenschaften laenge, breite und hoehe. (jeweils
//        double) und fügen Sie nachfolgende Funktionen der Klasse hinzu:
//          • Erstellen Sie eine Methode grundflaeche() welche die Fläche des Rechtecks
//        berechnet. (Länge multipliziert mit Breite)
//          • Erstellen Sie eine Methode skaliere(double faktor), die alle Eigenschaften um
//        einen Faktor (gegeben durch Parameter) vergrößert/verkleinert.
//          • Erstellen Sie eine Methode volumen() um das Volumen des Quaders zu
//        berechnen.
//            • Erstellen Sie eine Methode oberflaeche() um die Oberfläche des Quaders zu
//        berechnen.
//                Testen Sie diese Methoden der Klasse Quader in der main-Methode in der Klasse
//        QuaderApp. (Diese ist nur dafür da, um das Programm auszuführen und die Funktionen
//        von der Klasse Quader zu testen)
//        1.1.1 1.1.1 Mögliche Testdaten in der QuaderApp-Klasse:
//          Quader q = new Quader(2.0, 3.0, 4.0);

//        1.2 Übung 2 – Grundsteuer berechnen
//        Erstellen Sie eine Methode grundsteuerBerechnen() in der Klasse Grundsteuer.
//        Übergeben Sie ein zweidimensionales int Array welches mehrere Zeilen und 3 Spalten
//        aufweist:
//            • [1, 30, 40] Die drei Spalten sind Typ, Länge und Breite eines Grundstücks
//        Für jeden Quadratmeter Fläche muss eine gewisse Steuer bezahlt werden – die Höhe der
//        Steuer ist weiters vom Typ der Fläche abhängig:
//            • Typ 1: 3,20 Euro Steuer pro m2
//            • Typ2: 2,10 Euro Steuer pro m2
//            • Typ 3: 0,90 Euro Steuer pro m2
//        Liefern Sie als Rückgabewert die Summe der zu bezahlenden Steuer zurück. Erstellen Sie
//        an dieser Stelle auch eine TestGrund-Klasse, von welcher aus sie die Klasse
//        Grundsteuer aufrufen und die Methoden dieser ausgiebig testen.
//        1.2.1 Mögliche Testdaten in der TestGrund-Klasse:
//        int[][] grundstuecke = {
//                {1, 30, 40},
//                {2, 20, 50},
//                {3, 10, 30}
//        };


//        Übung 3 – Objekt Auto mit Funktionen
//        Erstellen Sie eine Klasse mit dem Namen "Auto", die die folgenden Attribute hat:
//            • Marke (ein String)
//            • Modell (ein String)
//            • Jahr (ein Int)
//            • Geschwindigkeit (ein Double)
//        Die Klasse sollte die folgenden Methoden haben:
//            • einen Konstruktor, der die Marke, das Modell und das Jahr des Fahrzeugs
//        festlegt.
//            • Getter und Setter (Methoden) für jedes Attribut.
//            • eine Methode namens "gasGeben(double geschw)", die einen double als
//        Parameter annimmt und die Geschwindigkeit des Autos um diesen Wert erhöht.
//            • eine Methode mit dem Namen "bremsen(double geschw)", die einen Double als
//        Parameter annimmt und die Geschwindigkeit des Autos um diesen Wert
//        verringert.
//            • eine Methode namens "toString()", die eine String-Darstellung des Fahrzeugs
//        im folgenden Format zurückgibt -> Beispiel Output:
//        o "Marke: BMW, Modell: G30, Jahr: 2020, Geschwindigkeit: 210"
//        Erstellen Sie eine Hauptklasse namens "AutoTest", die zwei Instanzen der Klasse
//        "Auto" erzeugt, ihre Attribute festlegt und ihre Methoden testet, indem sie sie aufruft
//        und die Ergebnisse ausgibt.
//        Die Hauptklasse könnte zum Beispiel ein "Auto"
//                -Objekt mit dem Namen "auto1" mit
//        den folgenden Attributen erstellen:
//            • Marke: "Toyota"
//            • Modell: "Camry"
//            • Jahr: 2018
//            • Geschwindigkeit: 0
//        Testen Sie diese Methoden der Klasse Auto in der main-Methode in der Klasse
//        AtuoTest. (Diese ist nur dafür da, um das Programm auszuführen und die Funktionen
//        von der Klasse Rezept zu testen)
//        Es könnte dann zB. die Methode "gasGeben()" für "auto1" mit einem Parameter von
//        100.0 und die Methode "toString()" für "auto1" aufgerufen werden um das Ergebnis in
//        der Konsole auszugeben. Danach um soll um 60.0 Km/h gebremst werden, weil ein Reh
//        5
//        PR1 Übungen
//        1.3.1 auf die Straße springt. Zur gleichen Zeit könnte „auto2“ auf der Autobahn um 260 Km/h
//        beschleunigen.
//                Mögliche Testdaten in der AutoTest-Klasse:
//        Auto auto1 = new Auto("Toyota", "Camry", 2018);
//        Auto auto2 = new Auto("BMW", "M550i", 2020);
//    }

//        1.4 Übung 4 – Rezepterstellung
//        Erstellen Sie eine Klasse Rezept mit folgenden Eigenschaften:
//            • anzahlPersonen (int) gibt an für wie viele Personen das Rezept ist
//        o Bsp.: 2
//            • zutatenName (String Feld) gibt die Namen der Zutaten aus dem Array aus
//        o Bsp: [Nudeln, Tomatensoße]
//            • zutaten (Zweidim. double Feld) gibt die Menge und Preis der Zutaten an
//        (zugehörige Name auf zutatenName)
//        o Bsp: [[300, 1.0], [100, 2.0]]
//        o (300 g Nudeln zum Preis von einem Euro, 100 g Tomatensoße um 2 Euro)
//        Erstellen Sie folgende Methoden:
//        o public boolean allergisch(String zutat) die Methode soll wahr zurückliefern
//        falls Zutat in Rezept vorkommt sonst falsch.
//                o public boolean laktoseFrei() die Methode soll Rezept in ein laktosefreies
//        Rezept umwandeln. Bei allen Zutaten mit dem Namen „Milch“ sollen Menge bzw.
//                Preis auf 0 reduziert werden. Ebenso sollen Zutaten die „käse“ beinhalten auf 0
//        6
//        PR1 Übungen
//        reduziert werden. (Verwenden Sie eine String Methode) Die Methode soll wahr
//        zurückliefern, wenn zumindest eine Zutat entfernt wurde, ansonsten falsch.
//                o public double kostet() die Methode Berechnet die Summe der Kosten aller
//        Zutaten und liefert diese als Rückgabewert retour.
//                o public double kostetProPerson() Liefert die Kosten der Zutaten pro Person
//        retour.
//                o public void aenderePersonen(int anzahl) Skaliert die Menge und Kosten aller
//        Zutaten auf die im Parameter angegebene neue Anzahl an Personen. Die Anzahl
//        muss eine positive Zahl größer 0 sein – ansonsten nichts verändern. (Beachten
//        Sie die neue Anzahl kann natürlich auch kleiner sein als die vorherige Anzahl an
//        Personen)
//        o Erstellen Sie auch Getter- und Setter-Methoden für alle private Variablen in der
//        Klasse Rezept (Arrays ausgenommen).
//        1.4.1 Testen Sie diese Methoden der Klasse Rezept in der main-Methode in der Klasse
//        RezeptApp. (Diese ist nur dafür da, um das Programm auszuführen und die Funktionen
//        von der Klasse Rezept zu testen)
//        Mögliche Testdaten in der RezeptApp-Klasse:
//        String[] zutatenName = {"Nudeln", "Tomatensoße", "Milch", "Parmesan"};
//        double[][] zutaten = {{300, 1.0}, {100, 2.0}, {50, 0.5}, {25, 1.5}};
//        Rezept rezept = new Rezept(4, zutatenName, zutaten);
    }
}
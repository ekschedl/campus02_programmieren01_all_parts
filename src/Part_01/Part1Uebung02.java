import java.util.Scanner;

public class Part1Uebung02 {
    public static void main(String[] args) {
        //System.in als Parameter, steht dafuer dass wir explizit über die Konsole was eingeben muessen
        //Wir erzeugen hier ein Objekt des Typs Scanner, welches uns Eingaben von der Konsole einlesen kann
        Scanner scanner = new Scanner(System.in); //Achtung die Klasse Scanner muss ganz oben importiert werden mit import java.util.Scanner!

        boolean bool;

        System.out.print("Bitte gib deinen Vornamen ein: "); //Den Benutzer darauf hinweisen, dass er was eingeben muss
        String vorname = scanner.next(); //Hier wird NUR 1 eingegebenes Wort in die Variable vorname gespeichert
        System.out.print("Bitte gib deinen Nachnamen ein: "); //Den Benutzer darauf hinweisen, dass er was eingeben muss
        String nachname = scanner.next(); //Hier wird NUR 1 eingegebenes Wort in die Variable nachname gespeichert

        //Strings kann man so zusammenfuehren in einen String
        String name = vorname + " " + nachname;

        //Wie lang ist der Inhalt der Variable name?
        //name.length() gibt uns die Zahl zuruck aus wievielen Buchstaben (inkl. Leerzeichen) der String besteht
        bool = name.length() > 10; //Falls name.length() groesser als 10, dann True und sonst False

        //Ausgabe
        System.out.println("Die Laenge ist groesser 10: "+bool+" und die exakte Laenge ist: "+name.length());

        //Das normalisieren der Daten kann helfen potentielle Gefahrenquellen vorzubeugen, indem wir die Eingabe
        //case-insensitive machen, werden wir spaeter bei Vergleichen kein Thema mit gross oder klein-schreibung haben
        System.out.println("Willkommen "+name.toUpperCase()); //Mit .toUpperrCase() werden alle Buchstaben gross geschrieben
        System.out.println("Willkommen "+name.toLowerCase()); //Mit .toLowerCase() werden alle Buchstaben klein geschrieben

    }
}

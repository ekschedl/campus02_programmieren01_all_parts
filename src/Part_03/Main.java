package Part_03;

import java.util.Arrays;
import java.util.Random; // Importiert die Klasse Random für Zufallszahlen
import java.util.concurrent.TimeUnit; // Importiert die Klasse TimeUnit für die Steuerung der Verzögerung
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //ArrayNichtAufEinmal();
        // ArrayNichtAufEinmal_herzic();

        //ArrayMaxGleitkommazahl();
        // ArrayMaxGleitkommazahl_herzic();

        //ArrayLength8Strings();
        //ArrayLength8Strings_herzic();

        //ArraySummeOf12Elemente();
        //ArraySummeOf12Elemente_herzic();

        //Array15Zufalls();
        //Array15Zufalls_herzic();

        //Array20GeradeZufalls();
        //Array20GeradeArray_herzic();

        //Array10SpezialStart();
        //Array10SpezialStart_herzic();

        //Array10ZahlenMax();
        //Array10ZahlenMax_herzic();

        //Array10ZahlenMax();
        //rray10ZahlenMax_herzic();

        //Array6ZahlenMin();
        //Array6ZahlenMin_herzic();

        //Array9GleitkommaDurchschnitt();
        //Array9GleitkommaDurchschnitt_herzic();

        //MalReichen();

    }

    //1. Schreibe ein Programm, das ein Array von 10 Ganzzahlen erzeugt und diese
    //anschließend, Element für Element (nicht alles auf einmal), in der Konsole ausgibt.
    public static void ArrayNichtAufEinmal() throws InterruptedException {
        Random random = new Random(); // Erstellt ein Random-Objekt für Zufallszahlen
        int[] numbers = new int[10]; // Erstellt ein Array mit 10 Ganzzahlen

        // Füllt das Array mit Zufallszahlen zwischen 0 und 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Durchläuft das Array und gibt jede Zahl mit Verzögerung aus
        for (int number : numbers) {
            System.out.println(number);// Gibt die aktuelle Zahl aus
            TimeUnit.MILLISECONDS.sleep(300);  // Wartet 300 Millisekunden vor der nächsten Ausgabe
        }
    }

    public static void ArrayNichtAufEinmal_herzic() {
        //Manuell ein Array mit 10 Ganzzahlen also int erzeugen
        int[] zahlen = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        //Das Array Element fuer Element ausgeben
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }

    /*----------------------------------------------------------------------*/

    //2. Schreibe ein Programm, das ein Array von 5 Gleitkommazahlen erzeugt (Kein
    //Einlesen aus der Konsole) und das größte Element im Array findet und ausgibt.
    public static void ArrayMaxGleitkommazahl() {
        //float[] numbers = {1.3f, 2.3f, 3.4f, 0.3f, -4f, 54f, 1.43f, 1.5f, 0f};   // Initialisiert das Array mit 10 Gleitkommazahlen in float typ
        //double[] numbers = {1.3, 2.3, 3.4, 0.3, -4}; // Initialisiert das Array mit 10 Gleitkommazahlen in double typ
        Random random = new Random();
        double[] numbers = new double[5];// Erstellt ein Array mit 5 Gleitkommazahlen

        //Befüllt Array mit Zufallszahlen
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble();
        }

        // Setzt das erste Element als Startwert für max (größte Zahl) und min (kleinste Zahl)
        double max = numbers[0];
        double min = numbers[0];
        // Durchläuft das Array, um das größte und kleinste Element zu finden
        for (double number : numbers) {
            if (number > max) {
                max = number;  // Aktualisiert die größte Zahl
            } else if (number < min) {
                min = number; // Aktualisiert die kleinste Zahl
            }
        }
        // Gibt die Ergebnisse aus
        System.out.println("Das größte Element im Array ist: " + max);
        System.out.println("Das kleinste Element im Array ist: " + min);
    }

    public static void ArrayMaxGleitkommazahl_herzic() {
        {
            //Ein Array vom Typen Double erzeugen und mit 5 Gleitkommazahlen befuellen
            double[] zahlen = {2.5, 6.8, 3.2, 9.7, 5.1};
            //Hilfsvariable um das groesste Element zu finden, wird
            //ueblicherweise mit dem ersten Wert des Arrays defaultmaessig initialisiert
            double max = zahlen[0];
            //Schleife um den groessten Wert zu finden
            for (int i = 1; i < zahlen.length; i++) {
                //Falls zahl an Stelle i > als die bisher angenommene groesste
                // Zahl -> Dann geh in die If hinein
                if (zahlen[i] > max) {
                    //Wir wissen nun das zahl an Stelle i groesser ist als max
                    // also nimmt max den Wert von Zahl an Stelle i an
                    max = zahlen[i];
                }
            }
            //Ausgabe der groessten Zahl im Array
            System.out.println("Das größte Element im Array ist " + max);
        }
    }

    /*----------------------------------------------------------------------*/

    //3. Schreibe ein Programm, das ein Array von 8 Strings erzeugt (Kein Einlesen von
    // der Konsole) und die Länge jedes Strings im Array ausgibt.
    public static void ArrayLength8Strings() {
        Random random = new Random(); // Erstellt ein Random-Objekt für zufällige Zahlen

        String[] words = new String[8]; // Erstellt ein Array mit 8 Strings
        String[] wordList = { // Liste mit möglichen Wörtern
                "Apfel", "Banane", "Orange", "Traube", "Mango", "Erdbeere", "Kirsche", "Melone",
                "Ananas", "Pfirsich", "Birne", "Zitrone", "Himbeere", "Johannisbeere", "Kiwi",
                "Granatapfel", "Feige", "Dattel", "Papaya", "Passionsfrucht"
        };

        //Befüllen Array mit zufälligen Wörtern aus der wordList
        for (int i = 0; i < words.length; i++) {
            //Wählt ein zufälliges Wort aus wordList und speichert es im Array words
            words[i] = wordList[random.nextInt(wordList.length)];  // random.nextInt(wordList.length) gibt eine Zufallszahl zwischen 0 und wordList.length-1 zurück
        }

        // Durchläuft das Array und gibt die Länge jedes Wortes aus (Variante 1):
        for (String word : words) {
            System.out.println("Die Länge von \"" + word + "\" : " + word.length() + " Zeichen.");
        }

        // Durchläuft das Array und gibt die Länge jedes Wortes aus (Variante2 -  mit innerer Schleife):
        // Äußere Schleife zählt die Wörteranzahl in Array
        /*for (int i = 0; i < words.length; i++) {
            int length = 0; // Speichern der Wortlänge

            // Innere Schleife durchläuft jedes Zeichen des aktuellen Wortes
            for (int j = 0; j < words[i].length(); j++) {
                length++; // Erhöht die Länge für jedes Zeichen im Wort
            }
            System.out.println("Das Word \"" + words[i] + "\" hat " + length + " Buchstaben");
        }*/
    }

    public static void ArrayLength8Strings_herzic() {
        //Ein Array von 8 Strings erzeugen und die Werte gleich entsprechend zuweisen

        String[] namen = {"Anna", "Berta", "Carla", "Daniel", "Emma",
                "Fritz", "Gabi", "Hans"};
        //Die Laenge eines jeden einzelnen Strings herausfinden und
        //gleichzeitig ausgeben
        for (int i = 0; i < namen.length; i++) {
            System.out.println("Der Name " + namen[i] + " hat " +
                    namen[i].length() + " Buchstaben.");
        }
    }

    /*----------------------------------------------------------------------*/

    //4. Schreibe ein Programm, das ein Array von 12 Ganzzahlen erzeugt (Kein Einlesen
    //von der Konsole) und eine Summe aller Elemente im Array berechnet.
    public static void ArraySummeOf12Elemente() {
        Random random = new Random(); // Erstellt ein Random-Objekt für die Generierung von Zufallszahlen
        int[] numbers = new int[12]; // Erstellt ein Array mit 12 Ganzzahlen
        int sum = 0;     // Variable zur Speicherung der Summe

        // Befüllt das Array mit zufälligen Zahlen zwischen 0 und 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generiert eine Zufallszahl zwischen 0 und 99 und speichert sie im Array
        }
        System.out.println("Zufälliges Array ist: " + Arrays.toString(numbers));

        // Durchläuft das Array und addiert jedes Element zur Summe
        for (int number : numbers) {
            sum += number;
        }
        // Gibt die berechnete Summe aus
        System.out.println("Die Summe der 12 Elemente beträgt: " + sum);
    }

    public static void ArraySummeOf12Elemente_herzic() {
        //Ein int-Array mit 12 Ganzzahlen erzeugen und die Werte zuweisen
        int[] zahlen = {5, 8, 2, 10, 3, 9, 7, 1, 6, 4, 12, 11};
        //Hilfsvariable erzeugen um die Summe zu speichern
        int summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            //Summe berechnen
            summe += zahlen[i]; //ist gleich wei summe = summe + zahl[i}
        }
        System.out.println("Die Summe aller Elemente im Array ist " + summe);
    }

    /*----------------------------------------------------------------------*/

    //5. Schreibe ein Programm, das ein Array von 15 Zufallszahlen zwischen 1 und 100
    //erzeugt (Kein Einlesen von der Konsole) und alle Elemente, einzeln (nicht alles
    //auf einmal) im Array ausgibt.
    public static void Array15Zufalls() {
        //Variante 1 - Math.random
        /*int[] numbers = new int[15]; // Erstellt ein Array mit 15 Ganzzahlen

        // Befüllen und Ausgeben des Arrays mit Zufallszahlen:
        for (int i = 0; i < numbers.length; i++) {
                //Math.random() → Zahl zwischen 0.0 und 1.0.
                //	* 100 → Zahl zwischen 0.0 und 99.9999.
                //	(int) → Ganze Zahl zwischen 0 und 99.
                //	+1 → Ganze Zahl zwischen 1 und 100.
            numbers[i] = (int) (Math.random() * 100) + 1;
            System.out.print(numbers[i] + " "); //  Ausgabe
        }*/

        //Variante 2 - Random
        Random random = new Random(); // Erstellt ein Random-Objekt
        int[] numbers = new int[15];  // Erstellt ein Array mit 15 Ganzzahlen

        // Befüllen und Ausgeben des Arrays mit Zufallszahlen:
        for (int i = 0; i < numbers.length; i++) {
            // random.nextInt(1, 101) erzeugt eine Zahl zwischen 1 (inkl.) und 101 (exkl.), also >= 1 und <= 100.
            numbers[i] = random.nextInt(1, 101);
            System.out.println("Element an Index " + i + ": " + numbers[i]);

            // Zeitverzögerung (0.3 sec)
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void Array15Zufalls_herzic() {
        //Ein int-Array mit der fixen Groesse 15 erstellen aber noch keine
        //Werte den Elementen zuweisen
        int[] zahlen = new int[15];
        //ACHTUNG: Sie muessen ganz oben ein import java.util.Random; einbauen!
        Random random = new Random(); //erzeugt uns ein Objekt des Typs
        //Random um spaeter Zufallszahlen zu erzeugen
        for (int i = 0; i < zahlen.length; i++) {
            //Hier weissen wir dem Element im Array zahlen an der Stelle i
            //eine Zufaellige Zahl zwischen 1 und 100 zu
            zahlen[i] = random.nextInt(100) + 1;
        }
        //Hier geben wir nun jedes einzelne Element fuer Element in der Konsole aus
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }

    /*----------------------------------------------------------------------*/

    //6. Schreibe ein Programm, das ein Array von 20 Ganzzahlen erzeugt (Kein Einlesen
    // von der Konsole) und nur die geraden Zahlen im Array ausgibt.
    public static void Array20GeradeZufalls() {
        Random random = new Random();
        int[] arr = new int[20];

        // Füllt das Array mit zufälligen geraden Zahlen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) * 2; // Erzeugt gerade Zahlen zwischen 0 und 198
        }
        // Gibt das Array als Zeichenkette aus
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            //Pruefen ob die Zahl gerade ist bzw. durch 2 teilbar
            if (arr[i] % 2 == 0) {
                //Ausgabe in die Konsole falls TRUE
                System.out.println(arr[i] + " ist eine gerade Zahl.");
            }
        }

    }

    public static void Array20GeradeArray_herzic() {
        //Erzeugen von Array mit 20 Werten
        int[] zahlen = {5, 8, 12, 15, 18, 20, 25, 30, 35, 40, 45, 50, 55, 60,
                65, 70, 75, 80, 85, 90};
        for (int i = 0; i < zahlen.length; i++) {
            //Pruefen ob die Zahl gerade ist bzw. durch 2 teilbar
            if (zahlen[i] % 2 == 0) {
                //Ausgabe in die Konsole falls TRUE
                System.out.println(zahlen[i] + " ist eine gerade Zahl.");
            }
        }
    }

    /*----------------------------------------------------------------------*/

    //7. Schreibe ein Programm, das ein Array von 10 Strings erzeugt (Kein Einlesen von
    // der Konsole) und diejenigen Strings im Array ausgibt, die mit einem bestimmten
    // Buchstaben beginnen.
    public static void Array10SpezialStart() {
        Random random = new Random();
        String[] arr = new String[10];

        String[] wordsList = {
                "BMW", "Mercedes", "Audi", "Volkswagen", "Porsche", "Opel", "Ford", "Toyota", "Honda", "Nissan",
                "Ferrari", "Lamborghini", "Maserati", "Bugatti", "Tesla", "Volvo", "Chevrolet", "Hyundai", "Kia", "Peugeot"
        };

        // Befüllen des Arrays mit 10 zufälligen Wörtern aus wordsList
        for (int i = 0; i < arr.length; i++) {
            arr[i] = wordsList[random.nextInt(wordsList.length)];
        }

        Scanner scanner = new Scanner(System.in);
        // Ausgabe des erstellten Arrays
        System.out.println("Ich habe für Sie ein Array erstellt:\n" + Arrays.toString(arr) +
                "\nGeben Sie bitte einen Buchstaben ein, und ich zeige Ihnen die Wörter, die mit diesem Buchstaben beginnen:");

        char buchstabe = scanner.next().charAt(0); // Benutzer gibt einen Buchstaben ein
        int counter = 0; // Zähler für gefundene Wörter

        // Durchlaufen des Arrays und Überprüfung auf passenden Anfangsbuchstaben
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().charAt(0) == buchstabe) {
                System.out.println("Gefunden: " + arr[i]);
                counter++;
            }
        }
        // Ausgabe der Anzahl gefundener Wörter, je nach dem wie plural oder singular
        if (counter == 1) {
            System.out.println("Dieses Array hat " + counter + " Wort, das mit " + "'" + buchstabe + "'" + " beginnt: ");
        } else {
            System.out.println("Dieses Array hat " + counter + " Wörter, die mit " + "'" + buchstabe + "'" + " beginnen.");
        }


    }

    public static void Array10SpezialStart_herzic() {
        //String-Array mit 10 Woertern erstellen
        String[] woerter = {"Auto", "Apfel", "Birne", "Banane", "Blume",
                "Computer", "Delfin", "Ente", "Erdbeere", "Fisch"};
        //Den bestimmten Buchstaben auswaehlen
        char startBuchstabe = 'B';
        for (int i = 0; i < woerter.length; i++) {
            //Pruefen ob der ine Buchstabe an der ersten Stelle also 0, dem
            //startBuchstaben entspricht
            if (woerter[i].charAt(0) == startBuchstabe) {
                //Falls TRUE, dann ausgeben
                System.out.println(woerter[i] + " beginnt mit dem Buchstaben " + startBuchstabe);
            }
        }
    }

    /*----------------------------------------------------------------------*/

    //8. Schreiben Sie ein Programm, das die Elemente eines Arrays mit 10 ganzen Zahlen
    //von der Konsole durch den Benutzer einliest und dann das größte Element findet
    //und ausgibt.
    public static void Array10ZahlenMax() {

        Scanner scanner = new Scanner(System.in);  // Erstellt einen Scanner zum Einlesen der Benutzereingabe
        System.out.println("Sie können hier ein Array erstellen und ich gebe das größte Element aus\n");// Ausgabe für den Benutzer
        int[] zahlen = new int[10];     // Deklaration eines Arrays mit einer Größe von 10

        int max = Integer.MIN_VALUE; // Initialisierung von max mit dem kleinstmöglichen Integer-Wert

        // Array befüllen mit Eingabeprüfung
        for (int i = 0; i < zahlen.length; i++) {
            // Ausgabe für den Benutzer: Aufforderung zur Eingabe einer Zahl
            System.out.print("Zahl " + (i + 1) + ": ");

            // Eingabeprüfung: Prüfen, ob der Benutzer eine gültige ganze Zahl eingibt
            while (!scanner.hasNextInt()) {
                System.out.println("Ungültige Eingabe! Bitte erneut eine Zahl für Zahl " + (i + 1) + " eingeben:");//  Fehlermeldung und erneute Ausgabe für den Benutzer
                scanner.next(); // Ungültige Eingabe wird aus dem Puffer entfernt, um eine Endlosschleife zu vermeiden
            }

            zahlen[i] = scanner.nextInt(); // Speichern der gültigen Zahl im Array

            // Wichtig: Wenn max UND min gesucht wird: Hier werden zwei getrennte if-Bedingungen verwendet.
            // Dadurch wird sichergestellt, dass min immer aktualisiert wird, auch wenn die Zahl max ist.            if (zahlen[i] > max) {

            //Suche nach Max. Zahl im Array
            if (zahlen[i] > max) {
                max = zahlen[i]; // Aktualisiert max, falls die neue Zahl größer ist
            }


        }
        // Ausgabe des erstellten Arrays, Maximalwerte
        System.out.println("Sie haben ein Array erstellt: " + Arrays.toString(zahlen));
        System.out.println("Max Zahl: " + max);
        //System.out.println("Min Zahl: " + min);

    }

    public static void Array10ZahlenMax_herzic() {
        //Benutzereingabe und Variablen vorbereiten
        Scanner input = new Scanner(System.in);
        int[] zahlen = new int[10];
        //Hierzu gibt es eine kurze Beschreibung im Loesungs-Dokument
        //Hier wird der kleinstmoegliche Integer-Wert zugewiesen weil wir
        // keinen Wert im Array haben um mit dem einen Default-Wert zuzuweisen
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < zahlen.length; i++) {
            //Benutzereingabe um das Array mit 10 Elementen zu fuellen
            System.out.print("Geben Sie die " + (i + 1) + ". Zahl ein: ");
            zahlen[i] = input.nextInt();
            //gleich mitpruefen ob die eingegebene Zahl die groesste bis jetzt ist
            if (zahlen[i] > max) {
                max = zahlen[i]; //Falls TRUE, dann Variable max mit der aktuellen Zahl setzen
            }
        }
        System.out.println("Das größte Element des Arrays ist: " + max);


    }

    /*----------------------------------------------------------------------*/

    //9. Schreibe ein Programm, das ein Array von 6 Ganzzahlen erzeugt (Kein Einlesen
    //von der Konsole!) und das kleinste Element im Array findet und ausgibt.
    public static void Array6ZahlenMin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sie können hier ein Array erstellen und ich gebe das kleinste Element aus.\n");// Ausgabe für den Benutzer
        int[] zahlen = new int[6];
        int min = Integer.MAX_VALUE;
        int min2 = zahlen[0];


        //Befüllen, dabei überprüfen die Gültigkeit und
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Zahl " + (i + 1) + ":");// Ausgabe für den Benutzer

            //Überprüfung Gültigkeit
            while (!scanner.hasNextInt()) {
                System.out.println("Ungültige Eingabe! Bitte erneut die Zahl " + (i + 1) + " eingeben:");
                scanner.next();
            }
            // Speichern
            zahlen[i] = scanner.nextInt();

            //Min Zahl finden
            if (zahlen[i] < min) {
                min = zahlen[i];
            }

            if (zahlen[i] < min2) {
                min2 = zahlen[i];

            }
        }
        // Ausgabe des erstellten Arrays, Minimalwerte
        System.out.println("Sie haben ein Array erstellt: " + Arrays.toString(zahlen));
        System.out.println("Min Zahl: " + min);
        System.out.println("Min Zahl variante 2: " + min2);


    }

    public static void Array6ZahlenMin_herzic() {
        //Array mit 5 Zahlen erzeugen
        int[] zahlen = {10, 5, 8, 20, 15, 25};
        //Hier haben wir die Zahlen schon im Array, da reicht es mit einer
        // der Zahlen aus dem Array als Default-Wert zuzuweisen
        int kleinsteZahl = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < kleinsteZahl) {
                kleinsteZahl = zahlen[i];
            }
        }
        System.out.println("Die kleinste Zahl im Array ist: " +
                kleinsteZahl);
    }

    /*----------------------------------------------------------------------*/

    //10. Schreibe ein Programm, das ein Array von 9 Gleitkommazahlen erzeugt (Kein
    //Einlesen von der Konsole) und das durchschnittliche Element im Array berechnet und ausgibt.
    public static void Array9GleitkommaDurchschnitt() {
        System.out.println("Ich erstelle random Array, berechne das durchschnittliche" +
                " Element im Array und gebe es aus.\n");// Ausgabe für den Benutzer

        Random random = new Random();
        float[] zahlen = new float[9];// Array mit 9 Elementen erstellen
        float sum = 0; // Variable für die Summe der Zahlen

        // Array befüllen und Werte ausgeben
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = random.nextFloat() * 10;  // ZufallGleitkommazahl zwischen 0 und 10
            System.out.printf("%.2f%n", zahlen[i]); // Zahl mit 2 Nachkommastellen ausgeben
            sum += zahlen[i];  // Aktuelle Zahl zur Gesamtsumme addieren
        }
        // Durchschnitt berechnen
        System.out.printf("Summe: %.2f%n", +sum);
        // Mittelwert berechnen: Summe/Anzahl der Elemente
        float durchschnitt = sum / zahlen.length;

        //  Durchschnittswert ausgeben
        System.out.printf("Das durchschnittliche Element: %.2f%n", durchschnitt);

        // Das gesamte Array als Zeichenkette ausgeben
        System.out.printf("Generiertes Array: %s%n", Arrays.toString(zahlen));
    }

    public static void Array9GleitkommaDurchschnitt_herzic() {
        //Erzeugen des Arrays
        double[] zahlen = {3.5, 4.2, 6.7, 8.9, 9.3, 10.1, 12.5, 13.8, 15.2};
        double summe = 0;
        for (int i = 0; i < zahlen.length; i++) {
            summe += zahlen[i];
        }
        //Berechnung und Ausgabe des Durschnitts -> Nicht in der Schleife,
        //das kommt erst am Ende!
        double durchschnitt = summe / zahlen.length;
        System.out.println("Der Durchschnitt der Zahlen im Array beträgt: " +
                durchschnitt);
    }

    /*----------------------------------------------------------------------*/

    //11. MalReichen()
    public static void MalReichen() {
        int[][][] malReichen = new int[3][3][3];

        for (int i = 0; i < malReichen.length; i++) {
            for (int j = 0; j < malReichen[i].length; j++) {
                for (int k = 0; k < malReichen[i][j].length; k++) {
                    int produkt = (i + 1) * (j + 1) * (k + 1);
                    System.out.println((i + 1) + "*" + (j + 1) + "*" + (k + 1) + "=" + produkt);
                }
                System.out.println("++++");
            }
        }
    }
}






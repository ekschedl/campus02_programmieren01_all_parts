package Part_03;

import java.util.Arrays;
import java.util.Random; // Importiert die Klasse Random für Zufallszahlen
import java.util.concurrent.TimeUnit; // Importiert die Klasse TimeUnit für die Steuerung der Verzögerung
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //ArrayNichtAufEinmal();
        //ArrayMaxGleitkommazahl();
        //ArrayLength8Strings();
        //ArraySummeOf12Elemente();
        //Array15Zufalls();
        //Array20GeradeZufalls();
        //Array10SpezialStart();
        //Array10ZahlenMax();
        //Array6ZahlenMin();
        //Array9GleitkommaDurchschnitt();
        MalReichen();

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

    //11. MalReichen()
    public static void MalReichen() {
        int[][][] malReichen = new int[3][3][3];

        for (int i = 0; i < malReichen.length; i++) {
            for (int j = 0; j < malReichen[i].length; j++) {
                for (int k = 0; k < malReichen[i][j].length; k++) {
                    int produkt = (i + 1) * (j + 1)*(k + 1);
                    System.out.println((i + 1) + "*" + (j + 1) + "*" + (k + 1)+ "=" + produkt);


                }
                System.out.println("++++");
            }
        }
    }
}






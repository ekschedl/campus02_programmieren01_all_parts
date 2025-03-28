package Part_01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Menu(); // Menü aufrufen
       // Bankomat();

    }
    //-----------------------------------------------------------------------------/

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) { // Endlosschleife für das Menü
            System.out.println("Wählen Sie bitte eine Option, indem Sie eine Zahl zwischen 1 und 5 eingeben:" +
                    "\n1. Umgekehrte Stringausgabe" +
                    "\n2. Prüfen, ob eine Zahl gerade oder ungerade ist" +
                    "\n3. Vokale zählen" +
                    "\n4. Fakultät berechnen" +
                    "\n5. Nummer in englische Wörter konvertieren" +
                    "\n6. Beenden");

            int userChoice = scanner.nextInt();  // liest nur die Ganzzahl, aber nicht das Zeilenumbruch-Zeichen (\n), das nach dem Drücken der Enter-Taste im Eingabepuffer bleibt
            scanner.nextLine(); // Entfernt das verbleibende \n im Puffer

            // Variante 1: if -else if // Ruft die entsprechende Methode auf, basierend auf der vom Benutzer eingegebenen Nummer
            /*if (userChoice == 1) {
                StringDirection();
            } else if (userChoice == 2) {
                GeradeOderNichtGerade();
            } else if (userChoice == 3) {
                VokaleInSatz();
            } else if (userChoice == 4) {
                Fakultaet();
            } else if (userChoice == 5) {
                NumberInEnglishWords();
            } else if (userChoice == 6) {
                System.out.println("Das Programm ist beendet.");
                break;  // Beendet die Schleife und kehrt aus Menu() zurück
            } else {
                System.out.println("Ungültige Eingabe! Versuchen bitte Sie noch einmal.\n"); // Falls der Benutzer eine falsche Zahl eingibt
            }*/

            // Variante 2: switch, ruft die entsprechende Methode auf, basierend auf der vom Benutzer eingegebenen Nummer
            switch (userChoice) {
                case 1:
                    StringDirection();
                    break;
                case 2:
                    GeradeOderNichtGerade();
                    break;
                case 3:
                    VokaleInSatz();
                    break;
                case 4:
                    Fakultaet();
                case 5:
                    NumberInEnglishWords();
                    break;
                case 6:
                    System.out.println("Das Programm ist beendet.");
                    return; // Beendet `Menu()`
                default:
                    System.out.println("Ungültige Eingabe! Bitte eine Zahl zwischen 1 und 5 eingeben.");
            }
        }
    }
    //-----------------------------------------------------------------------------/

    //1.4.1 Schreiben Sie ein Programm, das den Benutzer auffordert, eine Zeichenfolge
    //einzugeben, und dann die Zeichenfolge in umgekehrter Reihenfolge ausgibt.
    //Wenn der Benutzer zum Beispiel "Hallo" eingibt, soll das Programm "olleh"
    //ausgeben.
    public static void StringDirection() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ich erstelle für Sie eine umgekehrte Stringausgabe." +
                "\nGeben Sie bitte hier eine Zeichenfolge ein: "); // // Gibt eine Nachricht aus

        String userInput = scanner.nextLine().toLowerCase(); // Liest die Benutzereingabe, umwandelt die in Kleinbuchstaben
        System.out.println("Sie haben eingegeben: " + userInput); //Ausgabe von Eingabe

        String reversed = ""; // Erstellt eine leere Variable zum Nachfüllen mithilfe der Schleife, also hier wird das umgekehrte Wort schrittweise speichert
        int userInputLength = userInput.length(); //  speichert die Länge der Eingabezeichenfolge

        // Durchläuft die Zeichenfolge in der Richtung von Ende bis zum Start und fügt jedes Zeichen der 'reversed' hinzu
        for (int i = userInputLength - 1; i >= 0; i--) {
            reversed += userInput.charAt(i);
        }

        System.out.println("Die umgekehrte Stringausgabe ist: " + reversed + "\n ");//Gibt die umgekehrte Zeichenfolge aus
    }
    //-----------------------------------------------------------------------------/

    //1.4.2 Schreibe ein Programm, das den Benutzer auffordert, eine ganze Zahl
    //einzugeben, und dann prüft, ob die ganze Zahl gerade oder ungerade ist. Das
    //Programm soll eine Meldung ausgeben, die angibt, ob die ganze Zahl gerade oder
    //ungerade ist.
    public static void GeradeOderNichtGerade() {
        // Ausgabe was für Programm ist und Aufforderung zur Eingabe einer Zahl
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich sage, ob eine Zahl gerade oder nicht gerade ist.\nGeben Sie Ihre Zahl hier ein:");

        int userNumber = scanner.nextInt(); // Liest eine ganze Zahl von der Konsole ein und speichert sie in dieser Variable
        if (userNumber == 0) { // Sonderfall: Falls die eingegebene Zahl 0 ist
            System.out.println("Ihre Zahl ist 0.\nMathematisch gesehen ist 0 eine gerade Zahl.\n");
        } else if (userNumber % 2 == 0) { //Prüft mithilfe von Modulo , ob die Zahl durch 2 teilbar ist
            System.out.println("Die Zahl " + userNumber + " ist gerade.\n");
        } else { //Falls die Zahl nicht durch 2 teilbar ist
            System.out.println("Die Zahl " + userNumber + " ist nicht gerade.\n");
        }
    }
    //-----------------------------------------------------------------------------/

    //1.4.3 Schreiben Sie ein Programm, das den Benutzer auffordert, einen Satz
    //einzugeben, und dann die Anzahl der Vokale in diesem Satz zählt. Für die Zwecke
    //dieses Programms sind die Vokale 'a', 'e', 'i', 'o' und 'u'.
    public static void VokaleInSatz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich bin das Programm 'SucheVokale'.\nGeben Sie hier bitte einen Satz ein und ich zähle wie oft kommen die Vokale " +
                "\"a\", \"e\", \"i\", \"o\", \"u\" in Ihrem Satz vor:");
        String userLineText = scanner.nextLine().toLowerCase();// liest die Eingabe des Benutzers, wandelt sie in Kleinbuchstaben um

        // Zähler Initialisierung für die Vokale
        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;

        // Variante 1: " for und if -else if"
        // Durchläuft jeden Buchstaben des eingegebenen Satzes
       /* for (int i = 0; i < userLineText.length(); i++) {  // length(), da userLineText ein String ist
            // Prüft, ob das Zeichen ein entsprechender Vokal ist, und erhöht den jeweiligen Zähler
            // Achtung! equals() ist nur für Strings geeignet!
        if (userLineText.charAt(i) == 'a') {
            counterA += 1;
        } else if (userLineText.charAt(i) == 'e') {
            counterE += 1;
        } else if (userLineText.charAt(i) == 'i') {
            counterI += 1;
        } else if (userLineText.charAt(i) == 'o') {
            counterO += 1;
        } else if (userLineText.charAt(i) == 'u') {
            counterU += 1;
        } */

        // Variante 2: "for und switch"
        // ohne break -läuft der switch-Block weiter und zählt alle case-Blöcke danach auch mit
        // Durchläuft jeden Buchstaben des eingegebenen Satzes
        for (int i = 0; i < userLineText.length(); i++) {  // length(), da userLineText ein String ist
            char vokaleItem = userLineText.charAt(i);  // Nimmt das aktuelle Zeichen
            //Prüft, ob das Zeichen ein Vokal ist und erhöht den jeweiligen Zähler
            switch (vokaleItem) {
                case 'a':
                    counterA += 1;
                    break;
                case 'e':
                    counterE += 1;
                    break;
                case 'i':
                    counterI += 1;
                    break;
                case 'o':
                    counterO += 1;
                    break;
                case 'u':
                    counterU += 1;
                    break;
            }
        }
        //Ausgabe von Ergebnissen
        System.out.println("In Ihrem Satz gibt es:" +
                "\n\"a\" : " + counterA + " Mal" +
                "\n\"e\" : " + counterE + " Mal" +
                "\n\"i\" : " + counterI + " Mal" +
                "\n\"o\" : " + counterO + " Mal" +
                "\n\"u\" : " + counterU + " Mal\n");
    }
    //-----------------------------------------------------------------------------/

    //1.4.4 Schreibe ein Programm, das den Benutzer auffordert, eine positive ganze Zahl
    //einzugeben, und dann die Fakultät dieser ganzen Zahl ausgibt. Die Fakultät von n
    //ist das Produkt aller positiven ganzen Zahlen bis einschließlich n. Die Fakultät von
    //5 ist zum Beispiel 5 * 4 * 3 * 2 * 1 = 120.
    public static void Fakultaet() {
        //Variante 1:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine positive ganze Zahl (bis inkl. 20) und ich rechne die Fakultät dieser ganzen Zahl: ");// Fordert den User zur Eingabe auf
        int userNumber = scanner.nextInt();// Liest die Benutzereingabe als Ganzzahl - nextInt()
        System.out.println("Ihre Zahl ist: " + userNumber); // Gibt die eingegebene Zahl aus

        int ergebnis = 1; // Variable für das Ergebnis

        if (userNumber < 0) { // Prüft, ob die Zahl negativ ist und beendet die Methode bei ungültiger Eingabe
            System.out.println("Ungültige Eingabe. Die Zahl muss positiv sein.\n");
            return;
        } else if (userNumber == 0) { // Sonderfall: Fakultät von 0 ist immer 1 und beendet die Methode, da keine weitere Berechnung nötig ist
            System.out.println("Sonderfall: Fakultät von 0 ist immer 1\n");
            return;
        } else if (userNumber > 20) { // Warnung, weil `long` für große Werte nicht reicht, sonst wäre unteres sout ausgegeben
            System.out.println("Die Zahl ist zu groß! Keine Fakultätsberechnung.\n ");
            return; // Beendet die Methode, sonst wäre unteres sout ausgegeben
        } else { // Fakultätsberechnung für Werte bis 20 in diesem Fall
            for (int i = 1; i <= userNumber; i++) {// Schleife von 1 bis zur eingegebenen Zahl, hier also bis inkl. 20
                ergebnis *= i; // Multipliziert die aktuelle Zahl mit dem bisherigen Ergebnis
            }
        }
        System.out.println("Die Fakultät von " + userNumber + " ist : " + ergebnis + "\n"); // Gibt das Ergebnis aus


        // Variante 2:
        /*int userNumber; // deklariert Variable für die eingegebene Zahl
        do {
            System.out.println("Geben Sie bitte eine positive ganze Zahl(bis inkl. 20) ein: "); // Fordert den User zur Eingabe auf
            userNumber = scanner.nextInt(); // Liest die Benutzereingabe als Ganzzahl - nextInt()
            System.out.println("Ihre Zahl ist: " + userNumber); // Gibt die eingegebene Zahl aus

            if (userNumber < 0) { // Überprüft, ob die Zahl negativ ist
                System.out.println("Ungültige Eingabe. Die Zahl muss positiv sein.\n");
            }
        } while (userNumber < 0); // Wiederholt die Eingabe, solange die Zahl negativ ist

        long ergebnis = 1; // Variable für das Ergebnis,  `long`, um größere Werte zu speichern

        if (userNumber == 0) { // Sonderfall: Fakultät von 0 ist 1
            System.out.println("Sonderfall: Fakultät von 0 ist immer 1\n");
        } else if (userNumber > 20) { // Warnung, weil `long` für große Werte nicht reicht
            System.out.println("Die Zahl ist zu groß! Keine Fakultätsberechnung\n ");
        } else { // Fakultätsberechnung für Werte bis 20
            for (int i = 1; i <= userNumber; i++) { // Schleife von 1 bis zur eingegebenen Zahl, hier also bis inkl. 20
                ergebnis *= i; // Multipliziert die aktuelle Zahl mit dem bisherigen Ergebnis
            }
            System.out.println("Die Fakultät von " + userNumber + " ist: " + ergebnis +"\n"); // Gibt das Ergebnis aus
        }*/
    }
    //-----------------------------------------------------------------------------/

    //1.2 Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine Zahl zwischen 1
    //und 10 (einschließlich) einzugeben, und dann das englische Wort für diese Zahl ausgibt.
    //Wenn der Benutzer eine ungültige Zahl eingibt, sollte das Programm eine Fehlermeldung
    //ausgeben und den Benutzer auffordern, erneut eine gültige Zahl einzugeben.
    public static void NumberInEnglishWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich kann eine Nummer in englische Wörter konvertieren." +
                "\nGeben Sie bitte eine Zahl zwischen 1 und 10 (einschließlich) ein:");
        int userNumber; // Variable zur Speicherung der Benutzereingabe
        String englishWord = ""; // Variable zur Speicherung des entsprechenden englischen Wortes
        do {
            userNumber = scanner.nextInt();// Die Zahl vom Benutzer einlesen
            if (userNumber < 1 || userNumber > 10) { // Überprüfen, ob die Zahl im gültigen Bereich liegt
                System.out.println("Ungültige Eingabe. Eine Zahl soll zwischen 1 und 10 (einschließlich) sein.");  // Wenn die Zahl nicht zw. 1 und 10 ist, Fehlermeldung ausgeben
            } else {
                // Die Zahl ist gültig, daher wird das entsprechende englische Wort zugewiesen
                switch (userNumber) {
                    case 1:
                        englishWord = "one";
                        break;
                    case 2:
                        englishWord = "two";
                        break;
                    case 3:
                        englishWord = "three";
                        break;
                    case 4:
                        englishWord = "four";
                        break;
                    case 5:
                        englishWord = "five";
                        break;
                    case 6:
                        englishWord = "six";
                        break;
                    case 7:
                        englishWord = "seven";
                        break;
                    case 8:
                        englishWord = "eight";
                        break;
                    case 9:
                        englishWord = "nine";
                        break;
                    case 10:
                        englishWord = "ten";
                        break;
                }
                // Ausgabe: Die gültige Eingabe und das entsprechende englische Wort
                System.out.println("Ihre Zahl: " + userNumber);
                System.out.println("Auf englisch: " + englishWord + "\n");
            }
        }
        while (userNumber < 1 || userNumber > 10); //Schleife wiederholen,solange die  Eingabe ungültig war (nicht zwischen 1 und 10)
        // Variante 2
        /*int userNumber;
        boolean validInput = false; // Variable zur Überprüfung, ob die Eingabe gültig ist

        do {
            if (scanner.hasNextInt()) {// Überprüfen, ob die nächste Eingabe eine Ganzzahl ist, scanner hat dafür  hasNextInt()
                userNumber = scanner.nextInt(); // wenn Eingabe eine Zahl ist - Benutzereingabe in userNumber speichern

                if (userNumber >= 1 && userNumber <= 10) { //Überprüfen, ob die eingegebene Zahl zw.1 und 10 ist
                    validInput = true; // Eingabe ist gültig, Schleife geht nicht mehr weiter
                    System.out.println("Ihre Zahl: " + userNumber);
                    String[] englishWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"}; // Array mit 10 englischen Wörtern
                    String englishWord = englishWords[userNumber - 1]; // Das passende englische Wort anhand des Indexes auswählen // -1, weil Arrays bei 0 starten
                    System.out.println("Auf englisch: " + englishWord + "\n"); // Ergebnisausgabe
                } else {
                    System.out.println("Ungültige Eingabe.\nEine Zahl soll zwischen 1 und 10 (einschließlich) sein:"); //Fehlermeldung, wenn eingegebene Zahl  <0 oder >10 ist
                }
            } else {
                System.out.println("Ihre Eingabe ist nicht eine Zahl.\nEs soll eine Zahl zwischen 1 und 10 (einschließlich) sein:");//Fehlermeldung, wenn Input keine Zahl
                scanner.next(); // Ungültige Eingabe löschen, damit die Schleife weiterläuft
            }
        }
        while (!validInput); // Wiederholen, bis eine gültige Eingabe gemacht wurde
        */
    }
    //-----------------------------------------------------------------------------/

    //1.3 Bankomat bedienung
    //Schreiben Sie ein Java-Programm, das Bankkontotransaktionen simuliert. Das
    //Programm sollte den Benutzer auffordern, seinen Kontostand einzugeben, und ihm dann
    //ein Menü mit Optionen für die Durchführung von Transaktionen präsentieren, dieses
    //könnte genauso aussehen

    public static void Bankomat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen! Ich bin ein Pseudo-Geldautomat\n");


        //System.out.println("Ihr Kontostand: " + " Euro\n");
        int userChoice = 0;
        double deposit = 0;
        double withdraw = 0;
        int pin = 123;
        int userInputPIN;
        double balance = 0;


// PIN-Eingabe mit do-while
        do {
            System.out.println("Bitte geben Sie Ihr PIN Code ein: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ungültige Eingabe. Versuchen Sie noch einmal (nur Ziffern):");
                scanner.next();
            }
            userInputPIN = scanner.nextInt();

            if (userInputPIN != pin) {
                System.out.println("Falscher PIN. Versuchen Sie noch einmal:");
            }
        } while (userInputPIN != pin);

        System.out.println("Ihr PIN-Code ist korrekt. \n");

        do {
            System.out.println("Menü: \n1. Einzahlen\n2. Abheben\n3. Kontostand prüfen\n4. Beenden");
            System.out.println("Was möchten Sie tun? Geben Sie die Option in: ");
            userChoice = scanner.nextInt();
            if (userChoice == 1) {
                System.out.println("Wie viel möchten Sie einzahlen: ");
                deposit = scanner.nextDouble();
                System.out.println("Sie haben eingezahlt: " + deposit + " Euro");
                balance += deposit;
            } else if (userChoice == 2) {

                System.out.println("Wie viel Euro möchten Sie abheben?");

                withdraw = scanner.nextDouble();
                if (balance >= withdraw) {
                    System.out.println("Sie haben abgehoben: " + withdraw + " Euro");
                    balance -= withdraw;
                } else {
                    System.out.println("Sie haben nicht genug Geld. Was möchten Sie nun tun? Geben Sie die Option in:");
                }
            } else if (userChoice == 3) {
                System.out.println("Ihr Kontostand: " + balance + " Euro");
            } else if (userChoice == 4) {
                System.out.println("Programm ist beendet");

            } else {
                System.out.println("Ungültige Auswahl. Bitte wählen Sie eine Zahl zwischen 1 und 4.");

            }
        } while (userChoice != 4);
    }
}
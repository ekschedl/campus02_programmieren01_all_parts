package Part_02;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class MainME {
    public static void main(String[] args) {

        //FibonacciZahlen();
        //Fibonacci_Gerzic();

        //UngeradeZahlen();
        //UngeradeZahlen_Gerzic();

        //Turmrechnen();
        //Turmrechnen1();

        //UserLogin();
        //UserLogin_herzic();

        //Password_herzic()
        //PrintSterneReihe();
        //SummeZahlenVonZahl();


        /*--------etxras---------*/
        //ErsteWhileSchleife();
        //ZahlenGeradeundRueckwaerts();
        //Schachbrett();
        //Lift();
    }

    // 1. FibonacciZahlen
    // Beispiel für die Zahlenfolge: 0, 1, 1, 2, 3, 5, 8, 13, 21, …
    //Erklärung: 0 und 1 = 1 | 1 und 1 = 2 | 2 und 1 = 3 | 3 und 2 = 5 | 5 und 3 = 8 | …
    //Ihre Aufgabe in diesem Übungsbeispiel ist es, die ersten 20 Zahlen,
    public static void FibonacciZahlen() {
        int numberOfNumbers = 20;
        int[] arrayOfNumbers = new int[numberOfNumbers];
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 1;
        System.out.print(arrayOfNumbers[0] + " " + arrayOfNumbers[1] + " ");

        for (int i = 2; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = arrayOfNumbers[i - 1] + arrayOfNumbers[i - 2];
            System.out.print(arrayOfNumbers[i] + " ");
        }


    }

    //von Herrn Gerzic
    public static void Fibonacci_Gerzic() {
        System.out.print("_______________________________________\n");
        //wir Deklarieren und Initialisieren mal die ersten Variablen
        int davor = 0;
        int aktuell = 1;
        for (int i = 0; i < 20; i++) {
            //Hier geben wir immer die aktuelle Zahl aus
            System.out.print(aktuell + " ");
            //es ist OK die Variable naechste hier zu deklarieren, da sie nur
            //innerhalb der Schleife verwendet wird
            //Nun werden davor und aktuell als Summe in naechste verspeichert
            int naechste = davor + aktuell;
            //die Variable davor uebernimmt den Wert von aktuell
            davor = aktuell;
            //und aktuell uebernimmt die Summe der beiden also naechste
            aktuell = naechste;
        }
    }

    /*------------------------------------------------------------------*/

    //2. UngeradeZahlen
    // Schreiben Sie ein Java-Programm, das den Benutzer auffordert, eine positive ganze Zahl
    //einzugeben, und dann alle ungeraden Zahlen von 1 bis zu dieser ganzen Zahl in der
    //Konsole ausgibt.
    public static void UngeradeZahlen() {
        //Erstellen Scanner für eine Eingabe von User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich bin Ihr UngeradeZahlenAusgeber.");

        //Erstellen loop, damit immer die wiederholte Eingabeaufforderung kommt,
        // dabei wird es kontrolliert, ob User eine Z1ahl eingegeben hat (mithilfe scanner.hasNextInt())
        while (true) {
            System.out.println("\nGeben Sie bitte eine positive ganze Zahl oder '0' zum Beenden ein: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Ungültige Eingabe.");
                scanner.next(); // die falsche Eingabe überspringen /Scanner Puffer leeren
            }
            int userInput = scanner.nextInt();

            if (userInput < 0) {
                System.out.println("Ungültige Eingabe.");
                continue; //die restlichen Anweisungen übersprungen werden, die Schleife springt direkt zur nächsten Eingabeaufforderung
            } else if (userInput == 0) {
                System.out.println("Sie haben '0' zum Beenden eingegeben. Auf Wiedersehen.");
                break; //User wollte beenden
            }
            System.out.print("Ungerade Zahlen von " + userInput + ": ");
            for (int i = 1; i <= userInput; i++) {
                if (i % 2 == 1) { //Ist die Zahl ungerade? -> gibt es Rest nach dem die Zahl durch 2 dividieren? wenn ja, dann ausgeben
                    System.out.print(i + " ");
                }
            }
        }
    }

    //von Herrn Gerzic
    public static void UngeradeZahlen_Gerzic() {
        //Benutzereingabe aus der Konsole einlesen
        Scanner input = new Scanner(System.in);
        System.out.print("Bitte eine positive ganze Zahl eingeben: ");
        int eingabe = input.nextInt();
        for (int i = 1; i <= eingabe; i++) {
            //Ist die Zahl ungerade? -> hier das != 0 verwenden anstatt dem == ;)
            if (i % 2 != 0) {
                //Falls ungerade, nur dann ausgeben und ein Leerzeichcen
                //dazu, damit die naechste Zahl gleich daneben
                // hinkommt da wir hier ein print nutzen -> ein println waere
                //natuerlich ebenfalls richtig
                System.out.print(i + " ");
            }
        }
    }

    /*------------------------------------------------------------------*/

    //3. Turmrechnung
    // Erstellen Sie die Turmrechnung einmal mittels For-Schleife und ein weiteres Mal mittels
    //While-Schleife. Sodass sie dieselbe Ausgabe mit beiden Schleifen schaffen. Diese
    //Übung gilt erst als Erfolgreich, wenn Sie beide Varianten geschafft haben.

    public static void Turmrechnen() {
        Scanner scanner = new Scanner(System.in); // Scanner-Objekt zum Einlesen der Benutzereingabe
        System.out.println("Ich bin Ihr Turmrechner.\nGeben Sie bitte eine ganze Zahl ein: ");
        int userInput = scanner.nextInt();


        //------------------------For-Schleife------
        System.out.println(" ----- For - Schleife / --------");
        System.out.println("Berechnung:");
        System.out.println(userInput); // Anfangswert ausgeben

        // Multiplikationsteil: Zahl wird mit 2 bis 9 multipliziert
        for (int i = 2; i < 10; i++) {// Solange i kleiner als 10 ist, wird multipliziert
            System.out.println(userInput + " * " + i + " = " + (userInput * i));
            userInput *= i;
        }

        // Divisionsteil: Die Zahl wird durch 2 bis 9 dividiert
        for (int i = 2; i < 10; i++) {
            System.out.println(userInput + " / " + i + " = " + (userInput / i));
            userInput /= i;
        }
        System.out.println(userInput);


        //------------------------While - Schleife-----------
        System.out.println(" ----- While - Schleife / --------");
        System.out.println("Berechnung:");
        System.out.println(userInput); // Erste Zahl ausgeben
        // Multiplikation von 2 bis 9
        int i = 2;
        while (i < 10) {
            System.out.println(userInput + " * " + i + " = " + (userInput * i));
            userInput *= i;
            i++;
        }
        // Division von 2 bis 9
        i = 2;
        while (i < 10) {
            System.out.println(userInput + " / " + i + " = " + (userInput / i));
            userInput /= i;
            i++;
        }
        // Endwert ausgeben
        System.out.println(userInput);
    }

    // von Herrn Gerzic
    public static void RechenturmFor_Gerzic() {
        //Variablen deklarieren und erstmals initialisieren
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte eine Zahl fuer den Turm eingeben: ");
        int zahl = eingabe.nextInt();
        long result = 0;
        long resultb = 0;
        for (int j = 0; j <= 1; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 0 && j == 0) {
                    System.out.println(zahl);
                    result = zahl;
                } else if (j == 0 && i != 1) {
                    resultb = result;
                    result = result * i;
                    System.out.println(resultb + " * " + i + " = " + result);
                } else if (i != 0 && i != 1) {
                    resultb = result;
                    result = result / i;
                    System.out.println(resultb + " / " + i + " = " + result);
                }
            }
        }
    }

    //von Herrn Gerzic
    public static void RechenturmWhile_Gerzic() {
        //Variablen deklarieren und erstmals initialisieren
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte eine Zahl für den Turm eingeben: ");
        int zahl = eingabe.nextInt();
        long result = 0;
        long resultb = 0;
        int j = 0;
        int i = 0;
        while (j <= 1) {
            i = 0;
            while (i < 10) {
                if (i == 0 && j == 0) {
                    System.out.println(zahl);
                    result = zahl;
                } else if (j == 0 && i != 1) {
                    resultb = result;
                    result = result * i;
                    System.out.println(resultb + " * " + i + " = " + result);
                } else if (i != 0 && i != 1) {
                    resultb = result;
                    result = result / i;
                    System.out.println(resultb + " / " + i + " = " + result);
                }


            }

        }


    }

    /*------------------------------------------------------------------*/

    /*4. Userlogin
    Schreiben Sie ein Java-Programm, das den Benutzer auffordert, einen Benutzernamen
    und ein Kennwort einzugeben. Das Programm sollte den Benutzer wiederholt zur
    Eingabe eines Benutzernamens und eines Passworts aufzufordern, bis ein korrekter
    Benutzername und ein korrektes Passwort eingegeben werden oder die maximale
    Anzahl der Versuche erreicht ist.
    Der richtige Benutzername ist "user123" und das richtige Passwort ist "password123".
    Wenn der Benutzer falsche Anmeldedaten eingibt, sollte das Programm die Meldung
    "Falscher Benutzername oder falsches Passwort. Bitte versuchen Sie es erneut." Wenn
    die maximale Anzahl von Versuchen erreicht ist, sollte das Programm die Meldung
    "Maximale Anzahl von Versuchen erreicht. Programm beenden." und das Programm
    beenden.*/
    public static void UserLogin() {
        Scanner scanner = new Scanner(System.in);
        String passwordSaved = "123";
        String userNameSaved = "user";
        String userNameInput = "";
        String passwordInput = "";
        int attempts = 3; // Maximale Anzahl an Versuchen

        do {
            System.out.println("Your Username:");
            userNameInput = scanner.next();
            System.out.println("Your password:");
            passwordInput = scanner.next();
            // Überprüfung, ob Benutzername und Passwort korrekt sind
            if (passwordInput.equals(passwordSaved) && userNameInput.equals(userNameSaved)) {
                System.out.println(passwordInput);
                System.out.println(userNameInput);
                System.out.println("Gratulation");
                ; // Erfolgreiche Anmeldung
                return;// Methode verlassen, da Anmeldung erfolgreich war

            } else {
                attempts--; // Einen Versuch abziehen
                if (attempts > 0) {
                    System.out.println("Falscher Benutzername oder Passwort. Versuche verbleibend: " + attempts);
                } else {
                    System.out.println("gesperrt"); // Benutzer nach 3 Fehlversuchen sperren
                }
            }

        } while (attempts > 0); // Schleife läuft, solange Versuche übrig sind
    }

    public static void UserLogin_herzic() {
        //Variablen deklarieren und erstmals initialisieren
        Scanner scanner = new Scanner(System.in);
        String benutzername;
        String passwort;
        int versuche = 0;
        //Hier wurde eine konstante Variable definiert
        final int MAX_VERSUCHE = 3;
        //Hier empfiehlt sich eine Do-While-Schleife, da wir sie einmal
        //durchlaufen muessen bevor wir die Bedingungen pruefen
        do {
            //Benutzername mittels scanner aus der Konsole einlesen und speichern
            System.out.print("Benutzername eingeben: ");
            benutzername = scanner.nextLine();
            //Passwort mittels scanner aus der Konsole einlesen und speichern
            System.out.print("Passwort eingeben: ");
            passwort = scanner.nextLine();
            //Versuche um 1 hochzaehlen
            versuche++;
            //Ich pruefe das zuerst, damit es im Falle einer
            // Versuchsueberschreitung gar nicht erst zur Eingabe der Daten kommt
            if (versuche >= MAX_VERSUCHE) {
                System.out.println("Maximale Anzahl von Versuchen erreicht");
                //Programm wird beendet.");
                //Beendet das ganze Programm mit dem Status 0 System.exit(0);
            }
            //Pruefen ob benutzername ODER passwort FALSCH sind -> Falls
            // eines false zurückgibt springen wir in das IF wegen dem !
            //kurz die nachfolgende Zeile fuer Sie uebersetzt: IF
            //benutzername equals NICHT user123 ODER IF passwort equals NICHT password123 -> dann geh in die IF hinein
            if (!benutzername.equals("user123") || !passwort.equals("password123")) {
                System.out.println("Falscher Benutzername oder falsches Passwort.Bitte erneut versuchen.");
            }
            //Hier beim While ist die gleiche Bedingung wie oben beim IF -
            // falls eines der beiden NICHT passt, dann geh in die Schleife erneut hinein
            //und spring zum do
        } while (!benutzername.equals("user123") ||
                !passwort.equals("password123"));
        System.out.println("Login erfolgreich.");
    }

    /*------------------------------------------------------------------*/

    public static void Password_herzic() {
        Scanner scanner = new Scanner(System.in);
        String pwEingabe;
        String passwort = "geheim"; //ueber Variable

        //Version 1 - die leichteste und kuerzeste
//        do{
//            System.out.println("Bitte das Passwort eingeben: ");
//            pwEingabe = scanner.next();
//        }while(!pwEingabe.equals(passwort));

        //Version 2
        do {
            System.out.println("Bitte das Passwort eingeben: ");
            pwEingabe = scanner.next();

            //Zusatz um User ueber falsche Eingabe zu informieren
            if (!pwEingabe.equals("geheim")) {
                System.out.println("Leider falsch!");
            }
        } while (!pwEingabe.equals("geheim"));


        System.out.printf("Sie sind nun erfolgreich eingeloggt!");
    }

    /*------------------------------------------------------------------*/

    public static void PrintSterneReihe() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte Anzahl der Zeilen eingeben: ");
        int i = in.nextInt();
        int originalI = i; // Speichern den Originalwert von i


        /* Version 1: Aufbau eines ansteigenden Sternenmusters */
        System.out.println("Version 1: Ansteigendes Sternenmuster");
        for (int j = 1; j <= i; j++) {// Äußere Schleife für die Zeilen
            for (int k = 1; k <= j; k++) {// Innere Schleife für die Sterne pro Zeile
                System.out.print("* ");// Stern ausgeben
            }
            System.out.println(" ");// Zeilenumbruch für die nächste Zeile
        }
        System.out.println("--------------------------------------");
        /* Version 2: Aufbau eines absteigenden Sternenmusters */
        // Hier ist die Anzahl der Zeilen immer 5, unabhängig von der Benutzereingabe
        System.out.println("Version 2: Ansteigendes Sternenmuster");
        for (i = 5; i > 0; i--) {// Äußere Schleife zählt rückwärts von 5 bis 1
            for (int j = 5; j >= i; j--) {// Innere Schleife steuert die Anzahl der Sterne
                System.out.print("* ");// Stern ausgeben
            }
            System.out.println(" ");// Zeilenumbruch für die nächste Zeile
        }

        System.out.println("--------------------------------------");
        /* Version 3: Aufbau eines zusteigenden Sternenmusters */
        System.out.println("Version 3: Absteigendes Sternenmuster");
        for (int j = originalI; j > 0; j--) { // Äußere Schleife von i bis 1
            for (int k = 1; k <= j; k++) { // Innere Schleife für die Sterne
                System.out.print("* ");
            }
            System.out.println(); // Zeilenumbruch
        }
    }

    /*------------------------------------------------------------------*/

    public static void SummeZahlenVonZahl() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int zahl = in.nextInt();

        int zahlInitialerWert = zahl;
        int summe = 0;

        //Version 1
        while (zahl > 0) {
            summe = summe + zahl;
            zahl--; //Gleich wie: zahl = zahl - 1;
        }
        System.out.println("V1: Die Summe der Zahlen von 1 bis " + zahlInitialerWert + " ist " + summe);


//        Scanner scanner = new Scanner (System.in);
//        System.out.print ("Geben Sie eine ganze Zahl ein: ");
//        int n = scanner.nextIntO;
//        int i = 1;
//        int sum = 0;
//        while (i <= n) {
//            sum += i; i++;
//            System.out.println("Die Summe der Zahlen von 1 bis " + n +" ist " + sum + ".");
//

        //Version 2
        int i = 0;
        summe = 0; //Zuruecksetzen der Summe auf 0
        while (i <= zahlInitialerWert) {
            summe = summe + i;
            i++;
        }
        System.out.println("V2: Die Summe der Zahlen von 1 bis " + zahlInitialerWert + " ist " + summe);

        //Version 3
        summe = 0; //Zuruecksetzen der Summe auf 0
        zahl = zahlInitialerWert; //Zuruecksetzen der initialen Zahl
        while (true) {
            summe = summe + zahl;
            zahl--;
            if (zahl == 0) {
                break;
            }
        }
        System.out.println("V3: Die Summe der Zahlen von 1 bis " + zahlInitialerWert + " ist " + summe);
    }

    public static void ErsteWhileSchleife() {
        int i = 1;
        while (i <= 1000) {  //
            System.out.println("Runde: " + i);
            i = i + i;
        }
    }

    public static void ZahlenGeradeundRueckwaerts() {
        //Aufgabe 2 - Version 2
        for (int i = 0; i <= 30; i += 2) {
            System.out.println(i);
        }

        //Aufgabe Zusatz - zahlen Rueckwaerts ausgeben
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void Schachbrett() {
        // Äußere Schleife für die Zeilen (Höhe des Schachbretts)
        for (int i = 1; i <= 8; i++) {
            // Innere Schleife für die Spalten (Breite des Schachbretts)
            for (int j = 1; j <= 8; j++) {
                // Überprüfung, ob die aktuelle Zeile gerade ist
                if (i % 2 == 0) {
                    // Falls die Zeile gerade ist, prüfen ob die Spalte auch gerade ist
                    if (j % 2 == 0) {
                        System.out.print("0 "); // Falls ja, eine "0" ausgeben
                    } else {
                        System.out.print("1 "); // Falls nicht, eine "1" ausgeben
                    }
                } else { // Falls die Zeile ungerade ist
                    // Prüfen, ob die Spalte ungerade ist
                    if (j % 2 != 0) {
                        System.out.print("0 "); // Falls ja, eine "0" ausgeben
                    } else {
                        System.out.print("1 "); // Falls nicht, eine "1" ausgeben
                    }
                }
            }
            System.out.println(); // Zeilenumbruch für die nächste Zeile
        }
    }

//    public static void Lift() {
//        boolean isHaus = false;
//        for (int i = 1; i <= 68; i++) ;
//        if (i == 10 || i == 19)
//            continue;
//        System.out.println(" Etage if (isHaus==true && i==4)
//        break;
//        1 ==
//                28
//        1 == 36
//        11 1 == 55)1
//        "+i);
//    }

}

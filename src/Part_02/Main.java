package Part_02;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //FibonacciZahlen();
        //FibonacciZahlen2();
        //Fibonacci_Gerzic();
        //UngeradeZahlen();
        //UngeradeZahlen_Gerzic();

        //Turmrechnen();
        //Turmrechnen1();
        UserLogin();
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

    //meine einfach üben
    public static void FibonacciZahlen2() {
        System.out.print("_______________________________________\n");
        int vorher = 0;
        int aktuell = 1;
        for (int i = 0; i < 20; i++) {
            System.out.print(aktuell + "m ");
            int next = vorher + aktuell;
            vorher = aktuell;
            aktuell = next;
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

    //3. Turmrechnung
    // Erstellen Sie die Turmrechnung einmal mittels For-Schleife und ein weiteres Mal mittels
    //While-Schleife. Sodass sie dieselbe Ausgabe mit beiden Schleifen schaffen. Diese
    //Übung gilt erst als Erfolgreich, wenn Sie beide Varianten geschafft haben.

    public static void Turmrechnen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ich bin Ihr Turmrechner.\nGeben Sie bitte eine ganze Zahl ein: ");
        int userInput = scanner.nextInt();
        int resultat = userInput;

        //------------------------For-Schleife------------------------------
        System.out.println(" ----- For - Schleife / -----------------------");
        System.out.println("Berechnung:");
        System.out.println(resultat);

        // Multiplikationsteil
        for (int i = 2; i <= 9; i++) {
            System.out.println(resultat + " * " + i + " = " + (resultat * i));
            resultat *= i;
        }

        // Divisionsteil
        for (int i = 2; i <= 9; i++) {
            System.out.println(resultat + " / " + i + " = " + (resultat / i));
            resultat /= i;
        }
        System.out.println(resultat);


        //------------------------While - Schleife----------------------------
        System.out.println(" ----- While-Schleife / meine Variante 1 ----- ");
        System.out.println("Berechnung:");
        System.out.println(resultat); // Erste Zahl ausgeben
        // Multiplikation von 2 bis 9
        int i = 2;
        while (i <= 9) {
            System.out.println(resultat + " * " + i + " = " + (resultat * i));
            resultat *= i;
            i++;
        }
        // Division von 2 bis 9
        i = 2;
        while (i <= 9) {
            System.out.println(resultat + " / " + i + " = " + (resultat / i));
            resultat /= i;
            i++;
        }
        // Endwert ausgeben
        System.out.println(resultat);
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
        int attempts = 3;

        do {
            System.out.println("Your Username:");
            userNameInput = scanner.next();
            System.out.println("Your password:");
            passwordInput = scanner.next();

                if (passwordInput.equals(passwordSaved) && userNameInput.equals(userNameSaved)) {
                    System.out.println(passwordInput);
                    System.out.println(userNameInput);
                    System.out.println("Gratulation");
                    return;

                } else {
                    attempts--; // Einen Versuch abziehen
                    if (attempts > 0) {
                        System.out.println("Falscher Benutzername oder Passwort. Versuche verbleibend: " + attempts);
                    } else {
                        System.out.println("gesperrrt");
                    }
                }

        }
        while (attempts > 0);

    }
}

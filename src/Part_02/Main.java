import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ErsteWhileSchleife();
        //Uebung01();
        //Uebung02();
        Uebung03();
        //Uebung04();
    }

    public static void Uebung04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte Anzahl der Zeilen eingeben: ");
        int i = in.nextInt();

        //Version 1
        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //Version 2
        for (i = 5; i > 0; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void Uebung03() {
        //Aufgabe 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Aufgabe 2 - Version 1
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Aufgabe 2 - Version 2
        for (int i = 0; i <= 30; i += 2) {
            System.out.println(i);
        }

        //Aufgabe Zusatz - zahlen Rueckwaerts ausgeben
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

    }

    public static void Uebung02() {
        Scanner in = new Scanner(System.in);
        String pwEingabe;
        String passwort = "geheim"; //ueber Variable

        //Version 1 - die leichteste und kuerzeste
//        do{
//            System.out.println("Bitte das Passwort eingeben: ");
//            pwEingabe = in.next();
//        }while(!pwEingabe.equals(passwort));

        //Version 2
        do {
            System.out.println("Bitte das Passwort eingeben: ");
            pwEingabe = in.next();

            //Zusatz um User ueber falsche Eingabe zu informieren
            if (!pwEingabe.equals("geheim")) {
                System.out.println("Leider falsch!");
            }
        } while (!pwEingabe.equals("geheim"));


        System.out.printf("Sie sind nun erfolgreich eingeloggt!");
    }

    public static void Uebung01() {
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
        while (true) {
            System.out.println("Runde: " + i);
            if (i == 1000) {
                break;
            }
            i = i + i;
        }
    }
}
package JavaLessonsAmCampus;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //StringsVergleichen();
        //UebungPolizei();

        //SparAktion();
        //DaysInMonth();
        //DaysInMonthIfElse();

        //Schleife();
        //SummeOfNumber();
        //Password();
        //Schleife10();
        //Schleife30();

        //Sterne();
        //SterneInCampus();

        //Lift();
        //Lift_herzic();

        //Flug();
        //Flug_herzic();
        //WortSuchen();
        //WortSuchen_herzic();

    }

    public static void StringsVergleichen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Satz ein");
        String userSatz = scanner.next();
        if (userSatz.equals("One")) {
            System.out.println("Ihr Text ist 'One'");
        } else {
            System.out.println("Ihr Text ist " + "'" + userSatz + "'");
        }

    }

    public static void UebungPolizei() {
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte geben Sie ihr Tempo ein:");
        int tempo = eingabe.nextInt();
        int ortTempo = 50;

        System.out.println("Bitte geben Sie Alkopegel ein:");
        float alkoGrad = eingabe.nextFloat();

        System.out.println("Bitte geben Sie einen Monat ein:");
        String monat = eingabe.next();

        int strafeTempo;
        int strafeAlko;
        if (tempo > ortTempo) {
            int diffTempo = tempo - ortTempo;
            if (diffTempo > 100) {
                System.out.println(diffTempo + " - Ihre Überschreitung! Strafe:" + " 1500 Euro");
                strafeTempo = 1500;
            } else if (diffTempo >= 51) {
                System.out.println(diffTempo + " - Ihre Überschreitung! Strafe:" + " 500 Euro");
                strafeTempo = 500;
            } else if (diffTempo >= 31) {
                System.out.println(diffTempo + " - Ihre Überschreitung! Strafe:" + " 100 Euro");
                strafeTempo = 100;
            } else if (diffTempo >= 21) {
                System.out.println(diffTempo + " - Ihre Überschreitung! Strafe:" + " 50 Euro");
                strafeTempo = 50;
            } else if (diffTempo >= 11) {
                System.out.println(diffTempo + " - Ihre Überschreitung! Strafe:" + " 30 Euro");
                strafeTempo = 30;
            } else {
                System.out.println("Schrifltliche Vorwahnung");
                strafeTempo = 0;
            }
        } else {
            System.out.println("Keine Überschreitung");
            strafeTempo = 0;
        }

        if (alkoGrad > 2.0) {
            System.out.println("Sehr sehr Betrunken! Ihre Strafe:" + " 2500 Euro");
            strafeAlko = 2500;
        } else if (alkoGrad >= 1.1) {
            System.out.println("Sehr Betrunken! Ihre Strafe:" + " 100 Euro");
            strafeAlko = 100;
        } else if (alkoGrad >= 0.6) {
            System.out.println("Betrunken! Ihre Strafe:" + " 50 Euro");
            strafeAlko = 50;
        } else {
            System.out.println("Alles in Ordung");
            strafeAlko = 0;
        }

        double strafe = strafeAlko + strafeTempo;

        switch (monat) {
            case "Montag":
            case "Februar": {
                System.out.println("Keine Rabatte möglich");
                break;
            }
            case "Maerz":
            case "April": {
                strafe = 0.9 * strafe;
                break;
            }
            case "Mai":
            case "Juni": {
                strafe = 0.85 * strafe;
                break;
            }
            case "Juli":
            case "August": {
                strafe = 0.8 * strafe;
                break;
            }
            case "September":
            case "Oktober": {
                strafe = 0.75 * strafe;
                break;
            }
            case "November":
            case "Dezember": {
                strafe = 0.7 * strafe;
                break;
            }
            /*default:
                System.out.pr1intln("Systemfehler");*/
        }
        double endbetrag = strafe;
        System.out.println("Strafe total: " + endbetrag + " Euro");


    }

    public static void SparAktion() {
        int einkauf = 100;
        String tag = "Montag";

        switch (tag) {
            case "Montag":
            case "Dienstag": {
                einkauf -= (10 * einkauf) / 100;
                break;
            }
            case "Mittwoch":
            case "Donnerstag": {
                einkauf -= (15 * einkauf) / 100;
                break;
            }
            case "Freitag":
            case "Samstag": {
                einkauf -= (20 * einkauf) / 100;
                break;
            }
        }
        System.out.println(einkauf);
    }

    public static void DaysInMonth() {
        System.out.println("Bitte geben Sie einen Monat ein:");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();

        switch (month.toLowerCase()) {
            case "jaenner":
            case "maerz":
            case "mai":
            case "juli":
            case "august":
            case "oktober":
            case "dezember":
                System.out.println(month + " hat 31 Tage");
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                System.out.println(month + " hat 30 Tage");
                break;
            default:
                System.out.println("Systemfehler");
        }
    }

    public static void DaysInMonthIfElse() {
        boolean userBoolean = true;
        while (userBoolean) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter one month please:");
            String userMonth = scanner.next().toLowerCase();
            String formattedUserMonth = Character.toUpperCase(userMonth.charAt(0)) + userMonth.substring(1);

            if (userMonth.equals("jaenner") || userMonth.equals("maerz") || userMonth.equals("mai") || userMonth.equals("juli") || userMonth.equals("august") || userMonth.equals("oktober") || userMonth.equals("dezember")) {
                System.out.println(formattedUserMonth + " has 31 Days");
            } else if (userMonth.equals("april") || userMonth.equals("juni") || userMonth.equals("september") || userMonth.equals("november")) {
                System.out.println(formattedUserMonth + " has 31 Days");
            } else if (userMonth.equals("februar")) {
                System.out.println(formattedUserMonth + " has 28 days");
            } else {
                System.out.println("Systemfehler");
            }

            System.out.println(" 1: if you would you like enter other month, 2: exit");
            int userAnswer = scanner.nextInt();
            if (userAnswer == 1) {
                userBoolean = true;
            } else {
                userBoolean = false;
            }
        }
    }

    public static void Schleife() {

        int i = 1;
        while (i <= 10) {
            System.out.println("Runde: " + i);
            if (i == 3) {
                break;
            }
            i++;
        }


    }

    public static void SummeOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number: ");
        int userNumber = scanner.nextInt();
        int summe = 0;

        while (userNumber > 0) {
            summe += userNumber;
            userNumber--;
        }
        System.out.println("Die Summe der Zahlen ist: " + summe);

    }

    public static void Password() {

        Scanner scanner = new Scanner(System.in);
        String userPassword;

        do {
            System.out.println("Enter your password: ");
            userPassword = scanner.next();

        } while (!userPassword.equals("geheim"));  // ich weiß nicht wie lange es läuft, for - ich weiß
        System.out.println("Gratuliere, du bist drinnen!");
    }

    public static void Schleife10() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
        for (int i = 10; i >= 0; i--)
            System.out.println("-" + i);

    }

    public static void Schleife30() {
        for (int i = 1; i <= 30; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }

    public static void Sterne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl :");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("-* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void SterneInCampus() {
        for (int i = 1; i <= 3; i++) { //bestimmt die Zeile /Höhe
            for (int j = 1; j <= 3; j++) { // bestimmt die Spalten /Breite
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("- * ");
            }
            System.out.println();
        }
        //Schachbrett
        for (int i = 1; i <= 8; i++) { //bestimmt die Zeile /Höhe
            for (int j = 1; j <= 8; j++) { // bestimmt die Spalten /Breite
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println(); // Nach jeder Zeile eine neue Zeile beginnen
        }


    }

    public static void Lift() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreibe 1, wenn du in einem Haus bist, \n Schreibe 2; wenn du in einem Wolkenkratzer bist");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            for (int i = 1; i <= 4; i++) {

                System.out.println("Etage " + i);
            }
        } else {
            for (int i = 1; i <= 68; i++) {
                if (i == 10 || i == 19 || i == 28 || i == 36) {
                    continue;
                } else {
                    System.out.println("Etage " + i);
                }
            }


        }
    }

    public static void Lift_herzic() {
        boolean isHaus = false; // Setze dies auf "true", wenn du in einem Haus bist
        for (int i = 1; i <= 68; i++) {
            if (i == 10 || i == 19 || i == 28 || i == 36 || i == 55) {
                continue; // überspringe bestimmte Etagen
            }

            System.out.println("Etage " + i);

            // Wenn es sich um ein Haus handelt, und die Etage 4 erreicht ist, stoppe die Schleife
            if (isHaus && i == 4) {
                break;
            }
        }
    }

    public static void Flug() {   // in der Folie und Fotos  schöneer Variante mit NUR eine Schleife schauen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wählen Sie bitte aus: \n1 - A380? \n2 - ein anderes Flugzeug? ");
        int userChoice = scanner.nextInt();
        if (userChoice == 2) {
            for (int i = 1; i <= 50; i++)
                if (i == 13 || i == 17) {
                    continue;
                } else {
                    System.out.println("Reihe " + i);
                }
        } else {
            for (int i = 1; i <= 18; i++) {
                System.out.println("Reihe " + i);
            }
        }

    }

    public static void Flug_herzic() {
        boolean isA380 = true; // Setzen Sie dies auf "false", wenn es sich nicht um ein A380-Flugzeug handelt
        for (int i = 1; i <= 50; i++) {
            if (i == 13 || i == 17) {
                continue; // überspringe die Reihen 13 und 17
            }
            System.out.println("Reihe " + i);
            if (!isA380 && i == 19) {
                break; // beende die Schleife bei 19 für Micht-A380-FLugzeuge
            }
        }
    }

    public static void WortSuchen() throws IOException {


        File file = new File("/Users/kaaatkina//CAMPUS02_2025/faust.txt"); //command + option+ c und dann command + v);

        Scanner input = new Scanner(file);


        int counter = 0;
        System.out.println("Gebens SIe bitte das gesuchte Wort ein: ");
        Scanner scanner = new Scanner(System.in);
        String gesuchtesWort = scanner.next().toLowerCase();

        while (input.hasNext()) {
            String wort = input.next().toLowerCase();
            if (wort.equals(gesuchtesWort)) {
                counter++;
            }
        }
        System.out.println("Das Wort " + gesuchtesWort + "wurde  " + counter + " Mals gefunden");

    }

    public static void WortSuchen_herzic() throws IOException {
        //NUR DEN READ zur TXT-Datei, welche wir unten brauchen, in die String-Variable namens file speichern
        String file = "/Users/kaaatkina//CAMPUS02_2025/faust.txt";
        //Mittels Scanner und der Option "Paths.get(PFAD)" den Inhalt der dort befindlichen Datei auslesen
        Scanner BuchText = new Scanner(Paths.get(file));
        //Counter fuer die zu zaehlenden Woerter anlegen
        int countWort = 0;
        //Benutzer fragen, welches Wort er/sie gerne gezaehlt haben moechte
        System.out.println("Geben Sie bitte das Wort ein, welches gezaehlt werden soll (Gross- & Kleinschreibung ist egal): ");
        //Eigenen System. in Scanner erstellen um die Eingabe auf der Konsole abzufangen und zu speichern
        Scanner scanner = new Scanner(System.in);
        String gesuchtesWort = scanner.next(); //Die Benutzereingabe von der Konsole in die Variable gesuchtesWord speichern
        gesuchtesWort = gesuchtesWort.toLowerCase(); //Damit Benutzer nicht daran denken muss wie er es schreibt
        //Einfache While-Schleife, die solange durchlaufen wind, solange es etwas auszulesen gibt
        while (BuchText.hasNext()) {
            //Das einzelne naechste Wort auslesen -> Daher next) und nicht nextLine() !
            String word = BuchText.next();
            //Das Wort Klein schreiben lassen, damit wir nicht auf Gross- und Kleinschreibung achten muessen
            word = word.toLowerCase();
            //Mittels einer einfachen IF-Anweisung evaluienen ob es eins der gesuchten Woenter ist und den Counter um 1 enhoehen falls True
            if (word.equals(gesuchtesWort)) {
                countWort++;
            }
            //System.out.println(word+" *); //OPTIONAL: Den gesamten Text der Datei in die Konsole ausgeben
            //Finale Ausgabe der gezaehlten Ergebnisse
        }
        System.out.println("Das Wort '" + gesuchtesWort + "' wurde: " + countWort + " mal in diesem Dokument gefunden.");

    }

}
















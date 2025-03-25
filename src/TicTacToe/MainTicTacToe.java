package TicTacToe;

import java.util.Scanner;

public class MainTicTacToe {
    public static void main(String[] args) {
        Spiel();
    }

    public static void FeldErstellen(String[][] feld) {
        for (String[] row : feld) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    public static void Spiel() {
        String[][] feld = new String[3][3];
        boolean spielOn = true;
        boolean spielerX = true; // True = X, False = O
        String spielZeichen = "";

        // Variable für die Koordinaten
        int x = 0;
        int y = 0;

        // Befüllen Feld
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                feld[i][j] = " - ";
            }
        }

        // Feld Ausgeben
        FeldErstellen(feld);

        while (spielOn) {
            // Aktuellen Spieler bestimmen
            if (spielerX) {
                spielZeichen = "X";
            } else {
                spielZeichen = "O";
            }
            // Eingabeaufforderung für Spieler X oder O, je nach "spielZeichen"
            System.out.println("Spieler " + spielZeichen + ", bitte geben Sie Ihren Zug ein.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie eine Zahl 'x' für Ihren Schritt ein: ");
            x = scanner.nextInt();
            System.out.println("Geben Sie eine Zahl 'y' für Ihren Schritt ein: ");
            y = scanner.nextInt();

            if (x >= 0 && x <= 2 && y >= 0 && y <= 2) { // überprüfen Zahlen 0 bis 2
                if (feld[x][y].equals(" - ")) { // Überprüfen ob frei, also " - " ist
                    feld[x][y] = " " + spielZeichen + " "; // wenn frei-spielZeichen setzen
                    // Feld neue Ausgabe
                    FeldErstellen(feld);
                    // Spieler wechseln
                    spielerX = !spielerX;

                    // Überprüfen Gewinn
                    for (int i = 0; i < 3; i++) {
                        // Horizontale
                        if ((feld[i][0].equals(" " + spielZeichen + " ") &&
                                feld[i][1].equals(" " + spielZeichen + " ") &&
                                feld[i][2].equals(" " + spielZeichen + " ")) ||
                                // Vertikale
                                (feld[0][i].equals(" " + spielZeichen + " ") &&
                                        feld[1][i].equals(" " + spielZeichen + " ") &&
                                        feld[2][i].equals(" " + spielZeichen + " "))) {
                            System.out.println("-- G-E-W-I-N-N! -- ");

                            System.out.println(" Spieler " + spielZeichen + " hat gewonnen!");
                            spielOn = false;
                            break;
                        }
                    }

                    // Diagonale Überprüfung
                    // Hauptdiagonale
                    if ((feld[0][0].equals(" " + spielZeichen + " ") &&
                            feld[1][1].equals(" " + spielZeichen + " ") &&
                            feld[2][2].equals(" " + spielZeichen + " ")) ||
                            // Nebendiagonale
                            (feld[0][2].equals(" " + spielZeichen + " ") &&
                                    feld[1][1].equals(" " + spielZeichen + " ") &&
                                    feld[2][0].equals(" " + spielZeichen + " "))) {
                        System.out.println("-- G-E-W-I-N-N! -- ");
                        System.out.println("Spieler " + spielZeichen + " hat gewonnen!");
                        spielOn = false;
                    }

                } else { // wenn Feld nicht frei ist
                    System.out.println("Feld ist bereits besetzt, geben Sie eine andere Zahl ein");
                }
            } else { // wenn ungültige Eingabe ist
                System.out.println("ungültige Eingabe. Bitte Zahlen von 0 bis 2");
            }
        }
    }
}
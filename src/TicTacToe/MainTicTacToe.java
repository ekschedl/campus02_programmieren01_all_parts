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
        Scanner scanner = new Scanner(System.in);
        String[][] feld = new String[3][3];
        boolean spielerX = true; // True = X, False = O
        String spielZeichen = "";
        int zugCounter = 0;

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

        while (true) {
            // Aktuellen Spieler bestimmen
            if (spielerX) {
                spielZeichen = "X";
            } else {
                spielZeichen = "O";
            }

            // Eingabe-Schleife für gültige Koordinaten
            while (true) {
                System.out.println("Spieler " + spielZeichen + ", geben Sie Ihre Koordinaten (x y) ein: ");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
                if (x >= 0 && x < 3 && y >= 0 && y < 3) {
                    if (feld[x][y].equals(" - ")) {
                        break; // gültige Eingabe
                    } else {
                        System.out.println("Feld ist bereits besetzt, bitte wählen Sie ein anderes Feld.");
                    }
                } else {
                    System.out.println("Ungültige Eingabe. Bitte Zahlen von 1 bis 3 verwenden.");
                }
            }

            // Zeichen setzen und Spielfeld ausgeben
            feld[x][y] = " " + spielZeichen + " "; // wenn frei-spielZeichen setzen
            // Feld neue Ausgabe
            FeldErstellen(feld);

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
                    return;
                }
            }

            // Diagonale Überprüfung
            if ((feld[0][0].equals(" " + spielZeichen + " ") &&
                    feld[1][1].equals(" " + spielZeichen + " ") &&
                    feld[2][2].equals(" " + spielZeichen + " ")) ||
                    (feld[0][2].equals(" " + spielZeichen + " ") &&
                            feld[1][1].equals(" " + spielZeichen + " ") &&
                            feld[2][0].equals(" " + spielZeichen + " "))) {
                System.out.println("-- G-E-W-I-N-N! -- ");
                System.out.println("Spieler " + spielZeichen + " hat gewonnen!");
                return;

            }

            zugCounter++;// Züge Counter erhöhen
            //check Unentschieden

            if (zugCounter == 9) {
                FeldErstellen(feld);
                System.out.println("Keiner hat gewonnen");
                return; // Spiel endet
            }
            // Spieler wechseln
            spielerX = !spielerX;
        }
    }
}

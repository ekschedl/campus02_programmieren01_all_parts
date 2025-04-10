import java.util.Scanner;

public class VorPruefung_Angabe03_TicTacToe {
    //Spielfeld initialisieren
    static char[][] field = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        //Sie koennen Ihren Code hier reinschreiben oder eigene Methoden erzeugen, bleibt Ihnen ueberlassen
        spielen();
    }

    //Feld aufzeichnen
    private static void displayField() {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void spielen() {
        Scanner scanner = new Scanner(System.in);
        boolean spielerX = true; // True = Spieler X, False = Spieler O
        int zugCounter = 0; // Zähler für gespielten Züge

        while (true) { // Endlosschleife für das Spiel, läuft solange
            // bis das Spiel durch einen Sieg oder ein Unentschieden endet
            while (true) {
                displayField();  //Feld aufzeichnen
                if (spielerX) { //Wenn spielerX = true  wird Player X, in der Konsole ausgegeben
                    System.out.println("Player X, ");
                } else {
                    System.out.println("Player O, ");// else - also wenn spielerX nicht true ist- wird Player Y, in der Konsole ausgegeben
                }

                System.out.print("Enter number for row (1-3): "); //Eingabeaufforderung
                int x = scanner.nextInt() - 1; //Zahl für Koordinate x speichern, (Minus 1, weil die Indizes bei 0 beginnen)
                System.out.print("Enter number for column (1-3): "); //Eingabeaufforderung
                int y = scanner.nextInt() - 1; //Zahl für Koordinate y speichern, (Minus 1, weil die Indizes bei 0 beginnen)

                //checken ob die Eingabe gültig ist
                if (x < 0 || x > 2 || y < 0 || y > 2) {
                    System.out.println("Invalid entry! Please enter a number between 1 and 3");
                    continue; // zur nächsten Eingabeaufforderung
                }

                // checken ob das Feld frei
                if (field[x][y] != ' ') {
                    System.out.println("Cell is already filled! Please try again");
                    continue;
                }

                if (spielerX) {
                    field[x][y] = 'X';  //Wenn Spieler X Zug hat- wird X gesetzt
                } else {
                    field[x][y] = 'O'; //Sonst wird O gesetzt
                }

                zugCounter++;// Züge Counter erhöhen

                //Check Gewinner, for-Schleife überprüft  3 Reihen und  3 Spalten
                for (int i = 0; i < 3; i++) {
                    // check win bei Zeilen horizontal
                    if (field[i][0] != ' ' && field[i][0] == field[i][1] && field[i][1] == field[i][2]) {
                        displayField();
                        System.out.println("Player " + field[i][0] + " wins!");
                        return; // Spiel endet
                    }
                    // check ein bei Spalten vertikal
                    if (field[0][i] != ' ' && field[0][i] == field[1][i] && field[1][i] == field[2][i]) {
                        displayField();
                        System.out.println("Player " + field[0][i] + " wins!");
                        return; // Spiel endet
                    }
                }
                // check win bei 2 Diagonalen
                if (field[0][0] != ' ' && field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
                    displayField();
                    System.out.println("Player " + field[0][0] + " wins!");
                    return;// Spiel endet
                }
                if (field[0][2] != ' ' && field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
                    displayField();
                    System.out.println("Player " + field[0][2] + " победил!");
                    return;// Spiel endet
                }
                //check Unentschieden
                if (zugCounter == 9) {
                    displayField();
                    System.out.println("Tie! Game over");
                    return; // Spiel endet
                }

                spielerX = !spielerX; //  Spieler  wechseln
            }
        }
    }
}

package Part_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //SummeAllerElementeImArray();
        //SummeAllerElementeImArray_g();

        //MultiArraySpielereien();
        //MultiArraySpielereien_g();

        //EinzelneDimensionenSummenVergleichen();
        //EinzelneDimensionenSummenVergleichen3D_g();

        //ArrayUnreschiedlicheLaenge_Summe();
        DreidimensionalesArray();

    }
    /*----------------------------------------------------------------------------------*/

    /*Übung 1 – Summen berechnen (aller Elemente im Array)
    Berechnen Sie in einem zweidimensionalen double-Array die Summen aller dort
    eingetragenen Elemente. Hier haben sie an veranschaulichendes Beispiel:
    Folgendes befindet sich im Array {{8.8, 12}, {134,67.92,45,32.4,76}, {1}, {0, 0.56}}
    Der korrekte Output müsste wie folgt lauten: „Die Summe beträgt: 377,68„*/

    public static void SummeAllerElementeImArray() {
        //Erstellen ein 2D-Array mit 2 Zeilen und 2 Spalten
        double[][] arr = new double[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte 4 Zahlen ein: "); // // Ausgabeaufforderung an den Benutzer,
        double sum = 0;

        // Äußere Schleife für die Zeilen des Arrays
        for (int i = 0; i < arr.length; i++) {
            // Innere Schleife für die Spalten in der aktuellen Zeile
            for (int j = 0; j < arr[i].length; j++) {
                // Benutzereingabe für jedes Element im Array
                System.out.print("Zahl für Position [" + i + "][" + j + "]: ");
                // Speichern der Benutzereingabe im Array
                arr[i][j] = scanner.nextDouble();
                // Hinzufügen des Wertes des aktuellen Elements zur Summe
                sum += arr[i][j];
            }
        }
        System.out.println("Die Summe beträgt: " + sum);
    }

    public static void SummeAllerElementeImArray_g() {
        // Beispiel-2D-Array
        double[][] array = {
                {8.8, 12},
                {134, 67.92, 45, 32.4, 76},
                {1},
                {0, 0.56}
        };

        // Variable für die Summe
        double summe = 0;

        // Äußere Schleife: durchläuft alle Zeilen des Arrays
        for (int i = 0; i < array.length; i++) {
            // Innere Schleife: durchläuft alle Elemente in der aktuellen Zeile
            for (int j = 0; j < array[i].length; j++) {
                // Addiere das Element zur Summe
                summe += array[i][j];
            }
        }

        // Ausgabe der Summe
        System.out.printf("Die Summe beträgt: %.2f", summe);

    }
    /*----------------------------------------------------------------------------------*/

    /*Übung 2 – MultiArray-Spielereien
    Erstellen Sie ein 8x8 Array und befüllen Sie dieses Array mit zufälligen ganzen Zahlen
    zwischen 1 und 100.
    Ermitteln Sie dann die nachfolgenden Unterpunkte und geben
    Sie so in der Konsole aus wie am Beispielbild am Ende dieser Übung dargestellt.
    + Die Summe aller Elemente in diesem Array
    + Den Durchschnitt aller Elemente in diesem Array
    + Das größte bzw. maximale Element in diesem Array (Tipp: Initialisieren Sie die
    Hilfsvariable hierfür mit dem kleinstmöglichen Integer-Wert)
    +  Das kleinste bzw. minimale Element in diesem Array (Tipp: Initialisieren Sie
    die Hilfsvariable mit dem größtmöglichen Integer-Wert)*/
    public static void MultiArraySpielereien() {
        Random random = new Random();
        int[][] arr = new int[8][8];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        //Befüllen, Summe berechnen und vergleichen
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(101);
                sum += arr[i][j];
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        // Ausgabe des Arrays
        System.out.println("8x8 Array : ");
        for (int i = 0; i < arr.length; i++) {  // Gehe durch alle Zeilen
            for (int j = 0; j < arr[i].length; j++) {  // Gehe durch alle Spalten der aktuellen Zeile
                System.out.print(arr[i][j] + " ");  // Gib das Element der aktuellen Zeile und Spalte aus
            }
            System.out.println();  // Wechsel in die nächste Zeile nach dem Drucken einer ganzen Zeile
        }
        System.out.println("Die Summe aller Elemente in diesem Array: " + sum);
        System.out.println("Das max. Element in diesem Array: " + max);
        System.out.println("Das min. Element in diesem Array: " + min);
        System.out.println("Der Durchschnitt aller Elemente in diesem Array: " + (double) sum / (arr.length * arr[0].length));
    }

    public static void MultiArraySpielereien_g() {
        // Erstellen ein 2D-Array
        int[][] arr = new int[3][3];
        int sum = 0;


        // Erstellen ein Random-Objekt, um Zufallszahlen zu generieren
        Random random = new Random();

        // Befüllen des Arrays mit Zufallszahlen zwischen 0 und 100
        for (int i = 0; i < arr.length; i++) {  // Gehe durch alle Zeilen
            for (int j = 0; j < arr[i].length; j++) {  // Gehe durch alle Spalten der aktuellen Zeile
                arr[i][j] = random.nextInt(101);  // Setze eine Zufallszahl zwischen 0 und 100 an die Position [i][j]
            }
        }

        // Ausgabe des Arrays
        System.out.println("3x3 Array : ");
        for (int i = 0; i < arr.length; i++) {  // Gehe durch alle Zeilen
            for (int j = 0; j < arr[i].length; j++) {  // Gehe durch alle Spalten der aktuellen Zeile
                System.out.print(arr[i][j] + " ");  // Gib das Element der aktuellen Zeile und Spalte aus
                sum += arr[i][j];
            }
            System.out.println();  // Wechsel in die nächste Zeile nach dem Drucken einer ganzen Zeile
        }
        // Initialisiere min und max mit dem ersten Wert des Arrays
//        int min = arr[0][0];
//        int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        // Durchlaufen des Arrays zur Bestimmung von min und max
        for (int i = 0; i < arr.length; i++) {  // Gehe durch alle Zeilen
            for (int j = 0; j < arr[i].length; j++) {  // Gehe durch alle Spalten der aktuellen Zeile
                if (arr[i][j] < min) {  // Wenn das aktuelle Element kleiner ist als das bisherige Minimum
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {  // Wenn das aktuelle Element größer ist als das bisherige Maximum
                    max = arr[i][j];
                }
            }
        }

        // Ausgabe von min und max
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Summe: " + (double) sum);
        System.out.println("Durchschnitt: " + (double) sum / (arr.length * arr[0].length));
    }
    /*----------------------------------------------------------------------------------*/

    /*Übung 3 – Einzelne Summen vergleichen
    Berechnen Sie in einem zweidimensionalen int-Array die Summen aller einzelnen
    eindimensionalen Arrays und vergleichen Sie diese miteinander. Geben Sie am Ende
    aus ob alle eindimensionalen Arrays die gleiche Summe haben oder nicht.*/
    public static void EinzelneDimensionenSummenVergleichen() {

        Random random = new Random();
        int[][] arr = new int[2][2];
        int sumArray1 = 0;
        int sumArray2 = 0;

        //Befüllen und rechnen die Summe
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);

                //Rechnen die Summe von Array1 und Array2
                if (i == 0) {
                    sumArray1 += arr[i][j];
                } else {
                    sumArray2 += arr[i][j];
                }
            }
        }
        //Ausgeben
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum of Array 1: " + sumArray1 + "\nsum of Array 2: " + sumArray2);
        if (sumArray1 < sumArray2) {
            System.out.println("die Summe aller Elemente in Array 1 < die Summe aller Elemente in Array 2 ");
        } else if (sumArray1 == sumArray2) {
            System.out.println("die Summe aller Elemente in Array 1 = die Summe aller Elemente in Array 2");
        } else {
            System.out.println("die Summe aller Elemente in Array 1 > die Summe aller Elemente in Array 2");
        }
    }

    public static void EinzelneDimensionenSummenVergleichen3D_g() {
        Random random = new Random();
        int[][][] arr = new int[3][3][3];  // 3D-Array: 3x3x3
        int sumArray1 = 0; // Summe der ersten Ebene (i == 0)
        int sumArray2 = 0; // Summe der zweiten Ebene (i == 1)
        int sumArray3 = 0; // Summe der dritten Ebene (i == 2)

        // Befüllen des Arrays und Berechnung der Summen
        System.out.println("Befülltes 3D-Array:");
        for (int i = 0; i < arr.length; i++) { // Durchläuft alle "3D-Ebenen"
            System.out.println("Ebene " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) { // Durchläuft alle "Zeilen" innerhalb der 2D-Ebene
                for (int k = 0; k < arr[i][j].length; k++) { // Durchläuft alle "Spalten" innerhalb der Zeile
                    arr[i][j][k] = random.nextInt(50);  // Zufallszahl zwischen 0 und 49 setzen
                    System.out.print(arr[i][j][k] + " ");  // Ausgabe des aktuellen Elements
                    // Berechnung der Summen je nach Position
                    if (i == 0) {
                        sumArray1 += arr[i][j][k];  // Summe der ersten Ebene (i == 0)
                    } else if (i == 1) {
                        sumArray2 += arr[i][j][k];  // Summe der zweiten Ebene (i == 1)
                    } else if (i == 2) {
                        sumArray3 += arr[i][j][k];  // Summe der dritten Ebene (i == 2)
                    }
                }
                System.out.println();  // Zeilenumbruch nach jeder Zeile
            }
            System.out.println();  // Zeilenumbruch nach jeder Ebene
        }

        // Ausgabe der Summen
        System.out.println("\nSummen der einzelnen Ebenen:");
        System.out.println("Summe der ersten Ebene (i == 0): " + sumArray1);
        System.out.println("Summe der zweiten Ebene (i == 1): " + sumArray2);
        System.out.println("Summe der dritten Ebene (i == 2): " + sumArray3);

        // Vergleich der Summen
        if (sumArray1 > sumArray2 && sumArray1 > sumArray3) {
            System.out.println("\nDie erste Ebene hat die größte Summe.");
        } else if (sumArray2 > sumArray1 && sumArray2 > sumArray3) {
            System.out.println("\nDie zweite Ebene hat die größte Summe.");
        } else if (sumArray3 > sumArray1 && sumArray3 > sumArray2) {
            System.out.println("\nDie dritte Ebene hat die größte Summe.");
        } else {
            System.out.println("\nDie Summen sind gleich.");
        }
    }

    /*----------------------------------------------------------------------------------*/

    //Array mit unterschiedlicher Länge bei der Zeilen
    public static void ArrayUnreschiedlicheLaenge_Summe() {
        int[][] arr = new int[4][];
        Random random = new Random();

        //Befüllen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[random.nextInt(4) + 2]; // Jede Zeile erhält eine zufällige Länge zwischen 2 und 5
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }

        //Ausgabe
        for (int[] zeile : arr) {
            for (int element : zeile) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[] summen = new int[arr.length]; //Array für die Summe jeder Reihe
        for (int i = 0; i < arr.length; i++) {
            for (int element : arr[i]) {
                summen[i] += element;
            }
        }
        boolean alleGleich = true;
        for (int i = 1; i < summen.length; i++) {
            if (summen[i] != summen[0]) {
                alleGleich = false;
                break;
            }
        }

        if (alleGleich) {
            System.out.println("Die Summen aller 4 eindimensionalen Arrays ist dieselbe.\n");
        } else {
            System.out.println("Die Summen aller 4 eindimensionalen Arrays ist NICHT dieselbe.\n");
        }

    }
    /*----------------------------------------------------------------------------------*/


    //    Übung 4 – Dreidimensionales Array
//    Erstelle ein dreidimensionales Array mit den Dimensionen 4x3x2 und fülle jedes
//    Element mit einer zufälligen double Zahl zwischen 0.0 und 1.0 auf. Führe
//    anschließend die nachfolgenden Unterpunkte aus und gib am Ende alles gemeinsam
//    aus (wie bei Übung 2)
//      1. 2. 3. Die Summe aller Elemente in diesem Array
//    Den Durchschnitt aller Elemente in diesem Array
//    Das größte bzw. maximale Element in diesem Array (Tipp: Initialisieren Sie die
//      Hilfsvariable hierfür mit dem kleinstmöglichen Integer-Wert)
//     4. Das kleinste bzw. minimale Element in diesem Array (Tipp: Initialisieren Sie
//      die Hilfsvariable mit dem größtmöglichen Integer-Wert)
    public static void DreidimensionalesArray() {
        double[][][] arr = new double[3][2][2];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = random.nextDouble(0, 1);
                }
            }
        }

        //Befüllen
//        for (double[][] row : arr) {
//            for (double[] row2 : row) {
//                for (double element : row2) {
//                    System.out.printf("%.2f ", element);
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
        double sum = 0;
        //Befüllen 2 Variante
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Block " + (i + 1) + ": ");


            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = random.nextDouble();

                    System.out.printf("%.2f ", arr[i][j][k]);

                    sum += arr[i][j][k]; // summieren


                }
                System.out.println();

            }
            System.out.println("----");
        }
        System.out.printf("Gesamtsumme aller Elemente: %.2f\n", sum);


    }

}

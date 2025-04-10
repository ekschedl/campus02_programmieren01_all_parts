package Part_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainMe {
    public static void main(String[] args) {

        //SummeAllerElementeImArray();
        //SummeAllerElementeImArray_g();
        //SummerAllerElementeImArray_herzic();

        //MultiArraySpielereien();
        //MultiArraySpielereien_g();
        //MultiArraySpielereien_herzic();

        //EinzelneDimensionenSummenVergleichen();
        //EinzelneDimensionenSummenVergleichen3D_g();
        //EinzelneDimensionenSummenVergleichen_herzic();

        //ArrayUnreschiedlicheLaenge_Summe();


        //DreidimensionalesArray();
        DreidimensionalesArray_herzic();

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

    public static void SummerAllerElementeImArray_herzic() {
        //Array deklarieren und mit Werten für die Elemente initialisieren
        double[][] array = {{8.8, 12}, {134, 67.92, 45, 32.4, 76}, {1}, {0,
                0.56}};
        //Hilfsvariable, wo ich die Summe verspeichere - muss natuerlich auchvom Typ double sein!
        double sum = 0;
        //OPTION 1: Verschachtelte For-Schleife -> Weil 2 Dimensionen, daher2 Schleifen!
        for (int i = 0; i < array.length; i++) { //hier gehe ich das erste Array
            //durch, welches in diesem Fall 4 weitere Arrays als Elemente hat
            for (int j = 0; j < array[i].length; j++) { //Hier ist es wichtig die
                //Laenge der einzelnen Arrays zu nehmen diese kann zwischen 1 und 6 varieren,
                //..ansonsten gibt es eine OutOfBoundException, wenn ich dashier nicht so mache
                //und nun zaehlen wir einfach die Werte zusammen, mehr ist
                //nicht dahinter :)
                sum += array[i][j]; //ist das gleiche wie wenn ich sum = sum + array[i][j] schreiben wuerde
            }
        }
        System.out.println("---------Trennstrich fuer OPTION 2 mit For:each--------");
        //Hilfsvarialbe sum2 fuer die zweite Option
        double sum2 = 0;
        //OPTION 2: Verschachtelte For:each-Schleife
        for (double[] ersteDimension : array) { //hier gibt es mir nur die
            //einzelnen Arrays aus also die erste Dimension also isgesamt 4 Mal
            //zum veranschaulichen was er mir hier retourgibt
            System.out.print(Arrays.toString(ersteDimension)); //Hier
            // bekommen wir die einzelnen Arrays, noch KEINE einzelonen Werte!
            System.out.println();
            for (double zahl : ersteDimension) { // hier gibt er mir nun die
                //einzelnen Werte aller einzelnenDimensions Arrays
                //zum veranschaulichen was er mir hier retourgibt
                System.out.print(zahl); //das ist kein Array mehr! Hier
                //bekommen wir endlich die einzelnen Werte
                sum2 += zahl;
            }
        }//Ausgabe der Summe
        System.out.println("\n\n---Hier wernden nun die finalen Summen ausgegeben---");
        System.out.println("Die Summe betraegt bei sum: " + sum);
        System.out.println("Die Summe betraegt bei sum2: " + sum2);
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

    public static void MultiArraySpielereien_herzic() {
        // Erzeuge ein 2-dimensionales Array mit den Dimensionen 8x8
        int[][] array = new int[8][8];
        // Fülle das Array mit zufälligen ganzen Zahlen zwischen 1 und 100
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(100) + 1;
            }
        }
        // Berechne und gib die Summe aller Elemente im Array aus
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                summe += array[i][j];  // Summe berechnen
            }
            System.out.println();  // Zeilenumbruch nach dem Array
        }


        System.out.println("Summe aller Elemente: " + summe);
        // Berechne und gib den Durchschnitt aller Elemente im Array aus
        double durchschnitt = (double) summe / (array.length *
                array[0].length);
        System.out.println("Durchschnitt aller Elemente: " + durchschnitt);
        // Finde und gib das Maximum im Array aus
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Maximum im Array: " + max);
        // Finde und gib das Minimum im Array aus
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println("Minimum im Array: " + min);
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

    public static void EinzelneDimensionenSummenVergleichen_herzic() {
        // Arrays deklarieren und die Elemente mit Werten initialisieren
        //int[][] arrayOption = {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 6}};

        // Zum Testen des anderen einfach die Zeile entkommentieren und die oben in Kommentlinie setzen
        int[][] arrayOption = {{2, 4, 3, 2}, {6, 3, 2}, {2, 10}, {2, 2, 2, 6}};

        int[] summArray = new int[arrayOption.length];  // Hier speichern wir die einzelnen Summen der 4 Arrays

        int counter = 0;  // Damit wir alle Felder von summArray durchgehen können

        // Berechnung der Summen
        for (int[] arrayEindimensional : arrayOption) {
            int hilfsvariableSum = 0;  // Diese immer neu initialisieren, damit sie die Summen der einzelnen Arrays berechnet

            for (int einzelneWerte : arrayEindimensional) {
                // Alle einzelnen Werte des eindimensionalen Arrays holen und zusammenzählen
                hilfsvariableSum += einzelneWerte;
            }
            summArray[counter] = hilfsvariableSum;  // Die berechnete Summe in summArray speichern
            counter++;
        }

        // Prüfung und Ausgabe des Outputs
        if (summArray[0] == summArray[1] && summArray[0] == summArray[2] && summArray[0] == summArray[3]) {
            System.out.println("OK - In diesem zweidimensionalen Array besitzen alle eindimensionalen Arrays die gleiche Summe");
        } else {
            System.out.println("X - In diesem zweidimensionalen Array besitzen NICHT alle eindimensionalen Arrays die gleiche Summe");
        }

    }
    /*----------------------------------------------------------------------------------*/

    //    //Array mit unterschiedlicher Länge bei der Zeilen
    public static void ArrayUnreschiedlicheLaenge_Summe() {

        // Arrays deklarieren und die Elemente mit Werten initialisieren
        int[][] arrayOption = {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 6}};

        // Zum Testen des anderen einfach die Zeile entkommentieren und die oben in Kommentlinie setzen
        // int[][] arrayOption = {{2, 4, 3, 2}, {6, 3, 2}, {2, 10}, {2, 2, 2, 6}};

        int[] summArray = new int[arrayOption.length];  // Hier speichern wir die einzelnen Summen der 4 Arrays

        int counter = 0;  // Damit wir alle Felder von summArray durchgehen können

        // Berechnung und Vergleich der Summen
        for (int[] arrayEindimensional : arrayOption) {
            int hilfsvariableSum = 0;  // Diese immer neu initialisieren, damit sie die Summen der einzelnen Arrays berechnet

            for (int einzelneWerte : arrayEindimensional) {
                // Alle einzelnen Werte des eindimensionalen Arrays holen und zusammenzählen
                hilfsvariableSum += einzelneWerte;
            }
            summArray[counter] = hilfsvariableSum;  // Die berechnete Summe in summArray speichern
            counter++;
        }

        // Prüfung und Ausgabe des Outputs
        if (summArray[0] == summArray[1] && summArray[0] == summArray[2] && summArray[0] == summArray[3]) {
            System.out.println("OK - In diesem zweidimensionalen Array besitzen alle eindimensionalen Arrays die gleiche Summe");
        } else {
            System.out.println("X - In diesem zweidimensionalen Array besitzen NICHT alle eindimensionalen Arrays die gleiche Summe");
        }
    }

//        /*----------------------------------------------------------------------------------*/
//
//        //    Übung 4 – Dreidimensionales Array
    /// /    Erstelle ein dreidimensionales Array mit den Dimensionen 4x3x2 und fülle jedes
    /// /    Element mit einer zufälligen double Zahl zwischen 0.0 und 1.0 auf. Führe
    /// /    anschließend die nachfolgenden Unterpunkte aus und gib am Ende alles gemeinsam
    /// /    aus (wie bei Übung 2)
    /// /      1. 2. 3. Die Summe aller Elemente in diesem Array
    /// /    Den Durchschnitt aller Elemente in diesem Array
    /// /    Das größte bzw. maximale Element in diesem Array (Tipp: Initialisieren Sie die
    /// /      Hilfsvariable hierfür mit dem kleinstmöglichen Integer-Wert)
    /// /     4. Das kleinste bzw. minimale Element in diesem Array (Tipp: Initialisieren Sie
    /// /      die Hilfsvariable mit dem größtmöglichen Integer-Wert)
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
        for (double[][] row : arr) {
            for (double[] row2 : row) {
                for (double element : row2) {
                    System.out.printf("%.2f ", element);
                }
                System.out.println();
            }
            System.out.println();
        }
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

    public static void DreidimensionalesArray_herzic() {
        // Erstelle ein 3-dimensionales Array mit den Dimensionen 4x3x2
        double[][][] array = new double[4][3][2];
        // Fülle das Array mit zufälligen Doubles zwischen 0,0 und 1,0
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = rand.nextDouble();
                }
            }
        }
        // Finde und gib aus: Summe aller Elemente im Array
        double summe = 0.0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    summe += array[i][j][k];
                }
            }
        }
        System.out.println("Summe aller Elemente: " + summe);
        // Finde und gib aus: Durchschnitt aller Elemente im Array
        double durchschnitt = summe / (array.length * array[0].length *
                array[0][0].length);
        System.out.println("Durchschnitt aller Elemente: " + durchschnitt);
        // Finde und gib aus: Maximum im Array
        double maximum = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] > maximum) {
                        maximum = array[i][j][k];
                    }
                }
            }
        }
        System.out.println("Maximum im Array: " + maximum);
        // Finde und gib aus: Minimum im Array
        double minimum = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] < minimum) {
                        minimum = array[i][j][k];
                    }
                }
            }
        }
        System.out.println("Minimum im Array: " + minimum);

    }
}
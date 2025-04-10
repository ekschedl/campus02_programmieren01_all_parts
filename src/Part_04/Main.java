import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Uebung1ErstesArray();
        //Uebung22SortierenvonArray();
        //Uebung3Zahlen();
        //UebungMulitArray1();
        //ZwischenUebung();
        //ZwischenUebung3DimArray();
        ZwischenUebung4DimArray();
    }

    public static void ZwischenUebung4DimArray() {
        //Multi-Arr 2x2x3x1 erstellen
        int[][][][] multiArr = new int[2][2][2][2];

        //Befuellen der ArraysMit neuen Werten
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < multiArr.length; i++) {
            //Fuer die zweite Schleife, die Laenge des jeweils zweiten Arrays an der Stelle i nehmen
            for (int j = 0; j < multiArr[i].length; j++) {
                //Fuer die dritte Schleife, die Laenge des jeweils dritten Array an der Stelle i und j nehmen
                for (int k = 0; k < multiArr[i][j].length; k++) {
                    //Fuer die vierte Schleife, die Lange des jeweils vierten Array an Stelle i,j und k nehmen
                    for (int l = 0; l < multiArr[i][j][k].length; l++) {
                        System.out.print("Bitte Wert eingeben: ");
                        multiArr[i][j][k][l] = input.nextInt();
                    }
                }
            }
        }

        //Korrekte Ausgabe der Werte der Dritten-Dimension --> Fazit: 3-Fach-Verschachtelte Schleifen!
        //Achtung, auch die Anzahl der [] erhöht sich nun!
        for (int[][][] einDim : multiArr) {
            System.out.println("1D----");
            for (int[][] zweiDim : einDim) {
                System.out.println("2D----");
                for (int[] dreiDim : zweiDim) {
                    System.out.println("3D----");
                    for (int vierDim : dreiDim) {
                        System.out.println("4D: Ausgabe in Schleife - Vierte Dim: " + vierDim);
                    }
                }
            }
        }

        System.out.println();//Fuer eine schoenere Ausgabe
        System.out.println("---------------");//Fuer eine schoenere Ausgabe
        System.out.println();//Fuer eine schoenere Ausgabe

        //Nun mit For-Schleife zur besseren Ubersicht in der Konsole (wegen der Zaehlervariablen)
        for (int i = 0; i < multiArr.length; i++) {
            System.out.println("1D---| multiArr[" + i + "]");
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.println("2D---| multiArr[" + i + "][" + j + "]");
                for (int k = 0; k < multiArr[i][j].length; k++) {
                    System.out.println("3D---| multiArr[" + i + "][" + j + "][" + k + "]");
                    for (int l = 0; l < multiArr[i][j][k].length; l++) {
                        System.out.println("4D---| multiArr[" + i + "][" + j + "][" + k + "][" + l + "]");
                        System.out.println("4D - Einzelner Wert: " + multiArr[i][j][k][l]);
                    }
                }
            }
        }
    }

    public static void ZwischenUebung3DimArray() {
        //Multi-Arr 2x2x3 erstellen
        int[][][] multiArr = new int[2][2][3];

        //Befuellen der ArraysMit neuen Werten
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < multiArr.length; i++) {
            //Fuer die zweite Schleife, die Laenge des jeweils zweiten Arrays an der Stelle i nehmen
            for (int j = 0; j < multiArr[i].length; j++) {
                //Fuer die dritte Schleife, die Laenge des jeweils dritten Array an der Stelle i und j nehmen
                for (int k = 0; k < multiArr[i][j].length; k++) {
                    System.out.print("Bitte Wert eingeben: ");
                    multiArr[i][j][k] = input.nextInt();
                }
            }
        }

        //Korrekte Ausgabe der Werte der Dritten-Dimension --> Fazit: 3-Fach-Verschachtelte Schleifen!
        //Achtung, auch die Anzahl der [] erhöht sich nun!
        for (int[][] einDim : multiArr) {
            for (int[] zweiDim : einDim) {
                for (int dreiDim : zweiDim) {
                    System.out.println("3D: Ausgabe in Schleife - Dritte Dim: " + dreiDim);
                }
            }
        }
    }

    public static void ZwischenUebung() {
        //Normales 1-Dimensionales Array
        int[] arr = new int[3];

        //Multi-Arr 2x3 erstellen
        int[][] multiArr = new int[3][2];

        //Befuellen der ArraysMit neuen Werten
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print("Bitte Wert eingeben: ");
                multiArr[i][j] = input.nextInt();
            }
            //Befuellen des 1D-Arrays
            arr[i] = multiArr[i][0];
        }

        System.out.println("---------------");//Fuer eine schoenere Ausgabe

        //Ausgabe mit toString-Methode
        System.out.println("1D: Ausgabe mit .toString: " + Arrays.toString(arr));
        System.out.println("2D: Ausgabe mit .toString: " + Arrays.toString(multiArr));

        System.out.println("---------------");//Fuer eine schoenere Ausgabe

        //Korrekte Ausgabe von 2D-Array-Elementen -> Nur erste Dimension
        for (int[] einDim : multiArr) {
            System.out.println("2D: Ausgabe in Schleife - nur erste Dim: " + Arrays.toString(einDim));
        }

        System.out.println("---------------");//Fuer eine schoenere Ausgabe

        //Korrekte Ausgabe von einzelnen 2D-Array-Alementen -> auch zweite Dimension
        for (int[] einDim : multiArr) {
            for (int zweiDim : einDim) {
                System.out.println("2D: Ausgabe in Schleife - Zweite Dim: " + zweiDim);
            }
        }
    }

    public static void UebungMulitArray1() {
        //Mulitdimensionales Array erstellen mit 2 Zeilen und 3 Spalten
        int[][] multiArr = new int[2][3];

        //Aufgabe 1: Alle innersten Werte befuellen ueber Scanner
        Scanner input = new Scanner(System.in);
        //Fuer die erste Schleife, die Laenge des ersten Arrays nehmen --> multiArr.length = 2
        for (int i = 0; i < multiArr.length; i++) {
            //Fuer die zweite Schleife, die Laenge des jeweils zweiten Arrays an der Stelle i nehmen
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print("Bitte Wert eingeben: ");
                multiArr[i][j] = input.nextInt();
            }
        }

        //Aufgabe: Ausgabe aller einzelnen innersten Werte
        for (int[] dimension1 : multiArr) {
            for (int dimension2 : dimension1) {
                System.out.println("Innerste Werte: " + dimension2);
            }
        }

        //Aufgabe 3: Berechnung aller Werte im Array
        int summe = 0;
        for (int[] dimension1 : multiArr) {
            for (int dimension2 : dimension1) {
                summe = summe + dimension2;
            }
        }
        System.out.println("Die Summe aller Werte des Mulit-Arrays = " + summe);
    }

    public static void Uebung3Zahlen() {
        //Array mit Zahlen erstellen
        int[] zahlen = {2, 9, 5, 7, 1689, 6345, 9141, 18, 859841, 30, 99978497, 1, 9816};
        int counter = 0; //Fuer Aufgabe 1
        //Achtung: wenn mit 0 initialisiert und die kleinste Zahl im Array 1 ist, dann bleibt die Variable
        //kleinste Zahl ja immer bei 0! Daher die Variable kleinste mit erstem Element von zahlen-Array
        //initialisieren, sodass wir sicherstellen koennen, dass wir die kleinste Zahl im Array finden,
        //welche in diesem Fall wirklich die 1 ist
        int groesste = zahlen[0];
        int kleinste = zahlen[0]; //Fuer Aufgabe 2

        //Aufgabe 1 - Zahlen aufsummieren und am Ende ueber Konsole ausgeben
        for (int z : zahlen) {
            counter += z;
        }
        System.out.println(counter);

        //Aufgabe 2 - Groesste/Kleinste Zahl
        for (int z : zahlen) {
            //Falls aktuelle groesste-Zahl > aktuellen Zahl z aus dem Array, dann groesste mit z ueberschreiben
            if (groesste < z) {
                groesste = z;
            }
            //Falls aktuelle kleinste-Zahl < aktuellen Zahl z aus dem Array, dann kleinste mit z ueberschreiben
            if (kleinste > z) {
                kleinste = z;
            }
        }
        System.out.println("Groesste: " + groesste + " | Kleinste: " + kleinste);

        //Aufgabe 3 - Durchschnittsberechnung
        System.out.println("Durchschnitt: " + (counter / zahlen.length));
        //Da wir schon alle Zahlen in Uebung 1 zusammengezaehlt haben, reicht es wenn wir hier
        //einfach nur durch die Anzahl der Elemente aus dem Array dividieren
    }

    public static void Uebung22SortierenvonArray() {
        String[] arr = {"Hannes", "Matilda", "Clemens", "Anton", "Bert", "Dominik", "Gustav", "Felix", "Erik"};
        //Ausgabe vor dem Sortieren, zur Pruefung
        System.out.println("Un-Sortiertes Array: " + Arrays.toString(arr));

        //Achtung -1 bei lengt, weil ich immer aktuelles mit naechsem vergleiche! j+1
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                //Abfragen ob Element an Index j groesser ist als Element an Index j+1 --> also immer mit naechstem vergleichen
                //Falls es groesser ist, schieben wir es einfach nach hinten und vergleichen dann mit dem naechsten
                if (arr[j].charAt(0) > arr[j + 1].charAt(0)) {
                    //Falls naechstes Element groesser als das aktuelle, dann Elemente miteinander tauschen
                    //Schritt 1: aktuelles Element in Temporaere Variable speichern
                    String tempVar = arr[j];
                    //Schritt 2: aktuelles Element mit naechstem Ueberschreiben
                    arr[j] = arr[j + 1];
                    //Schritt 3: naechstes Element mit vorherigem Ueberschreiben aus der Temporaeren Variable
                    arr[j + 1] = tempVar;
                }
            }
        }
        // Ausgabe nach dem Sortieren
        System.out.println("Sortiertes Array: " + Arrays.toString(arr));
    }

    public static void Uebung1ErstesArray() {
        //String-Array erstellen
        String[] arr = new String[100];
        int counter = 0; //Hilfsvariable

        //Befuellung des Strings
        for (int i = 2; i <= 200; i += 2) {
            //Array an der Stelle "counter" mit i zuweisen
            //Achtung: i ist ein Integer, daher konvertierung zu String notwendig!
            arr[counter] = Integer.toString(i);
            counter++;
        }

        //Ausgeben des gesamten Arrays
        System.out.println(Arrays.toString(arr));
    }
}
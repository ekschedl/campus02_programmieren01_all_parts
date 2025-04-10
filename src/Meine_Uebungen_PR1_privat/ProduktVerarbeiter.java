package Meine_Uebungen_PR1_privat;

public class ProduktVerarbeiter {

    // Methode berechnet das Produkt aller Zahlen im Array
    public static int liefereProdukt(int[] list) {
        int produkt = 1; // Wir beginnen mit 1, da sonst das Produkt immer 0 wäre
        for (int num : list) {
            produkt *= num;//Multipliziert produkt mit dem aktuellen Wert num im Array
        }
        return produkt; // Rückgabe des berechneten Produkts
    }

    // Methode berechnet die Summe der Quadrate aller Zahlen im Array
    public static int liefereSummeQuadrate(int[] list) {
        int sumOfNummerInQuadrate = 0;// Initialisieren der Summe der Quadrate
        for (int num : list) {
            num *= num;// Quadrat der Zahl berechnen
            sumOfNummerInQuadrate += num;// Zum Summenwert hinzufügen
        }
        return sumOfNummerInQuadrate; // Rückgabe der berechneten Summe der Quadrate
    }

    public static int[] bubbleSort(int[] list) {
        int n = list.length;
        int temp = 0;

        // Der äußere Schleife läuft n-1 mal
        for (int i = 0; i < n - 1; i++) {
            // Der innere Schleife geht durch den unsortierten Teil des Arrays
            for (int j = 0; j < n - 1 - i; j++) {
                // Wenn die Elemente falsch angeordnet sind, tauschen wir sie
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        // Gibt das sortierte Array zurück (das Array wurde bereits verändert)
        return list;
    }

    public static int[] bubbleSortWithCLone(int[] list) {
        int n = list.length;
        int temp = 0;

        // Erstellen einer Kopie des Original-Arrays, um es nicht zu verändern
        int[] sortedList = list.clone();

        // Äußere Schleife läuft n-1 Mal
        for (int i = 0; i < n - 1; i++) {
            // Innere Schleife läuft durch den unsortierten Teil des Arrays
            for (int j = 0; j < n - 1 - i; j++) {
                if (sortedList[j] > sortedList[j + 1]) { // Falls die Reihenfolge falsch ist, tauschen
                    temp = sortedList[j];
                    sortedList[j] = sortedList[j + 1];
                    sortedList[j + 1] = temp;
                }
            }
        }
        return sortedList; // Rückgabe des sortierten Arrays
    }
}



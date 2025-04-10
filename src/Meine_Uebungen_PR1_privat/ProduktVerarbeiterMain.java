package Meine_Uebungen_PR1_privat;

public class ProduktVerarbeiterMain {
    public static void main(String[] args) {
        int[] list = {1, 3, 2, 4, 8, 9};
        //Viele Glück! - Das schaffen Sie! :)

        //berechnet das Produkt aller Zahlen im Array,
        // indem sie die Methode liefereProdukt aufruft und das
        // Ergebnis in der Variablen produkt speichert.
        int produkt = ProduktVerarbeiter.liefereProdukt(list);
        System.out.println("Produkt: " +produkt);// ausgabe

        //berechnet die Summe der Quadrate aller Zahlen im Array,
        // indem sie die Methode liefereSummeQuadrate aufruft und das
        // Ergebnis in der Variablen sumOfNummerInQuadrate speichert.
        int sumOfNummerInQuadrate = ProduktVerarbeiter.liefereSummeQuadrate(list);
        System.out.println("Summe der Quadrate aller Zahlen: " +sumOfNummerInQuadrate); //ausgabe


        // Bubble Sort anwenden
        int[] bubbleSortedList = ProduktVerarbeiter.bubbleSort(list);

        System.out.println("\nSortiertes Array:");
        for (int num : bubbleSortedList) {
            System.out.print(num + " ");
        }
    }
}
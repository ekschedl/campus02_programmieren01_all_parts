public class Anage01_ZahlVerarbeiter {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4};
        //Viele Glück! - Das schaffen Sie! :)

        //erstellen Objekt zahlVerarbeiter da Methode in Zahlverarbeiter nicht stitic sind,  einfach so testen
        ZahlVerarbeiter zahlVerarbeiter = new ZahlVerarbeiter();

        //testen methode aus der Klasse ZahlVerarbeiter:

        //liefert Summe:
        int sum=zahlVerarbeiter.liefereSumme(list);
        System.out.println("Methode LieferSumme: " + sum);

        //liefert Max:
        int max= zahlVerarbeiter.liefereMax(list);
        System.out.println("Methode liefereMax: " + max);

        //liefert Min:
        int min= zahlVerarbeiter.liefereMin(list);
        System.out.println("Methode liefereMin: " + min);

        //liefert Mittelwert:
        double durchschnitt= zahlVerarbeiter.liefereMittelwert(list);
        System.out.println("Methode liefereMittelwert: " + durchschnitt);


    }
}


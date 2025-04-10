public class ZahlVerarbeiter {

    //Variable für Summe initialisieren, hier damit ich bei der Methode liefereMittelwert auch nutzen kann
    int sum = 0;

    //Methode zum berechnen Summer aller im Array  befindlichen ZAhlen
    public int liefereSumme(int[] list) {
        //Schleife durch Array
        for (int i = 0; i < list.length; i++) {
            sum += list[i];// Summieren
        }
        return sum; //liefert zurück
    }

    //Methode zum berechnen den grössten Wert aus dem Array
    public int liefereMax(int[] list) {

        int max = list[0]; //setzten  max auf das ertse ELement im Array
        //Schleife durch Array
        for (int i = 0; i < list.length; i++) {
            //Wenn element  größer als  max Variable   dann wird max gleich dieses element
            if (list[i] > max) {
                max = list[i];
            }
        }
        return max;//liefert zurück
    }

    //Methode zum berechnen den kleinsten Wert aus dem Array
    public int liefereMin(int[] list) {
        int min = list[0];//setzten  min auf das ertse ELement im Array
        //Schleife durch Array
        for (int i = 0; i < list.length; i++) {
            //Wenn element kleiner als  min Variable   dann wird min gleich dieses element
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;//liefert zurück
    }

    //Methode zum berechnen den Mittelwert aus allen Zahlen des übergebenen Arrays
    public double liefereMittelwert(int[] list) {
        double durchschnitt = 0; // wir brauchen Variable  durchschnitt zum berechnen,  Initialisieren und setzen auf 0
        durchschnitt = (double) sum / list.length; // double damit  die Zahlen nach Komma gezeigt werden
        return durchschnitt;//liefert zurück
    }


}

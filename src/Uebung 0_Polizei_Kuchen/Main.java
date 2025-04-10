import KuchenRezepte.ApplePie;
import KuchenRezepte.BlueberryPie;
import KuchenRezepte.CheeseCake;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Uebung4_1();
    }

    public static void Uebung4_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib jetzt die Gemessene Geschwindigkeit ein: ");
        int gemesseneGeschwindigkeit = scanner.nextInt();
        int ueberschreitung = 0;

        if(gemesseneGeschwindigkeit > 50){
            ueberschreitung = gemesseneGeschwindigkeit - 50;
        } else {
            System.out.println("Alles Gut, sie duerfen weiterfahren");
        }

        int geschStrafe = 0;

        //Ab hier Uebung 4-2
        if(ueberschreitung <= 10 && ueberschreitung > 0){
            System.out.println("Schriftliche Verwarnung");

        } else if(ueberschreitung <= 20){
            System.out.println("30€ Strafe");
            geschStrafe = 30;
        } else if (ueberschreitung <= 30){
            System.out.println("50€ Strafe");
            geschStrafe = 50;
        } else if (ueberschreitung <= 50){
            System.out.println("100€ Strafe");
            geschStrafe = 100;
        } else if (ueberschreitung <= 100){
            System.out.println("500€ Strafe");
            geschStrafe = 500;
        } else if (ueberschreitung > 100){
            System.out.printf("1500€ Strafe");
            geschStrafe = 1500;
        }

        //Uebung 4-3
        System.out.println("Bitte geben Sie den gemessenen Alkoholpegel ein: ");
        double alkoPegel = scanner.nextDouble();
        int alkoPegelStrafe = 0;

        if(alkoPegel <= 0.5 && alkoPegel > 0){
            System.out.println("Alles i.O.");
        } else if(alkoPegel > 0.5 && alkoPegel <= 1.0){
            System.out.println("Strafe 50€");
            alkoPegelStrafe = 50;
        } else if(alkoPegel >= 1.1 && alkoPegel < 2.0){
            System.out.println("Strafe 100€");
            alkoPegelStrafe = 100;
        } else if(alkoPegel > 2.0){
            System.out.println("Strafe 2500€");
            alkoPegelStrafe = 2500;
        }

        //Ausgabe der Gesammelten Strafen
        System.out.println("Gesamtstrafe = "+(alkoPegelStrafe+geschStrafe));




    }

    public static void Uebung21(){
        //In CheeseCake gibt es eine public-Methode, auf die kann ich von hier aus zugrifen
        CheeseCake.BakeCheeseCake();

        //In der Klasse ApplePie gibt es eine Protected-Methode, auf die kann ich nur innerhalb
        //des Packages KuchenRezepte zugreifen, daher geht es von hier aus nicht

        //In der Klasse BlueberryPie gibt es eine Private-Methode, auf die kann ich nur innerhalb
        //der Klasse BlueberryPie zugreifen, daher ginge das auch nicht.
        //Als Workaround habe ich eine zweite Methode in der Klasse BlueberryPie implementiert,
        //welche eine Public-Methode ist, daher kann ich auf diese von hier aus zugreifen.
        BlueberryPie.NurZumAusfuehren();
    }

    public static void ZwischenUebung() {
        System.out.println("1) ZwischenUebung: Zuerst werde ich aufgerufen!");
        MethodenGrundlagen();
        System.out.println("3) ZwischenUebung: nun werde ich aufgerufen!");
        Methode2();
    }

    public static void MethodenGrundlagen() {
        System.out.println("2) MethodenGrundlagen(): dann werde ich aufgerufen");
    }

    public static void Methode2() {
        System.out.println("4) Methode2: zum schluss werde ich noch aufgerufen");
    }

    public static void ErsteMethode() {
        System.out.println("Name: HG");
    }

    public static void ZweiteMethode() {
        System.out.println("Wetter: Sonnig");
    }

    public static void Uebung2() {
        //Objekt des Typs "Scanner" erstellt
        Scanner scanner = new Scanner(System.in);

        //Lesen wir den Vornamen ein und speichern diesen in eine String Variable
        String vorname = scanner.next();
        //-||- mit dem Nachnamen
        String nachname = scanner.next();
        //Fügen wir die zwei eingescannten Variablen in eine zusammen und trenenn mit Leerzeichen
        String name = vorname + " " + nachname;

        //die Laenge von Variable name in eine int-Variable speichern
        int laenge = name.length();

        //pruefung ob die laenge groesser 10 ist
        boolean laengeGroesserZehn = laenge > 10;

        name = name.toUpperCase();
        System.out.println("Laenge > 10: " + laengeGroesserZehn);
        System.out.println("Die exakte Laenge ist: " + laenge);
        System.out.println("Willkommen " + name);

        //Wieso ist name hier wieder klein geschrieben?
        System.out.println("Willkommen " + name);
    }

    public static void Uebung1() {
        boolean b;
        int a = 100;

        b = a >= 110;
        System.out.println("a >= 110? " + b);

        //Wert von a auf 110 aendern
        a = 110;
        b = a >= 110;
        System.out.println("a >= 110? " + b);

        //Wert von a auf 115 aendern
        a = 115;
        b = a >= 110;
        System.out.println("a >= 110? " + b);

        System.out.println(a >= 10);
    }

    public static void Uebung0() {
        System.out.printf("Name: Lia Maxein \nWetter: sonnig \nKatze: Edu");

        System.out.println("Harris Gerzic");
        System.out.println("Blauer Himmel & Sonnig");
        System.out.println("Schnurrli oder Pezi");

        String tag = "Mittwoch";
        System.out.printf("Heute ");

        int zahl = 10;
        double zahl2 = 10.3;
        float zahl3 = 15;

        System.out.println("zahl: " + zahl);
        System.out.println("zahl2: " + zahl2);
        System.out.println("zahl3: " + zahl3);
    }
}
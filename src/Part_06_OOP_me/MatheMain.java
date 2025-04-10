import java.util.Scanner;

public class MatheMain {
    public static void main(String[] args) {


        //Ausgabe static
        System.out.println("---static---:");
        System.out.println("addieren: " +MatheRechner.addieren(3, 5));
        System.out.println("substrahieren: "+ MatheRechner.substrahieren(3, 5));
        System.out.println("dividieren: "+ MatheRechner.dividieren(3, 5));
        System.out.println("multiplizieren: " +MatheRechner.multiplizieren(3, 5));
        System.out.println("-----------------------------");

        //Ausgabe nicht static, muss zuerst Object erstellen
        MatheRechnerNichtStatic mrns= new MatheRechnerNichtStatic();
        System.out.println("---nicht_static---:");

        System.out.println("addieren: " + mrns.addieren(3, 5));
        System.out.println("substrahieren: "+ mrns.substrahieren(3, 5));
        System.out.println("dividieren: "+ mrns.dividieren(3, 5));
        System.out.println("multiplizieren: " + mrns.multiplizieren(3, 5));
    }
}


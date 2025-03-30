package Part_05;

public class Grundsteuer {

    public static double grundsteuerBerechnen(int[][] grundstuecke) {
        double gesamtSteuer = 0; // Variable für die Gesamtsteuer

        //schleife über alle Grundstücke
        for (int i = 0; i < grundstuecke.length; i++) {
            int typ = grundstuecke[i][0];
            int laenge = grundstuecke[i][1];
            int breite = grundstuecke[i][2];

            //rechnen Fläche des Grundstücks
            int flaeche = laenge * breite;
            System.out.println("Reihe " + (i + 1) + ": ");
            System.out.println("Fläche: " + flaeche);

            // Steuer je nach typ:
            double steuersatz = switch (typ) {
                case 1 -> 3.20;
                case 2 -> 2.10;
                default -> 0.90;
            };
            //Steuer je nach typ: Variante mit if:
//            if (typ == 1) {
//                steuersatz = 3.20;
//            } else if (typ == 2) {
//                steuersatz = 2.10;
//            } else {
//                steuersatz = 0.90;
//            }
            System.out.println("Typ: " + typ + "\nSteuersatz: " + steuersatz);


            // rechnen Steuer für das aktuelle Grundstück und Ausgabe von den Schritten
            double steuerProGrundstueck = flaeche * steuersatz;
            gesamtSteuer += steuerProGrundstueck;
            System.out.println("Steuer pro Reihe: " + flaeche + " * " + steuersatz + " = " + steuerProGrundstueck);
            System.out.println("Gesamtsteuer bis jetzt: " + gesamtSteuer + " Euro" + " \n----------------");
        }
        // rückgeben von Wert "Steuer gesamt"
        return gesamtSteuer;
    }

}


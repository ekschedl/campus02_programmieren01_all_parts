public class Part1Uebung01 {
    public static void main(String[] args) {
        //die boolean Variable b deklarieren und  mit false als default-Wert initialisieren
        boolean b = false;

        int a = 100; //dannach mit dem Wert 110 probieren und dann mit dem Wert 115 probieren

        //Der rechcte Ausdruck gibt entweder true oder false zurueck und das wird in b gespepichert
        b = a >= 110;

        //Schauen wir uns an was nun in b gespeichert wurde
        System.out.println("Die Variable b ist nun auf: "+b);
    }
}

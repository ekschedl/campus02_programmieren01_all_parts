package Part_05;

public class Quader {
    // Attribute für die Länge, Breite und Höhe des Quaders
    private double laenge;
    private double breite;
    private double hoehe;

    // Konstruktor zum Erstellen eines Quader-Objekts
    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    // Getter- und Setter-Methoden zum Werte abrufen oder ändern, weil die Attribute private sind-
    public double getLaenge() {
        return laenge;
    }
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    public double getBreite() {
        return breite;
    }
    public void setBreite(double breite) {
        this.breite = breite;
    }
    public double getHoehe() {
        return hoehe;
    }
    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    // rechnen die Grundfläche des Quaders
    public double grundflaeche() {
        return laenge * breite;
    }

    // skalieren den Quader um einen bestimmten Faktor
    public void skaliere(double faktor) {
        laenge *= faktor;
        breite *= faktor;
        hoehe *= faktor;
        System.out.println("Quader wurde mit Faktor " + faktor + " skaliert.");
    }

    //rechnen das Volumen des Quaders
    public double volumen() {
        return laenge * breite * hoehe;
    }

    // rechnen gesamte Oberfläche des Quaders
    public double oberflaeche() {
        return 2 * (laenge * breite + laenge * hoehe + breite * hoehe);
    }

    //Methode zum Ausgeben Info
    public void ausgebenInfo() {
        System.out.println("Länge: " + laenge + ", Breite: " + breite + ", Höhe: " + hoehe);
        System.out.println("Grundfläche: " + grundflaeche());
        System.out.println("Volumen: " + volumen());
        System.out.println("Oberfläche: " + oberflaeche());
        System.out.println(" ---------------------- ");
    }


}


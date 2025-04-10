public class Rechner {
    double zahl1;
    double zahl2;
    double zahl3;

    public double rechne(double zahl1, double zahl2) {
        return zahl1+zahl2;
    }
    public int rechne(int zahl1, int zahl2) {
        return zahl1+zahl2;
    }
    public double rechne(double zahl1, double zahl2, double zahl3) {
        return zahl1+zahl2+zahl3;
    }
    public int rechne(int zahl1, int zahl2, int zahl3) {
        return zahl1+zahl2+zahl3;
    }
    public boolean rechne(boolean istTrue) {
        return istTrue;  // Gibt den booleschen Wert zurück
    }



}

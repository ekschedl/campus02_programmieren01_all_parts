public class Drucker {
    String word;
    int num;
    double numFloat;
    boolean isFalse;


    // Überladene drucken()-Methoden
    public String drucken(String word) {
        return word;
    }

    public int drucken(int num) {
        return num;
    }

    public double drucken(double numFloat) {
        return numFloat;
    }

    public boolean drucken(boolean isFalse) {
        return isFalse;
    }


}

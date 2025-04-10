public class Auto {
    static int ps = 200;
    private String marke;
    private String typ;
    public static int counter;

    public Auto(String marke, String typ) {
        this.marke = marke;
        this.typ = typ;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public Auto() {

    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}

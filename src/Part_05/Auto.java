package Part_05;

public class Auto {
    private  String marke;
    private  String modell;
    private  int jahr;
    private  double geschwindigkeit;

    public Auto(String marke, String modell, int jahr) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public void gasGeben(double parameterZumErhoehen){
        geschwindigkeit+=parameterZumErhoehen;
    }
    public void bremsen(double parameterZumBremsen){
        geschwindigkeit-=parameterZumBremsen;
    }
    public String toString(){
        return "Marke: " + marke +
                "\nModell: " + modell +
                "\nJahr: " + jahr +
                "\nGeschwindigkeit: " + geschwindigkeit + " km/h";
    }
}


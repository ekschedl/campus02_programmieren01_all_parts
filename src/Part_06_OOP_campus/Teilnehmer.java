public class Teilnehmer {
    private String name;
    private int alter;
    private String adresse;
    private int counter = 0; //zum Zaehlen der Fragen

    Teilnehmer(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void hatFrageGestellt() {
        counter++;
    }

    public int rueckabeFragenCounter() {
        return counter;
    }

    public void teilnehmerInfo() {
        if (name != null) {
            System.out.println("Name: " + name);
        }
        if (alter > 0) {
            System.out.println("Alter: " + alter);
        }
        if (adresse != null) {
            System.out.println("Adresse: " + adresse);
        }
        System.out.println("Counter: " + counter);
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}

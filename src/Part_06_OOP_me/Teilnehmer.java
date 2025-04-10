public class Teilnehmer {
    private String name;
    private int alter;
    private String adresse;
    private int counter=0;

    //Konstruktor
    Teilnehmer(String name, int alter) {
        this.name = name; //this bezieht sich auf public class Teilnehmer -String name
        this.alter = alter;//this bezieht sich auf public class Teilnehmer -int alter
    }

    public void hatFrageGestellt() {
        counter++;
    }

    public int rückgabeFragenCounter() {
        return counter;
    }

    public void teilnehmerInfo() {
        if(name!=null){
        System.out.println("Name: " + name);};
        if(alter>0){
            System.out.println("Alter: " + alter);}
        if(adresse!=null){
            System.out.println("Adresse: " + adresse);}
        System.out.println("Fragen Anzahl: " + counter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getAdresse() {
        return adresse;
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

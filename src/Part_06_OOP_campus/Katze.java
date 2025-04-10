public class Katze {
    private String name;
    private int alter;
    private String rasse;

    Katze(String name, int alter, String rasse) {
        this.name = name;
        this.alter = alter;
        this.rasse = rasse;
    }

    public void Knurren(){
        System.out.println("Knurrrrr");
    }

    //Version 1 - Hund hier erstellen ohne Uebergabe
    public void hundWeglaufen(){
        Hund hund1 = new Hund("Bello",2,"Mischling","schwarz");
        Hund hund2 = new Hund("Foxi",4,"Mischling","Feuerrot-Braun");

        if(hund1.getName().equals("Foxi")){
            System.out.println("Alles gut, das ist mein Freund!");
        } else {
            System.out.println("Kenne ich nicht, weglaufen!");
        }
    }

    //Version 2 - Mit Werten in der Parameterliste, also Hund wird woanders erzeugt
    public void vorHundWeglaufen(Hund hund){
        if(hund.getName().equals("Foxi")){
            System.out.println("Alles gut, das ist mein Freund!");
        } else {
            System.out.println("Kenne ich nicht, weglaufen!");
        }
    }

    //Ab hier kommen Getter- & Setter-Methoden#
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

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }
}

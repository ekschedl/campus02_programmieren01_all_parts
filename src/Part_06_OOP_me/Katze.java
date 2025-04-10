public class Katze {
    private String name;
    private String rasse;
    private int alter;


    Katze(String name, String rasse, int alter) {
        this.name = name;
        this.rasse = rasse;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void knurren() {
        System.out.println("knuurr");
    }

    //Version 1 Hund hier erstellen ohne Uebergabe
    public void hundWeglaufen() {
        Hund2 hund3 = new Hund2("Roi", " Dolmatiner", "weiß-schwarz", 4);
        Hund2 hund4 = new Hund2("Roxi", " Mischling", "rot", 1);

        if (hund3.getName().equals("Foxi")) {
            System.out.println("Alles Gut, das ist mein Freund");
        } else {
            System.out.println("Kenne ich nicht, weglaufen");
        }
    }
    //Version2 Hund hier erstellen
    public void vonHundWeglaufen(Hund2 objekt) {
        if (objekt.getName().equals("Foxi")) {
            System.out.println("Alles Gut, das ist mein Freund");
        } else {
            System.out.println("Kenne ich nicht, weglaufen");
        }
    }
}
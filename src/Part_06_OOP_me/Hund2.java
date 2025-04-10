import java.util.Scanner;

public class Hund2 {
    String name;
    String rasse;
    String farbe;
    int alter;

    //Konstruktor
    Hund2(String name, String rasse, String farbe, int alter) {
        this.name = name;
        this.rasse = rasse;
        this.farbe = farbe;
        this.alter = alter;
    }

    public void bellen() {
        System.out.println("Wuff Wuff");
    }


    public String stoeckhenBringen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Variante2: Kann Hund Stöckchen bringen? (ja oder nein)");
        String antwort = scanner.next().toLowerCase();

        if (antwort.equals("ja")) {
            return "Variante 2: jaaaa, er bringt ein Stöckchen!";
        } else if (antwort.equals("nein")) {
            return "Variante 2: Leider kann er noch nicht, aber wir üben";
        } else {
            return "Variante 2: Ungültige Eingabe!";
        }
    }


    public String stoeckhenBringen2(boolean kannHund) {
        if (kannHund) {
            return "Variante 1:kann";
        } else  {
            return "Variante 1: nicht kann";
        }
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

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
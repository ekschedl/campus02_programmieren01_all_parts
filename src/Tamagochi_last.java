import java.util.Scanner;

public class Tamagochi_last {

    public static void main(String[] args) {
        Tamagochi_last t1 = new Tamagochi_last(5, 6, 10);
        System.out.println(t1);
        System.out.println("Wieviele Schritte soll das Tamagochi gehen? oben/unten/links/rechts");
        Scanner bewegung = new Scanner(System.in);
        Scanner schritte = new Scanner(System.in);
        t1.bewegen(bewegung.next(), schritte.nextInt());
        System.out.println(t1);
        System.out.println("gib mir Futter!");
        t1.fuettern(5);
        System.out.println(t1);
        System.out.println("Geh zurück zum Anfang");
        t1.returnTamagochi();
        System.out.println(t1);

    }

    private int x;
    private int y;
    private int futterstand;

    public Tamagochi_last(int x, int y, int futterstand) {
        this.x = x;
        this.y = y;
        this.futterstand = futterstand;
    }

    public void bewegen(String bewegung, int schritte) {

        do {
            if (futterstand == 0) {
                System.out.println("Fülle den Futterstand auf:");
                Scanner sc = new Scanner(System.in);
                fuettern(sc.nextInt());
            } else {
                if (bewegung.equalsIgnoreCase("links")) {
                    x--;
                    futterstand--;
                    schritte--;
                }
                if (bewegung.equalsIgnoreCase("rechts")) {
                    x++;
                    futterstand--;
                    schritte--;
                }
                if (bewegung.equalsIgnoreCase("oben")) {
                    y++;
                    futterstand--;
                    schritte--;
                }
                if (bewegung.equalsIgnoreCase("unten")) {
                    y--;
                    futterstand--;
                    schritte--;
                }
            }

        } while (schritte > 0);


    }

    public void returnTamagochi() {
        while (x != 0 && y != 0) {
            if (futterstand <= 0) {
                System.out.println("Fuelle den Futterstand auf:");
                Scanner sc = new Scanner(System.in);
                fuettern(sc.nextInt());
            } else {
                futterstand = futterstand - Math.abs(x);
                x = 0;
                futterstand = futterstand - Math.abs(y);
                y = 0;
            }

        }
    }

    public void fuettern(int futtermenge) {
        futterstand += futtermenge;
    }

    @Override
    public String toString() {
        return "Tamagochi: " +
                "x=" + x +
                ", y=" + y +
                ", futterstand=" + futterstand;
    }
}

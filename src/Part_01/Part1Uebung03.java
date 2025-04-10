import java.util.Scanner;

public class Part1Uebung03 {
    public static void main(String[] args) {
        //Hier wieder das Import oben einbinden nicht vergessen
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte eine ganze Zahl ein: "); //Nutzer darauf hinweisen, dass er was eingeben soll
        int nummer = scanner.nextInt(); //Hier wird die Eingabe des Nutzers von der Konsole in die Variable nummer gespeichert

        //Falls die variable nummer > 5 dann TRUE und wir gehen in die IF hinein, ansonsten springen wir runter zu else
        if(nummer > 5){
            //Falls diese IF-Anweisung TRUE zurueckgibt, dann gib nachfolgendes aus
            System.out.println("Nummer  ist groesser als 5");
        } else { //Falls oben FALSE rauskommt, dann spring auf jeden Fall hier hinein
            if(nummer < 5){ //Falls die Variable nummer nun < 5 ist, dann TRUE und sonst FALSE
                System.out.println("Nummer  ist kleiner als 5");
            } else { //Falls oben FALSE rauskommt, dann spring auf jeden Fall hier hinein
                System.out.println("Nummer  ist wohl gleich 5");
            }
        }
    }
}

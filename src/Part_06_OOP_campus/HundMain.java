import java.util.Scanner;

public class HundMain {
    public static void main(String[] args) {
        Hund hund1 = new Hund("Bello",2,"Mischling","schwarz");
        Hund hund2 = new Hund("Foxi",4,"Mischling","Feuerrot-Braun");

        Katze katze1 = new Katze("Pezi", 2, "Promenadenmischung");
        katze1.Knurren();

        //Angabenkonforme Loesung ausfuehren
        katze1.hundWeglaufen();

        //Schoenere Loesung ausfuehren
        katze1.vorHundWeglaufen(hund1);
        katze1.vorHundWeglaufen(hund2);

    }

    public static void UebungHund(){
        Hund bello = new Hund("bello",2,"mischling","blond-gepunktet");
        bello.bellen();

        //Eingabe vom User wird erwartet
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte True oder False eingaben:");
        bello.stoeckchenBringen(scanner.nextBoolean());
    }
}

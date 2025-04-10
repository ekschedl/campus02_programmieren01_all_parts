import java.util.Scanner;

public class Hund2Main {
    public static void main(String[] args) {
        Hund2 bello = new Hund2("bello", "chacha", "blond", 2);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Variante 1:Kann Hund Stöckchen bringen? (true oder false)");
        System.out.println(Auto.getCounter());

        boolean kannHund = scanner.nextBoolean();  // Richtige Eingabe lesen
        System.out.println(bello.stoeckhenBringen2(kannHund));  // Rückgabewert ausgeben

        System.out.println(bello.stoeckhenBringen());
    }

}

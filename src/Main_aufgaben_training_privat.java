import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main_aufgaben_training_privat {
    public static void main(String[] args) {

        //Zahlen1bis20();
        //AbSteigendeZahlen();
        //SummeZahlen();
        PrimzahlenZwZweiEingegebenenZahlen();

    }

    //Schreibe ein Programm, das die Zahlen von 1 bis 20 ausgibt.
    public static void Zahlen1bis20() {
        for (int i = 1; i < 21; i++)
            System.out.print(i + " ");

    }

    //    Schreibe ein Programm, das die Zahlen von 10 bis 1 in absteigender Reihenfolge ausgibt
    public static void AbSteigendeZahlen() {
            int i = 10;
            while (i >= 1) {  // Zählt rückwärts von 10 bis 1
                System.out.println(i);
                i--;  // Verringert i um 1 pro Durchlauf
            }

    }

    //    Schreibe ein Programm, das die Summe der ersten 10 natürlichen Zahlen (1 bis 10) berechnet und ausgibt.
    public static void SummeZahlen() {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum+=i;

        } System.out.println("Die Summe der Zahlen von 1 bis 10 ist: " + sum);
    }

//    Schreibe ein Programm, das alle Primzahlen zwischen zwei eingegebenen Zahlen ausgibt.
public static void PrimzahlenZwZweiEingegebenenZahlen() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Number 1: ");
    int num1 = scanner.nextInt();

    System.out.print("Number 2: ");
    int num2 = scanner.nextInt();

    // Определяем минимальное и максимальное значение
    int start = Math.min(num1, num2) + 1;
    int end = Math.max(num1, num2) - 1;

    System.out.println("Numbers between " + num1 + " and " + num2 + ":");

    // Проверяем, есть ли вообще числа между границами
    if (start > end) {
        System.out.println("Gibts keine Zahlen inzwischen");
    } else {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}


}


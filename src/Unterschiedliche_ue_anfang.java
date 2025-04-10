import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Unterschiedliche_ue_anfang {

    public static void main(String[] args) {
        //Array1();
        //Array2();
        //Array3Numbers();
        //Array4Numbers();
        // MultiArray1();
    }

    public static void Array1() {
        String[] zahlen = new String[101];
        int counter = 0;
        for (int i = 2; i <= 200; i += 2) {
            zahlen[i] = "Zahl " + i;
            zahlen[counter] = Integer.toString((i));
            counter++;
        }

    }

    public static void Array2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Personen sind im Unterricht?:");

        int counterOfStudents = scanner.nextInt();
        scanner.nextLine();

        String[] namesOfStudents = new String[counterOfStudents];

        for (int i = 0; i < counterOfStudents; i++) {
            System.out.println("Gib den Namen von Person " + (i + 1) + " ein:");
            namesOfStudents[i] = scanner.nextLine();
        }

        System.out.println("Die Liste von allen Personen im Unterricht:");
        for (int i = 0; i < namesOfStudents.length; i++) {
            System.out.println((i + 1) + " Person: " + namesOfStudents[i]);
        }


        //for(String nameElement : namesOfStudents) {
        // System.out.print(nameElement + " ");
        //}
        System.out.println("Die alphabetisch sortierte Liste:\n");
        //Arrays.sort(namesOfStudents);

        //System.out.println(Arrays.toString(namesOfStudents));
        for (int j = 0; j < namesOfStudents.length - 1; j++) { // Количество проходов
            for (int i = 0; i < namesOfStudents.length - 1 - j; i++) { // Проход по массиву
                if (namesOfStudents[i].compareTo(namesOfStudents[i + 1]) > 0) {
                    // Меняем местами
                    String temp = namesOfStudents[i];
                    namesOfStudents[i] = namesOfStudents[i + 1];
                    namesOfStudents[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(namesOfStudents));
    }

    public static void Array3Numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Zahlen soll ich summieren?:");
        int counterNumbers = scanner.nextInt();

        int sum = 0;
        int i;
        Integer[] arrayOfNumbers = new Integer[counterNumbers];
        for (i = 0; i < counterNumbers; i++) {
            System.out.println("Gib die Zahl " + (i + 1) + " ein:");
            arrayOfNumbers[i] = scanner.nextInt();
            sum = sum + arrayOfNumbers[i];

        }

        System.out.println("Die Summe ist: " + sum);


    }

    public static void Array4Numbers() {
        int[] numbersArray = {2, 3, 5, 8, 10};
        int sum = 0;
        int maxNumber = numbersArray[0];
        int minNumber = numbersArray[0];

        for (int numbersArrayElement : numbersArray) {
            sum = sum + numbersArrayElement;
        }
        System.out.println("Summe von : " + sum);

        for (int numbersArrayElement : numbersArray) {
            if (maxNumber < numbersArrayElement) {
                maxNumber = numbersArrayElement;
            }

            if (minNumber > numbersArrayElement) {
                minNumber = numbersArrayElement;
            }
        }

        System.out.println(Arrays.toString(numbersArray));
        System.out.print("Die größte Zahl: " + maxNumber + ":" + "\nDie kleinste Zahl: " + minNumber);

        int numOfNum = numbersArray.length;
        System.out.println("\nAnzahl der Zahlen im Array: " + numOfNum);
        double media = (double) sum / numOfNum;
        System.out.println("\nDurchschnitt: " + media);

    }

    public static void MultiArray1() {
        int[][] multiArray = new int[3][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie 6 Zahlen ein");
        // Array füllen
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                multiArray[i][j] = scanner.nextInt();

            }
            System.out.println("Zeile " + i + ": " + Arrays.toString(multiArray[i]));

        }

        // Array ausgeben
        System.out.println("Ihr Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(multiArray[i][j] + " ");


            }
            System.out.println(); // Neue Zeile nach jeder Reihe
        }

        int sum = 0;
        System.out.println("Die Summe aller Werte im Array ist: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sum += multiArray[i][j];
            }
        }
        System.out.print(sum);
    }

}






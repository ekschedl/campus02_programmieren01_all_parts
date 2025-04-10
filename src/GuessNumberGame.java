import java.util.Random;

public class GuessNumberGame {

    private int numberToGuess;
    private int numberOfTries;
    private static final int MAX_TRIES = 2;

    public GuessNumberGame() {
        Random random = new Random();
        this.numberToGuess = random.nextInt(5) + 1;
        this.numberOfTries = 0;
    }

    public void tryGuess(int UserGuessAttempt) {
        numberOfTries++;  // Увеличиваем количество попыток
        System.out.println(numberToGuess+ "start");
        if (numberOfTries > MAX_TRIES) {  // Проверяем, если уже превышено количество попыток
            System.out.println("Sie haben Ihre maximalen Versuche überschritten! Die Zahl war " + numberToGuess);
            return;  // Прерываем выполнение метода, если попытки исчерпаны
        }

        if (UserGuessAttempt == numberToGuess) {
            System.out.println(numberToGuess+ " if1");
            System.out.println("Gewonnen: meine Zahl ist " + numberToGuess + ", Versuche: " + numberOfTries);
            return;  // Игра завершена, если угадано, и больше попыток не будет
        } else if (UserGuessAttempt < numberToGuess) {
            System.out.println(numberToGuess+ " if2");
            System.out.println("Versuch: " + numberOfTries +" Meine Zahl ist größer");
        } else {
            System.out.println(numberToGuess+ " if3");
            System.out.println("Versuch: " + numberOfTries+ " Meine Zahl ist kleiner");
        }
        System.out.println(numberToGuess+ " end");

        // Если максимальное количество попыток было использовано и число не угадано
        if (numberOfTries == MAX_TRIES && UserGuessAttempt != numberToGuess) {
            System.out.println("Versuch: " + numberOfTries + " Sie haben Ihre maximalen Versuche überschritten! Die Zahl war " + numberToGuess);
        }
    }

}

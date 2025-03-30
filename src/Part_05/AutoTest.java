package Part_05;

public class AutoTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Camry", 2018);
        Auto auto2 = new Auto("BMW", "M550i", 2020);
        System.out.println("Unöffizielles Rennen auf der Autobahn. Wir haben 2 Autos.");

        // Geschwindigkeit für auto1 setzen
        auto1.setGeschwindigkeit(200);
        System.out.println("Auto1\n" + auto1.toString() + "\n");

        System.out.println("Uppsi, die Polizei steht vorne, muss bremsen!");
        auto1.bremsen(100);
        System.out.println("Geschwindigkeit von Auto1: " + auto1.getGeschwindigkeit() + " km/h\n");

        System.out.println("Die Polizei ist hinter uns, Gas geben!");
        auto1.gasGeben(200);
        System.out.println("Geschwindigkeit von Auto1: " + auto1.getGeschwindigkeit() + " km/h\n");

        // Geschwindigkeit für auto2 setzen
        auto2.setGeschwindigkeit(100);
        System.out.println("Da kommt noch ein Auto ins Sicht:\nAuto2\n" + auto2.toString() + "\n");
        System.out.println("Die Polizei ist eh hinter uns, daher Auto2 auch heftig Gas geben!");
        auto2.gasGeben(300);
        System.out.println("Geschwindigkeit von Auto2: " + auto2.getGeschwindigkeit() + " km/h");
        System.out.println("Geschwindigkeit von Auto1: " + auto1.getGeschwindigkeit() + " km/h\n");
        System.out.println("Wer kommt als erstes zum Ziel?");
        System.out.println("Ojjee, die Polizei steht vorne und hat beide Autos erwischt");

        // Beide Autos auf null bremsen
        auto1.bremsen(auto1.getGeschwindigkeit());
        auto2.bremsen(auto2.getGeschwindigkeit());

        System.out.println("Geschwindigkeit von Auto1 nach bremsen: " + auto1.getGeschwindigkeit() + " km/h");
        System.out.println("Geschwindigkeit von Auto2 nach bremsen: " + auto2.getGeschwindigkeit() + " km/h");
        System.out.println("Beide Autos zahlen Strafe! Gewonnen hat die Polizei :-)");
    }
}

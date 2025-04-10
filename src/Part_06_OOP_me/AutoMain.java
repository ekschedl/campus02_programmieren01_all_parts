public class AutoMain {
    public static void main(String[] args) {
        Auto.ps = 1000;

        Auto auto1 = new Auto("ZWEITE", "123");
        System.out.println("Die Marke des Objektes ist " + auto1.getMarke() + auto1.getPs());
        System.out.println(Auto.getCounter());

        Auto auto2 = new Auto("Mini", "cooper");
        System.out.println(Auto.getCounter());

        Auto auto3 = new Auto("die DRITTE","dritte");
        System.out.println("Die PS auto2 des Objektes ist " + auto2.getPs());

        System.out.println("Die auto3 Marke des Objektes ist " + auto3.getMarke());
        System.out.println("Die PS auto2 des Objektes ist " + auto2.getPs());
        System.out.println("Die PS auto3 des Objektes ist " + auto3.getPs());
        System.out.println(Auto.getCounter());


    }
}

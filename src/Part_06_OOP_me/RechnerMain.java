public class RechnerMain {
    public static void main(String[] args) {
        Rechner rechner = new Rechner();
        System.out.println(rechner.rechne(1, 2, 3));
        System.out.println(rechner.rechne(1.3, 2.3, 3.3));
        System.out.println(rechner.rechne(1, 2));
        System.out.println(rechner.rechne(1.3, 3.3));
        System.out.println(rechner.rechne(false));
    }
}

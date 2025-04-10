package KuchenRezepte;

public class BlueberryPie {

    //Diese Methode dient als Workaround um die Private-Methode von unten auszufuehren
    //und ist von ueberall ausfuehrbar
    public static void NurZumAusfuehren(){
        BakeBlueberryPie();
    }

    //Diese Methode ist nur innerhalb dieser Klasse ausfuehrbar!
    private static void BakeBlueberryPie(){
        System.out.println("Fuer BlueberryPie benoetigen wir Blueberries");
    }
}

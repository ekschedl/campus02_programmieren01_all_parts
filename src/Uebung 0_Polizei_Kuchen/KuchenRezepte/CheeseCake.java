package KuchenRezepte;

public class CheeseCake {

    //Diese Methode ist von ueberall ausfuehrbar
    public static void BakeCheeseCake(){
        System.out.println("Fuer CheeseCake benoetigen wir Cheese");

        //Workaround um die Protected-Methode auszufuehren
        ApplePie.BakeApplePie();
    }
}

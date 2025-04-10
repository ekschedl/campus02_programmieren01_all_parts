public class KatzeMain {

    public static void main(String[] args) {
        Katze katze1 = new Katze("Sonic", "sibirische",3 );
        katze1.knurren();

        katze1.hundWeglaufen();
        Hund2 hund3 = new Hund2("Roi", " Dolmatiner", "weiß-schwarz", 4);
        Hund2 hund4 = new Hund2("Foxi", " Mischling", "rot", 1);

        //zu Variante 2:
        katze1.vonHundWeglaufen(hund3);
        katze1.vonHundWeglaufen(hund4);
    }

}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HundMain {
    public static void main(String[] args) {
        Hund hund1 = new Hund();

     hund1.farbe="rot-braun";
     hund1.rasse= "kleine gav gav";
     hund1.name ="Mr.Gav";
     hund1.geschlecht="maskulin";
     hund1.hatImpungen= true;
     hund1.alterMensch=5;

        hund1.gibTextÜberHundAus();
        hund1.beissen();
        hund1.bellen();
        hund1.tricks();
// weiter machn wie in Folie  user gibt jahre ein und ich rehcne um in hundejahre
    }



}

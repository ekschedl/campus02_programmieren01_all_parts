package Part_05;

import static java.lang.System.*;

public class QuaderApp {
    public static void main(String[] args) {
        //Objekt q von der Klasse Quader erstellen
        Quader q = new Quader(2, 3, 4);

        //info ausgeben, indem man die Methode ausgebenInfo benutzt
        q.ausgebenInfo();

        // skalieren, indem man die Methode skalieren benutzt
        q.skaliere(2);

        //info ausgeben, indem man die Methode ausgebenInfo benutzt
        q.ausgebenInfo();

        // skalieren, indem man die Methode skalieren benutzt
        q.skaliere(4);

        //info ausgeben, indem man die Methode ausgebenInfo benutzt
        q.ausgebenInfo();
    }
}
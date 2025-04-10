public class TeilnehmerMain {

    //Hier wird der gesamte Code ausgefuehrt
    public static void main(String[] args) {
        Teilnehmer t1 = new Teilnehmer("Maxi", 12);

        t1.teilnehmerInfo();
        t1.hatFrageGestellt();
        t1.hatFrageGestellt();
        t1.setAdresse("Hauptstrasse 138, 8010 Graz");
        t1.teilnehmerInfo();

        //Pruefen ob Setter-Methode fuer Counter funktioniert
        t1.setCounter(10);

        System.out.println("Rueckgabe-Counter-Extra: "+t1.rueckabeFragenCounter());
        System.out.println("Gettermethode-Counter: "+t1.getCounter());
    }
}
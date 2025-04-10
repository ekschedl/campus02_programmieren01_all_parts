public class TeilnehmerMain {
    public static void main(String[] args) {
        Teilnehmer frau1 = new Teilnehmer("Marina", 20);

        frau1.teilnehmerInfo();

        frau1.hatFrageGestellt();
        frau1.hatFrageGestellt();
        frau1.teilnehmerInfo();

        Teilnehmer frau2 = new Teilnehmer("Katja", 41);

        frau2.teilnehmerInfo();
    }


}


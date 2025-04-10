public class Hund {
    String rasse;
    String name;
    String farbe;
    String geschlecht;
    boolean hatImpungen;
    int alterMensch;
    int weight;
    public void tricks() {
        System.out.println("ich kann auf dem Ball springen");
    }

    public void bellen() {
        System.out.println("gav - gav - gav - gav ");
    }

    public void beissen() {
        System.out.println("ahmmmm ");
    }

    public void berechneHundAltes() {
        System.out.println(alterMensch * 5);
    }

    public void essen() {
        System.out.println("njam njam");
    }

    public void gibTextÜberHundAus() {
        System.out.println("Hallo, ich bin ein Hund.\nKurz über mich:\n" +
                "meine Rasse: " + rasse + "\n" +
                "mein Name: " + name + "\n" +
                "ich bin: " + weight + " kg schwer\n" +
                "meine Haare: " + farbe + "\n" +
                "ich habe Impfungen: " + hatImpungen + "\n" +
                "mein Menschalter: " + alterMensch + "\n");
    }
    }




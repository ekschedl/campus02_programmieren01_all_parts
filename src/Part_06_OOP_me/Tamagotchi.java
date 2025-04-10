//import java.util.Random;
//import java.util.Scanner;
//
//public class Tamagotchi {
//    int x_Tamagotchi;
//    int y_Tamagotchi;
//    int x_Punkt;
//    int y_Punkt;
//    int futterstand = 10;
//    int punktestand = 0;
//    Scanner scanner = new Scanner(System.in);
//
//    public Tamagotchi(int x_Tamagotchi, int y_Tamagotchi, int x_Punkt, int y_Punkt) {
//        this.x_Tamagotchi = x_Tamagotchi;
//        this.y_Tamagotchi = y_Tamagotchi;
//        this.x_Punkt = x_Punkt;
//        this.y_Punkt = y_Punkt;
//    }
//
//    public int getPunktestand() {
//        return punktestand;
//    }
//
//    public int getFutterstand() {
//        return futterstand;
//    }
//
//
//    public void SpielfeldZeichnen() {
//        int width = 7;
//        int height = 5;
//        String[][] arr = new String[height][width]; // [строки][столбцы]
//        String tamagotchi = "T";
//        String goal = "!";
//        //Random rand = new Random();
//
//        // Überprüfung ob nicht in Rahmen des Felds:
//        if (x_Tamagotchi < 0 || x_Tamagotchi >= width || y_Tamagotchi < 0 || y_Tamagotchi >= height ||
//                x_Punkt < 0 || x_Punkt >= width || y_Punkt < 0 || y_Punkt >= height) {
//            System.out.println("Fehler, x_Tamagotchi und x_Punkt < 5 !  y_Tamagotchi und y_Punkt < 7 !");
//            return;
//        }
//        // Befüllen
//        for (int i = 0; i < height; i++) {
//            for (int j = 0; j < width; j++) {
//                arr[i][j] = "*";
//            }
//        }
//        // Random Koordinaten vom Ziel Zeichnen
//        /*int randX, randY;
//        do {
//            randX = rand.nextInt(x);
//            randY = rand.nextInt(y);
//        } while (randX == 0 && randY == 0);
//          arr[randX][randY] = goal;*/
//        arr[y_Punkt][x_Punkt] = goal;
//
//        // Random Koordinaten tamagotchi Zeichnen
//        /*int randTX, randTY;
//        do {
//            randTX = rand.nextInt(x);
//            randTY = rand.nextInt(y);
//        } while (randTX == 0 && randTY == 0);*/
//        arr[y_Tamagotchi][x_Tamagotchi] = tamagotchi;
//        //Befüllen Feld
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Tamagotchi: (" + x_Tamagotchi + ", " + y_Tamagotchi + ")");
//        System.out.println("Ziel: (" + x_Punkt + ", " + y_Punkt + ")");
//        System.out.println("FutterStand: " + futterstand);
//    }
//
//    public void bewegen(String richtung) {
//        if (richtung.equals("oben") && y_Tamagotchi > 0) {
//            y_Tamagotchi--;
//            futterstand--;
//        } else if (richtung.equals("oben") && y_Tamagotchi == 0) {
//            System.out.println("Achtung, Wand!");
//        } else if (richtung.equals("unten") && y_Tamagotchi < 4) {
//            y_Tamagotchi++;
//            futterstand--;
//        } else if (richtung.equals("unten") && y_Tamagotchi == 4) {
//            System.out.println("Achtung, Wand!");
//        } else if (richtung.equals("links") && x_Tamagotchi > 0) {
//            x_Tamagotchi--;
//            futterstand--;
//        } else if (richtung.equals("links") && x_Tamagotchi == 0) {
//            System.out.println("Achtung, Wand!");
//        } else if (richtung.equals("rechts") && x_Tamagotchi < 6) {
//            x_Tamagotchi++;
//            futterstand--;
//        } else if (richtung.equals("rechts") && x_Tamagotchi == 6) {
//            System.out.println("Achtung, Wand!");
//        }
//    }
//
//    public void spielen() {
//        SpielfeldZeichnen();
//        while (true) {
//
//            System.out.println("Bewegen: oben, unten, links, rechts");
//            String richtung = scanner.nextLine().toLowerCase();
//            bewegen(richtung);
//
//              if (x_Tamagotchi == x_Punkt &&
//                      y_Tamagotchi == y_Punkt) {
//                  System.out.println(" Herzlichen Glückwunsch! Du hast das Ziel erreicht! ");
//                  break;
//              }
//
//              if (futterstand <= 0) {
//                  System.out.println(" Dein Tamagotchi ist verhungert... Spiel vorbei! ");
//                  break;
//              }
//
//        }
//
//    }
//
//}
//
//
//
//
//
//

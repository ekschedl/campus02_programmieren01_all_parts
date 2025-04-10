public class RechteckMain {
    public static void main(String[] args) {

        Rechteck rechteck1 = new Rechteck(2.34, 56.34);


        double rechteck1Height = rechteck1.getHeight();
        double rechteck1Width= rechteck1.getWidth();
        System.out.println(rechteck1Height );
        System.out.println(rechteck1Width );


        double rechteckPar=rechteck1.getParamiter();
        //System.out.printf("Paramiter: %.2f%n", rechteckPar);
        System.out.println("Paramiter: "+ rechteckPar);

        double rechteckAria=rechteck1.getAria();
       // System.out.printf("Aria: %.2f%n", rechteckAria);
        System.out.println("Aria: "+ rechteckAria);



    }

}

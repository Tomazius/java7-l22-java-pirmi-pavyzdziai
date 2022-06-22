public class FuncijuPavyzdys {
    public static void main(String[] args) {

        double ilgis = 15.7;
        double plotis = 2.2;

        double plotas = staciakampioPlotas(ilgis, plotis);
        System.out.println("plotas = " + plotas);

        int x = 5;
        int y = 10;

        int plotasXY = (int)staciakampioPlotas(x, y);
        System.out.println("plotasXY = " + plotasXY);

    }


    //papildomos funkcijos
    public static double staciakampioPlotas(double a, double b){

        return a * b;
    }
}

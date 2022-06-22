public class uzduotis0622u2 {
    public static void main(String[] args) {

        double a = 2;
        double b = 4.7;
        double c = 4.7;

        System.out.println("Trikampio perimetras = " + trikampioPerimetras(a, b, c));
        double perimetras = trikampioPerimetras(a, b, c);
        System.out.println("Trikampio plotas pagal Herono formulę = " + heronoTrikampioPlotas(perimetras, a, b, c));

    }
    public static double trikampioPerimetras (double a, double b, double c){
        return a + b + c;
    }

    public static double heronoTrikampioPlotas (double perimetras, double a, double b, double c){
        double p = perimetras;
       return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}

public class uzduotys0622 {
    public static void main(String[] args) {

    double a = 17.35;
    double b = 18;
    double c = 20.47;
    double d = 16.37;

    int e = 2;
    int f = 4;
    int g = 2;
    double h = 4.1;

        System.out.println("Namo perimetras = " + namoPerimetras(a, b, c, d));
        System.out.println("Namo perimetras = " + namoPerimetras(e, f, g, h));

    }
    public static double namoPerimetras(double a, double b, double c, double d){
        return a + b + c + d;

    }
}

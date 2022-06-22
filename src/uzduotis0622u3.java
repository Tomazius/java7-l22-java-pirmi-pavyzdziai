public class uzduotis0622u3 {
    public static void main(String[] args) {

        double ilgisA = 4;
        double ilgisB = 4;
        double ilgisC = 10;

        System.out.println(patikrinimas(ilgisA, ilgisB, ilgisC));
    }

    public static boolean patikrinimas(double ilgisA, double ilgisB, double ilgisC) {
        if (ilgisA < (ilgisB + ilgisC) && ilgisB < (ilgisA + ilgisC) && ilgisC < (ilgisA + ilgisB)) {
            return true;
        }
        else{
            return false;
        }
    }
}
public class Investition
{
    public static void main(String[] args)
    {
        float total = 14_000;
        System.out.println("Inwestycja początkowa: " + total + " zł");

        total = total + (total * .4F); // total = total * 1.4F; lub total *= 1.4F
        System.out.println("Po pierwszym roku: " + total + " zł");

        total = total - 1500F;
        System.out.println("Po drugim roku: " + total + " zł");

        total = total + (total * .12F);
        System.out.println("Po trzecim roku: " + total + " zł");

//        double a = 14000;
//
//        a = a * 1.4;
//        System.out.println("Wartość inwestycji po pierwszym roku jest równa: " + a);
//
//        a = a - 1500;
//        System.out.println("Wartość inwestycji po drugim roku jest równa: " + a);
//
//        a = a * 1.12;
//        System.out.println("Wartość inwestycji po trzecim roku jest równa: " + a);
    }
}

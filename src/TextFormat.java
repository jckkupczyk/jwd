import java.util.Locale;

public class TextFormat {
    public static void main(String[] args) {

        int accountBalance = 15_005;
        System.out.printf("Saldo: %,d zł%n", accountBalance);

        // #[flags][width][.precision]conversion-charakter
        //S - strings
        //d - decimal integers
        //f - floating points numbers
        //t - date/times
        //n
        //bB - booleans

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf(new Locale("us"), "%.11f%n", pi);
    }
}

public class Vars {
    public static void main(String[] args) {

        String mainProtocol;
        int localAreaCode = 34567;
        int $123 = 123; //nie powiino się takich zmiennych tworzyć
        int _$$$$$_ = 324;

        int a = 6;

        MarsRobot robot;

        String[] streets = {"Floriańska", "Batorego", "Wiślna"};

        final double PI = 3.14;
        final int A;
        A=4;

        final String NAME = "Jakaś nazwa";
        //NAME = "sadfdsg";

        double x = 12e5; //12 * 10 ^ 5 = 1200000
        double y = 3E-3; //3 * 10 ^ -3 = 0,003

        System.out.println(x);
        System.out.println(y);

        double z = 0.000000000000000d;
        System.out.println(z);
        System.out.printf("%.23f",z);

        double aa = 2.432E-17;
        System.out.println(aa);
        System.out.printf("%.20f", aa);
        //System.out.printf(new Locale ( language: "us"), format "%.20f", aa);
        System.out.println();
        //DecimalFormat df = new DecimalFormat( pattern: "#.###############");

        //int jackpot = 3500000;
        int jackpot = 3_500_000;

        //int val = 0b101; //binarnie
        //int val = 0101; //ósemkowo
        int val = 0xFF; //szesnastkowo
        System.out.println(val);

        boolean choosen = true;
        char key = 'a';
        String password = "hasło";
        //String message = "raz\t\tdwa\t\ttrzy";
        String message = "Naucz się szydelkować\u2122";
        System.out.println(message);



        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        int number = 12;

        System.out.println("Nasza liczba to " + number + ".");
        System.out.println("Liczba " + number + "jest o " + (number - 8) + " większa od liczby 8.");
        System.out.println("Jeżeli pomnożymy naszą liczbę przez 5 to otrzymamy wartość" + (5 * number) + ".");

    }

}


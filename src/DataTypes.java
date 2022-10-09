import java.awt.*;

public class DataTypes {
    public static void main(String[] args) {
        //Liczby calkowite
        //byte -1 00000000
        //short -2 00000000 00000000
        //int - 4 00000000 00000000 00000000 00000000
        //long - 8 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        //domyślnie liczby całkowite traktowane są jako int
        System.out.println(23423);
        System.out.println(234234653215461L);

        byte b = -120;
        short s = 31678;
        int i = 1_123_456_789;
        long l = i * b;
        long itemsNumber = 23423687623868473l;
        //char c = 43; // z tabeli ASCI to wynika

        //System.out.println(c);

        //Liczby zmienno przecinkowe
        //float - 4
        //double - 8

        //domyślnie liczby zmiennoprzecinkowe traktowane są jako double
        double a = 34.35;
        float f = 15.12F;
        double d = 223543231568321.3514847684613;

        //typ znakowy
        System.out.println('a');
        System.out.println("a");
        System.out.println("aaa");
        System.out.println('\'');
        System.out.println('\t');

        char c = 64;
        System.out.println(c);
        System.out.println((int)c); //zamiana konwersji

        //typ logiczny
        System.out.println(true);
        System.out.println(false);

        boolean choosen = true;
        boolean q = false;
        System.out.println(q);

        //Ciągi znaków
        String name = "Ala;";
        System.out.println(name);
        System.out.println("Cześć jestem " + name);

        System.out.println();

        System.out.println("tekst" + (1 + 2));
        System.out.println("" + 1 + 2 + "tekst");



    }
}

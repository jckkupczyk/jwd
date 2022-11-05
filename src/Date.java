import java.util.StringTokenizer;

public class Date {

    //Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016)
    // na trzy oddzielne teksty.
    public static void main(String[] args) {
//        System.out.println("Dzień z podanej daty to " + date.substring(0,2));
//        System.out.println("miesiąc z podanej daty to " + date.substring(4,5));
//        System.out.println("Rok z podanej daty to " + date.substring(6,10));
        StringTokenizer str1;
        String quote1 = "29/04/2016";

        str1 = new StringTokenizer(quote1, "/");
        System.out.println("Dzień: " + str1.nextToken());
        System.out.println("Miesiąc: " + str1.nextToken());
        System.out.println("Rok: " + str1.nextToken());






    }

}

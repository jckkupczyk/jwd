import java.util.StringTokenizer;

public class Date {

    //Utwórz program, który zmienia datę urodzin w formacie DD/MM/RRRR (na przykład 29/04/2016)
    // na trzy oddzielne teksty.
    public static void main(String[] args) {

        String birthday = "29/04/2016";
        String day = birthday.substring(0, 2);
        String month = birthday.substring(3, 5);
        String year = birthday.substring(6, 10);


        System.out.println("Urodziny: " + birthday);
        System.out.println("Dzień: " + day);
        System.out.println("Miesiąc: " + month);
        System.out.println("Rok: " + year);


        //podejście z użyciem StringTokenizer
        StringTokenizer st = new StringTokenizer(birthday, "/");

        System.out.println("\n\nUrodziny: " + birthday);
        System.out.println("Dzień: " + st.nextToken());
        System.out.println("Miesiąc: " + st.nextToken());
        System.out.println("Rok: " + st.nextToken());

    }

}

import java.awt.*;

public class RefTester {
    public static void main(String[] args) {

        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1; // mamy tylko jeden obiekt, mamy dwie referencje do tego samego obiektu.

        pt1.x = 200;
        pt1.y = 200;

        System.out.println(pt1);
        System.out.println(pt2);

//        String str1 = "jakiś tekst";
//        System.out.println(str1.getClass().getSimpleName());

//        Object obs = new Object();
//        System.out.println("Teksas" instanceof String); //napis teksas jest instancją klasy string
    }
}

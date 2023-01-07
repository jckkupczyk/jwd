//Utwórz klasę dla czterowymiarowego punktu o nazwie FourDPoint, wg wytycznych:
//        klasa FourDPoint powinna dziedziczyć po klasie Point z pakietu java.awt
//        napisz statyczną metodę create(int x, int y, int z, int t) tworzącą obiekt klasy FourDPoint
//        napisz metodę show() wypisującą wszystkie współrzędne
//        stwórz przykładowy 4-wymiarowy punkt i wyświetl jego współrzędne

import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int t;

    static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint fourDPoint = new FourDPoint();

        fourDPoint.x = x;
        fourDPoint.y = y;
        fourDPoint.z = z;
        fourDPoint.t = t;

        return fourDPoint;
    }
    void show() {
        System.out.println("x wynosi: " + this.x);
        System.out.println("y wynosi: " + this.y);
        System.out.println("z wynosi: " + this.z);
        System.out.println("t wynosi: " + this.t);
    }

    public static void main(String[] args) {
        FourDPoint fourDPoint = create(1, 2, 3, 4);
        fourDPoint.show();
    }

}





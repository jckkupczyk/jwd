import java.math.BigInteger;

public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++)
        {
            System.out.printf("%d ", i);

        }
        System.out.println();

        // silnia
        int number = 6;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("%d! = %s%n", number, factorial);

        //wartość bitów w bajcie
        //128  64  32  16  8  4  2  1
        //0    0    0   0  0  0  0  0

        for (int i = 1, sum = 1; i <= 128; i = i * 2, sum += i){
            System.out.printf("i = %d, sum = %d%n", i, sum);

        }



//        int x = 2;
//        if (x > 2) {
//            System.out.println("Jest większe od 2");
//        } else if (x < 2) {
//            System.out.println("Jest mniejsze od 2");
//        }
//        else {
//            System.out.println("Jest równe 2");
//        }

        //Instrukcja switch:
        //byte i Byte
        //int i Integer
        //char i Character
        //enum
        //String

//        char grade = 'A';
//        switch(grade){
//
//            case 'A':
//                System.out.println("Wspaniale!");
//                break;
//
//            case 'B':
//                System.out.println("Dobrze");
//                break;
//
//            case 'D':
//                System.out.println("Moglo być lepiej");
//                break;
//
//            default:
//                System.out.println("Rozpatrz oszukiwanie");
//        }
//
//        int myScore = 98;
//        int yourScore = 102;
//
//        int ourBestScore = myScore > yourScore ? myScore : yourScore;
//
//        System.out.println(ourBestScore);

        }
    }


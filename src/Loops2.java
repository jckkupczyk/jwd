public class Loops2 {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//
//            if (i % 2 == 1) {
//                continue;
//            }
//            System.out.print(i);
//            System.out.print(" ");
//        }

        out: for (int i = 0; i<10; i++) {
            for ( int j = 0; j < 50; j++) {
                System.out.println(i + " " + j);
                break out;
            }
        }

    }
}

//Napisz program, który wyświetla n razy dowolne słowo. Wartość n oraz słowo powinny być parametrami programu.
//        Przykład:
//        MultiplyWord 3 kajak
//        kajak
//        kajak
//        kajak

public class Test2 {

//    static void multiply(String word, int n){
//        for (int i = 0; i < n; i++) {
//            System.out.println(word);
//        }
//    }

    public static void main(String[] args) {

        String word = "Kolokwium";
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }

}

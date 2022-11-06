//Napisz program, który znajdzie najczęściej występującą cyfrę w tablicy.

public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 5, 8, 9, 2, 5, 2, 1, 2, 5, 5, 5, 5, 5, 5};
        int[] counters = new int [10];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }

        for (int i : counters) {
 //           System.out.println(i);
        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
            }
        }
            System.out.print("Najczęściej występującą cyfrą jest cyfra " + mostFrequent);
            System.out.println(", wystąpia " + counters[mostFrequent] + " razy.");




    }
}

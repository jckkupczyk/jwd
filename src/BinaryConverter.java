public class BinaryConverter {
    public static void main(String[] args) {

        String binary = "110110101011111"; // 1 * 2^0 + ....
        String name = "Agata"; // A=0, g=1, a=2, t=3, a=4
        Long result = 0L;

        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }

        // 1  1  0  1 - liczba binarnie
        // 0  1  2  3 - indeks (i)
        // 3  2  1  0 - (dlugość - 1 - i) - reverseIndex

        for (int i = 0; i < binary.length(); i++) {
            int reverseIndex = binary.length() - 1 - i;
            char c = binary.charAt(reverseIndex);
            int bit = Character.getNumericValue(c);

            //1 * 2^0 + 0 * 2^1 + 1 * 2^2 + 1 * 2^3 = 1 + 0 + 4 + 8 = 13
            result += bit * (int)Math.pow(2, i);
        }
        System.out.println();
        System.out.println("Binarnie " + binary + " to " + result + " dziesiętnie.");
        System.out.println();
        System.out.println(binary);
        System.out.println(Long.toBinaryString(27999));


    }
}

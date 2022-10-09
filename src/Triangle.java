public class Triangle {
    public static void main(String[] args) {
        char copyright = 169; //tablica ASCII copyright w sytemie dziesiętnym
        String space = " ";

        System.out.println(copyright);

        String row1 = space + space + space + copyright;
        String row2 = space + space + copyright + space + copyright;
        String row3 = space + copyright + space + space + space + copyright;
        String row4 = copyright + space + copyright + space + copyright + space + copyright;

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);
        System.out.println(row4);

        System.out.println("   ©");
        System.out.println("  © ©");
        System.out.println(" ©   ©");
        System.out.println("© © © ©");
    }
}

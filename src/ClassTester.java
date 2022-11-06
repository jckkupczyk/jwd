public class ClassTester {
    int i; //zmienna egzemplarza (pole klasy)
    static int j =2; //zmienna klasowa (pole statyczne)

    public int change(){
        int k = 7; //zmienna lokalna, bo zdefiniowana w ciele metody
        return i + (k * j);
    }

    public static void main(String[] args) {

        ClassTester ct = new ClassTester(); //zmienna lokalna
        ct.i = 4;
        ClassTester ct2 = new ClassTester(); //zmienna lokalna
        ct2.i = 9;
        System.out.println(ct.i);
        System.out.println(ct2.i);

//        System.out.println(j);
    }
}



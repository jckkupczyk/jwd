public class ScopeTest {
    int test = 10;

    void printTests(){
        System.out.println("Test: " + test);
        int test = 20;
        System.out.println("Tekst: " + test);
    }

    public static void main (String[] args){
        ScopeTest sc = new ScopeTest();
        sc. printTests();
    }
}

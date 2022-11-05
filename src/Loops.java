public class Loops {
    public static void main(String[] args) {

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

        char grade = 'A';
        switch(grade){

            case 'A':
                System.out.println("Wspaniale!");
                break;

            case 'B':
                System.out.println("Dobrze");
                break;

            case 'D':
                System.out.println("Moglo być lepiej");
                break;

            default:
                System.out.println("Rozpatrz oszukiwanie");
        }

        }
    }


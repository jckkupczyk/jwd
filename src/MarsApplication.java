public class MarsApplication {
    public static void main(String[] arguments) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("Zwiększanie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("----------------");

        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();

        System.out.println("----------------");

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "misja specjalna";
        opportunity.speed = 5;
        opportunity.temperature = 20;
        opportunity.showAttributes();

        System.out.println("----------------");

        System.out.println("Status robota spirit:");
        spirit.checkStatus();
        System.out.println("Status robota opportunity:");
        opportunity.checkStatus();
    }
}

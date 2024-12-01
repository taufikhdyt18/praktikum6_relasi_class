public class MainProgram {
    public static void main(String[] args) {
        Motor motor = new Motor("Honda Supra", "Honda GTR150", 150);

        motor.start();
        motor.run();
        motor.stop();
    }
}

public class Mesin {
    private String tipeMesin;
    private int kapasitas;

    public Mesin(String tipeMesin, int kapasitas) {
        this.tipeMesin = tipeMesin;
        this.kapasitas = kapasitas;
    }

    public void start() {
        System.out.println("Mesin " + tipeMesin + " dengan kapasitas " + kapasitas + " cc telah dinyalakan.");
    }

    public void run() {
        System.out.println("Mesin berjalan.");
    }

    public void stop() {
        System.out.println("Mesin dimatikan.");
    }
}

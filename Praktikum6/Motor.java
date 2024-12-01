public class Motor {
    private String merk;
    private Mesin mesin;

    public Motor(String merk, String tipeMesin, int kapasitas) {
        this.merk = merk;
        this.mesin = new Mesin(tipeMesin, kapasitas);
    }

    public void start() {
        System.out.println("Motor " + merk + " siap dinyalakan.");
        mesin.start();
    }

    public void run() {
        System.out.println("Motor " + merk + " sedang berjalan.");
        mesin.run();
    }

    public void stop() {
        System.out.println("Motor " + merk + " berhenti.");
        mesin.stop();
    }
}

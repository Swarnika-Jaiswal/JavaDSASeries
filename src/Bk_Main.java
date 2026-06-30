public class Bk_Main {
    public static void main(String[] args) {
        Bi_Car c = new Bi_Car("Maruti", "800", 4, 5, "Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();
        System.out.println(c.name);

        Bj_MotorCycle m = new Bj_MotorCycle("Splender", "XLine", 2, "U", "Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }

}

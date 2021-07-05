public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new jaeger();
        Jaeger jaeger2 = new jaeger();

        jaeger1.setModelName("Apex");
        jaeger1.getModelName();
        jaeger1.setSayWhenYouWereLaunched("2035");
        jaeger1.getSayWhenYouWereLaunched();
        jaeger1.setChooseWeapon("Energy Beam");
        jaeger1.getChooseWeapon();
        jaeger2.setModelName("Drone Jaeger");
        jaeger2.getModelName();
        jaeger2.setHeight(3);
        jaeger2.getHeight();

    }
}
public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private String weapon;
    private String yearOfLaunched;
    private float height;
    private float weight;
    private int strength;
    private int armor;

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("moving");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("activated");
    }

    public void activateEnergyBeam() {
        System.out.println("Energy Beam is activated");
    }

    public void setChooseWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void getChooseWeapon() {
        System.out.println(weapon);
    }

    public void setSayWhenYouWereLaunched(String yearOfLaunched) {
        this.yearOfLaunched = yearOfLaunched;
    }

    public void getSayWhenYouWereLaunched() {
        System.out.println(yearOfLaunched);
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void getModelName() {
        System.out.println(modelName);
    }
    
    public void setMark(String mark) {
        this.mark = mark;
        System.out.println(mark);
    }

    public void setOrigin(String origin) {
        this.origin = origin;
        System.out.println(origin);
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void getHeight() {
        System.out.println("Высота: " + height);
    }

    public void setWeight(float weight) {
        this.weight = weight;
        System.out.println(weight);
    }
    
    public void setStrength(int strength)  {
        this.strength = strength;
        System.out.println(strength);
    }
    
    public void setArmor(int armor) {
        this.armor = armor;
        System.out.println(armor);
    }
}
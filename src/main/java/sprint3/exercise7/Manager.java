package sprint3.exercise7;

public class Manager extends Employee {

    private float bonus;
    public Manager(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}

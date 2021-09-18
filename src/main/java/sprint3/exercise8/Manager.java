package sprint3.exercise8;

public class Manager extends Employee {

    private float bonus;
    public Manager(String name, float bonus) {
        super(name);
        this.bonus = bonus;
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

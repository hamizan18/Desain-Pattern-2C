abstract public class Character {
    private String name;
    private int hp;
    private int atkDamage;

    public Character(String name, int hp, int atkDamage) {
        this.name = name;
        this.hp = hp;
        this.atkDamage = atkDamage;
    }

    abstract public void setAtkDamage(int atkDamage);

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getAtkDamage() {
        return atkDamage;
    }
    public void view() {
        System.out.println("Name: " + getName() + "\nHP: " + getHp() + "\nDamage: " + getAtkDamage());
    }
}

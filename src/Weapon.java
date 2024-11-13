import java.util.Random;

public class Weapon extends Item {
    public int MinDamage = 5;
    public int MaxDamage = 25;

    public Weapon(String Name, int MaxDamage) {
        this.Name = Name;
        this.MaxDamage = MaxDamage;
    }
    public int Attack(){
        Random random = new Random();
        int AttackDamage = random.nextInt(MinDamage, MaxDamage+1);

        return AttackDamage;
    }
}

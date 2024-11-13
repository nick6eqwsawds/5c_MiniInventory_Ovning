public class Consumable extends Item {
    public int UsesMax;
    public int UsesCurrent;

    public Consumable(int UsesMax, String Name) {
        this.UsesMax = UsesMax;
        this.Name = Name;

    }

    public void Use(Character target){
        if(UsesCurrent < UsesMax){
            UsesCurrent++;
            target.Hp+=20;
            System.out.println("Your character has healed 20Hp");
            System.out.println("You have "+(UsesMax-UsesCurrent)+" Left");
        } else {
            System.out.println("You have no consumables left ;P");
        }
    }
}

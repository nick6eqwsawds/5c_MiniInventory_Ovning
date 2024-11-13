import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> Items = new ArrayList<>();

    public Inventory() {
        Items.add(new Weapon("MegaDomeBlaster", 10));
        Items.add(new Consumable(10,"HealingPotion" ));
    }

    public void Display(){
        for(Item item : Items){
            System.out.println(item.Name);
        }
    }
}

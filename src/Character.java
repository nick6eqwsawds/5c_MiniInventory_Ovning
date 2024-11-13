import java.util.Scanner;

public class Character {
    public int Hp;
    public String Name;
    public Inventory Backpack;

    public Character(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is charcater name?\nName:");
        Name = scanner.nextLine();
        Backpack = new Inventory();
    }

}

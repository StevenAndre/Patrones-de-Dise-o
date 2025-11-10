package composite;

public class TestComposite {

    public static void main(String[] args) {
        BaseItem inventary= new Bag("inventary");
        BaseItem bagCoins= new Bag("bag Coins");
        BaseItem bagPotions= new Bag("Bag Potions");

        BaseItem coins= new Item("coins",2);
        bagCoins.add(coins);
        BaseItem magicPotion= new Item("magic potion",2);
        BaseItem healthPotion= new Item("health Potions",3);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        BaseItem blade= new Item("blade",2);
        BaseItem shield= new Item("shield",2);
        inventary.add(bagCoins);
        inventary.add(bagPotions);
        inventary.add(blade);
        inventary.add(shield);

        System.out.println("Inventary total values:" +inventary.getValue());

    }

}

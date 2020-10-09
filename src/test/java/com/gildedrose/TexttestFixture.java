package com.gildedrose;

/**
 * TexttestFixture est la classe permettant l'exécution du programme, c'est une sorte de main.
 *
 * @author PRIVAT Nicolas_VOQUER Romain
 * @version 1.0
 */
public class TexttestFixture {
  /**
   * Méthode principale de la classe TextTestFixture. Elle instancie les données.
   *
   * @param args
   *            Les arguments passés en lançant le programme, ici le nombre de jour pendant lesquels s'exécute la gestion de la taverne.
   */

  public static void main(String[] args) {
    System.out.println("OMGHAI!");

    Item[] items = new Item[] {
      new Item("+5 Dexterity Vest", 10, 20), //
      new Item("Aged Brie", 2, 0), //
      new Item("Elixir of the Mongoose", 5, 7), //
      new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
      // this conjured item does not work properly yet
      new Item("Conjured Mana Cake", 3, 8),
      new Item("Conjured Mana Cake", -3, 8),
      new Item("Conjured Mana Cake", 1, 5)
    };
    GildedRose app = new GildedRose();
    app.setItems(items);

    //Erreur PMD, cette variable est redéfinie qu'en cas de passage en paramètre d'une valeur
    int days = 4;
    //FIXME le assert n'a aucun impact sur le code
    if (args.length > 0) {
      assert Integer.parseInt(args[0]) <= 0 :
        "La durée de vie de la taverne ne peut pas être négative.";
      days = Integer.parseInt(args[0]) + 1;
    }
    System.out.println("days : "+days);
    
    for (int i = 0; i < days; i++) {
      System.out.println("-------- day " + i + " --------");
      System.out.println("name, sellIn, quality");
      for (Item item : items) {
        System.out.println(item);
      }
      System.out.println();
      app.updateQuality();
    }
  }
}

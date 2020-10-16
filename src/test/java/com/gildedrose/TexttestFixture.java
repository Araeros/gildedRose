package com.gildedrose;

import static java.lang.System.exit;

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
      new Item("+5 Dexterity Vest", 10, 20),
      new Item("Aged Brie", 2, 0),
      new Item("Elixir of the Mongoose", 5, 7),
      new Item("Sulfuras, Hand of Ragnaros", 0, 80),
      new Item("Sulfuras, Hand of Ragnaros", -1, 80),
      new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
      new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
      new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
      new Item("Conjured Mana Cake", 3, 8),
      new Item("Conjured Mana Cake", -3, 8),
      new Item("Conjured Mana Cake", 1, 5)
    };
    GildedRose app = new GildedRose();
    app.setItems(items);

    //Erreur PMD, cette variable est redéfinie qu'en cas de passage en paramètre d'une valeur
    int days = 4;
    days = getDays(args, days);

    initialiserTaverne(items, app, days);
  }

  private static void initialiserTaverne(Item[] items, GildedRose app, int days) {
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

  private static int getDays(String[] args, int days) {
    if (args.length > 0) {
      try {
        testArgument(args);
      }catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
        exit(1);
      }
      days = Integer.parseInt(args[0]) + 1;
    }
    return days;
  }

  private static void testArgument(String[] args) throws IllegalArgumentException{
    if (Integer.parseInt(args[0]) <= 0) {
      throw new IllegalArgumentException("La durée de vie de la taverne ne peut pas être négative.");
    }
  }
}

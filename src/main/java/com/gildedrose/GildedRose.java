package com.gildedrose;

/**
 * GildedRose est la classe permettant de représenter la taverne.
 *
 * @author PRIVAT Nicolas_VOQUER Romain
 * @version 1.0
 */

class GildedRose {

  //Variable et méthodes statiques
  static final int MINQUALITY = 0;
  static final int MAXQUALITY = 50;

  private transient Item[] items; // Cette variable ne sera pas sérialisée

  /**
   * Constructeur de la classe objet.
   *
   * @param nom
   *            le nom de l'objet.
   * @param date
   *            le SellIn de l'objet.
   * @param qualite
   *            la qualité de l'objet.
   */

  GildedRose(Item[] listItems) {
    this.items = listItems;
  }

  /**
   * Met à jour la qualité du 'Aged Brie'.
   *
   * @param i
   *            l'index de l'objet auquel on veut modifier la qualité.
   */

  void agedBrieQuality(int i) {
    if (items[i].getQuality() < MAXQUALITY) {
      items[i].setQuality(items[i].getQuality() + 1);
    }
    items[i].setSellIn(items[i].getSellIn() - 1);
    //Pour éviter les "Si" imbriqués on utilise une condition &&
    if (items[i].getSellIn() < 0 && items[i].getQuality() < MAXQUALITY) {
      items[i].setQuality(items[i].getQuality() + 1);
    }
  }

  /**
   * Met à jour la qualité du 'Sulfuras, Hand of Ragnaros'.
   *
   * @param i
   *            l'index de l'objet auquel on veut modifier la qualité.
   */

  void ragnarosQuality(int i) {

  }

  /**
   * Met à jour la qualité du 'Backstage passes to a TAFKAL80ETC concert'.
   *
   * @param i
   *            l'index de l'objet auquel on veut modifier la qualité.
   */

  void backstageQuality(int i) {
    if (items[i].getQuality() < MAXQUALITY) {
      items[i].setQuality(items[i].getQuality() + 1);
    }
    if (items[i].getSellIn() < 11 && items[i].getQuality() < MAXQUALITY) {
      items[i].setQuality(items[i].getQuality() + 1);
    }
    if (items[i].getSellIn() < 6 && items[i].getQuality() < MAXQUALITY) {
      items[i].setQuality(items[i].getQuality() + 1);
    }
    items[i].setSellIn(items[i].getSellIn() - 1);
    if (items[i].getSellIn() < 0) {
      items[i].setQuality(0);
    }
  }

  /**
   * Met à jour la qualité de tous les objets non traités dans les autres cas.
   *
   * @param i
   *            l'index de l'objet auquel on veut modifier la qualité.
   */

  void basicObjectQuality(int i) {
    if (items[i].getQuality() > MINQUALITY) {
      items[i].setQuality(items[i].getQuality() - 1);
      items[i].setSellIn(items[i].getSellIn() - 1);
    }
    if (items[i].getSellIn() < 0 && items[i].getQuality() > MINQUALITY) {
      items[i].setQuality(items[i].getQuality() - 1);
    }
  }

  /**
   * Met à jour la qualité dues objets 'Conjured'.
   *
   * @param i
   *            l'index de l'objet auquel on veut modifier la qualité.
   */

  void conjuredObjectQuality(int i) {
    //Les items 'Conjured' voient leur qualité se dégrader 2 fois plus vite que la normale.
    if (items[i].getQuality() > MINQUALITY + 1) {
      items[i].setQuality(items[i].getQuality() - 2);
    } else if (items[i].getQuality() == MINQUALITY + 1) {
      items[i].setQuality(items[i].getQuality() - 1);
    }
    items[i].setSellIn(items[i].getSellIn() - 1);
    if (items[i].getSellIn() < 0 && items[i].getQuality() > MINQUALITY + 1) {
      items[i].setQuality(items[i].getQuality() - 2);
    } else if (items[i].getSellIn() < 0 && items[i].getQuality() == MINQUALITY + 1) {
      items[i].setQuality(items[i].getQuality() - 1);
    }
  }

  /**
   * Met à jour la qualité des objets de la taverne.
   *
   */

  void updateQuality() {
    for (int i = 0; i < items.length; i++) {
      //Switch permettant d'effectuer un premier tri en fonction du nom de l'objet
      // -> Simplifie le code en cadrant les résultats
      switch (items[i].getName()) {
        case "Aged Brie":
          agedBrieQuality(i);
          break;
          //On note ce cas même si on effectue aucunes actions pour éviter le case default
        case "Sulfuras, Hand of Ragnaros":
          ragnarosQuality(i);
          break;

        case "Backstage passes to a TAFKAL80ETC concert":
          backstageQuality(i);
          break;
        //Ce cas permettra de gérer tous les objets 'classiques et Conjured'
        // qui ne sont pas pris en compte dans les cas précédents
        default :
          //On fait un premier tri en gérant les objets conjured
          if (items[i].getName().contains("Conjured")) {
            conjuredObjectQuality(i);
          } else {
            basicObjectQuality(i);
          }
          break;
      }
    }
  }

  //Accesseurs des variables de gildedRose
  /**
   * Renvoie la liste d'objets.
   *
   */

  Item[] getItems() {
    return this.items;
  }

  /**
   * Met à jour la liste des objets.
   *
   * @param listItems
   *            la liste d'objets qu'on veut appliquer à notre taverne.
   */

  void setItems(Item[] listItems) {
    this.items = listItems;
  }
}

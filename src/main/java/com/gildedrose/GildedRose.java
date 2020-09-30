package com.gildedrose;

class GildedRose {

  //Variable et méthodes statiques
  static final int MINQUALITY = 0;
  static final int MAXQUALITY = 50;

  private transient Item[] items;
  /*On a choisit de gérer les limites de la qualité par des constantes pour ne
  pas avoir à les changer dans chaques fonctions en cas de modifications */
  GildedRose(Item[] listItems) {
    this.items = listItems;
  }
  //Dans le cas ou items[i].name == "Aged Brie"
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

  void ragnarosQuality(int i) {

  }

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

  void basicObjectQuality(int i) {
    if (items[i].getQuality() > MINQUALITY) {
      items[i].setQuality(items[i].getQuality() - 1);
      items[i].setSellIn(items[i].getSellIn() - 1);
    }
    if (items[i].getSellIn() < 0 && items[i].getQuality() > MINQUALITY) {
      items[i].setQuality(items[i].getQuality() - 1);
    }
  }

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
  Item[] getItems() {
    return this.items;
  }

  void setItems(Item[] listItems) {
    this.items = listItems;
  }
}

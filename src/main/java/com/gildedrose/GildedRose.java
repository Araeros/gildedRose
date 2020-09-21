package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality(){
        for (int i = 0; i < items.length; i++) {
            //Switch permettant d'effectuer un premier tri en fonction du nom de l'objet -> Simplifie le code en cadrant les résultats
            switch (items[i].name) {
                case "Aged Brie":
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }

                    items[i].sellIn = items[i].sellIn - 1;
                    //Pour éviter les "Si" imbriqués on utilise une condition &&
                    if(items[i].sellIn<0 && items[i].quality<50) {
                        items[i].quality = items[i].quality + 1;
                    }
                    break;

                //On note ce cas même si on effectue aucunes actions pour éviter le case default
                case "Sulfuras, Hand of Ragnaros":
                    break;

                case "Backstage passes to a TAFKAL80ETC concert":
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                    if (items[i].sellIn < 11 && items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                    if (items[i].sellIn < 6 && items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }

                    items[i].sellIn = items[i].sellIn - 1;

                    if(items[i].sellIn<0) {
                        items[i].quality = 0;
                    }
                    break;

                default :
                    if(items[i].quality>0) {
                        items[i].quality = items[i].quality - 1;
                    }
                    items[i].sellIn = items[i].sellIn - 1;

                    if(items[i].sellIn<0 && items[i].quality>0) {
                        items[i].quality = items[i].quality - 1;
                    }
            }
        }
    }
}
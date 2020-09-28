package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;


    static final int maxQuality = 50;
    static final int minQuality = 0;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


    //Dans le cas ou this.name == "Aged Brie"
    public void agedBrieQuality(){
        if (this.quality < maxQuality)
        {
            this.quality = this.quality + 1;
        }

        this.sellIn = this.sellIn - 1;
        //Pour éviter les "Si" imbriqués on utilise une condition &&
        if(this.sellIn<0 && this.quality<maxQuality)
        {
            this.quality = this.quality + 1;
        }
    }

    public void ragnarosQuality(){

    }

    public void backstageQuality(){
       if (this.quality < maxQuality)
        {
            this.quality = this.quality + 1;
        }
        if (this.sellIn < 11 && this.quality < maxQuality)
        {
            this.quality = this.quality + 1;
        }
        if (this.sellIn < 6 && this.quality < maxQuality)
        {
            this.quality = this.quality + 1;
        }
        this.sellIn = this.sellIn - 1;
        if(this.sellIn<0) 
        {
            this.quality = 0;
        }
    }

    public void basicObjectQuality(){
        if(this.quality>minQuality)
        {
            this.quality = this.quality - 1;
        }
        this.sellIn = this.sellIn - 1;
        if(this.sellIn<0 && this.quality>minQuality)
        {
            this.quality = this.quality - 1;
        }
    }

    public void conjuredObjectQuality(){
        //Les items 'Conjured' voient leur qualité se dégrader 2 fois plus vite que la normale.
        if(this.quality>minQuality+1)
        {
            this.quality = this.quality - 2;
        }else if (this.quality == minQuality+1)
        {
            this.quality = this.quality - 1;
        }
        this.sellIn = this.sellIn - 1;
        if(this.sellIn<0 && this.quality>minQuality+1)
        {
            this.quality = this.quality - 2;
        }else if (this.sellIn<0 && this.quality == minQuality+1)
        {
            this.quality = this.quality - 1;
        }
    }

    public void updateQuality(){
       
        //Switch permettant d'effectuer un premier tri en fonction du nom de l'objet -> Simplifie le code en cadrant les résultats
        switch (this.name) {
            case "Aged Brie":
                agedBrieQuality();
                break;

            //On note ce cas même si on effectue aucunes actions pour éviter le case default
            case "Sulfuras, Hand of Ragnaros":
                ragnarosQuality();
                break;

            case "Backstage passes to a TAFKAL80ETC concert":
                backstageQuality();
                break;

            //Ce cas permettra de gérer tous les objets 'classiques et Conjured' qui ne sont pas pris en compte dans les cas précédents
            default :
                //On fait un premier tri en gérant les objets conjured
                if (this.name.contains("Conjured")){
                    conjuredObjectQuality();
                } else {
                    basicObjectQuality();
                }
        }
    }


   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

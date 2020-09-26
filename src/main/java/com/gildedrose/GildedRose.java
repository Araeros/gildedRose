package com.gildedrose;

class GildedRose {
	Item[] items;
	/*
	On a choisit de gérer la qualité par des constantes pour ne
    pas avoir à les changer dans chaques fonctions en cas de modifications
    */
	static final int maxQuality = 50;
	static final int minQuality = 0;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	//Dans le cas ou items[i].name == "Aged Brie"
	public void agedBrieQuality(int i){
		if (items[i].quality < maxQuality)
		{
            items[i].quality = items[i].quality + 1;
        }

        items[i].sellIn = items[i].sellIn - 1;
        //Pour éviter les "Si" imbriqués on utilise une condition &&
        if(items[i].sellIn<0 && items[i].quality<maxQuality)
        {
            items[i].quality = items[i].quality + 1;
        }
    }

	public void ragnarosQuality(int i){

	}

	public void backstageQuality(int i){
		/*
            On a choisi de mettre les 'Si' à la suite les uns des autres pour éviter des imbrications et améliorer la lisibilité,
            effectivement cela duplique légérement le code mais dans une méthode de cette taille là je pense que la différence est infime.
            Comme en plus la méthode ajoute de la qualité plusieurs fois il fallait vérifier à chaques fois si elle ne dépassait pas 50.
        */
		if (items[i].quality < maxQuality)
		{
        	items[i].quality = items[i].quality + 1;
        }
        if (items[i].sellIn < 11 && items[i].quality < maxQuality)
        {
            items[i].quality = items[i].quality + 1;
        }
        if (items[i].sellIn < 6 && items[i].quality < maxQuality)
        {
            items[i].quality = items[i].quality + 1;
        }
        items[i].sellIn = items[i].sellIn - 1;
        if(items[i].sellIn<0) 
        {
            items[i].quality = 0;
        }
	}

	public void basicObjectQuality(int i){
		if(items[i].quality>minQuality)
		{
            items[i].quality = items[i].quality - 1;
        }
        items[i].sellIn = items[i].sellIn - 1;
        if(items[i].sellIn<0 && items[i].quality>minQuality)
        {
            items[i].quality = items[i].quality - 1;
        }
	}

	public void conjuredObjectQuality(int i){
	    //Les items 'Conjured' voient leur qualité se dégrader 2 fois plus vite que la normale.
	    if(items[i].quality>minQuality+1)
        {
            items[i].quality = items[i].quality - 2;
        }else if (items[i].quality == minQuality+1)
        {
            items[i].quality = items[i].quality - 1;
        }
        items[i].sellIn = items[i].sellIn - 1;
        if(items[i].sellIn<0 && items[i].quality>minQuality+1)
        {
            items[i].quality = items[i].quality - 2;
        }else if (items[i].sellIn<0 && items[i].quality == minQuality+1)
        {
            items[i].quality = items[i].quality - 1;
        }
    }

    public void updateQuality(){
        for (int i = 0; i < items.length; i++) {
            //Switch permettant d'effectuer un premier tri en fonction du nom de l'objet -> Simplifie le code en cadrant les résultats
            switch (items[i].name) {
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

                //Ce cas permettra de gérer tous les objets 'classiques et Conjured' qui ne sont pas pris en compte dans les cas précédents
                default :
                    //On fait un premier tri en gérant les objets conjured
                    if (items[i].name.contains("Conjured")){
                        conjuredObjectQuality(i);
                    } else {
                        basicObjectQuality(i);
                    }
            }
        }
    }
}
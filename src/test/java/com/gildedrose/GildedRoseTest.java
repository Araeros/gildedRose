package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

// ceci est un test
class GildedRoseTest {

    @Test
    void elixirPositiveQualityPositiveSellIn() {
    	int quality = 6;
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-1));   
    }
    
    @Test
    void elixirNegativeQualityPositiveSellIn() {
    	int quality = -1;
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }

    @Test
    void elixirPositiveQualityNegativeSellIn() {
        int quality = 10;
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",-10,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-2));   
    }

    @Test
    void elixirLimitedQualityNegativeSellIn() {
        int quality = 1;
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",-10,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));
    }

    @Test
    void elixirNegativeQualityNegativeSellIn() {
        int quality = -1;
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }

    @Test
    void elixirLimitedQualityPositiveSellIn() {
        int quality = 10;
        Item[] items = new Item[] {new Item("Elixir of the Mongoose",10,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-1));   
    }
    
    @Test
    void brie_quality_update() {
    	int quality = 60;
        Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }
    
    @Test
    void brie_quality_update_2() {
    	int quality = 49;
        Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void brie_quality_update_3() {
        int quality = 6;
        Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+2));   
    }

    @Test
    void brie_quality_update_4() {
        int quality = 60;
        Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }

    @Test
    void brie_quality_update_5() {
        int quality = 49;
        Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void brie_quality_update_6() {
        int quality = 6;
        Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void brie_quality_update_7() {
        int quality = -6;
        Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));
    }

    @Test
    void brie_quality_update_8() {
        int quality = -6;
        Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+2));
    }
    
    @Test
    void passes_quality_update() {
    	int quality = 60;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));   
    }
    
    @Test
    void passes_quality_update_2() {
    	int quality = 50;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-10,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));   
    }
    
    @Test
    void passes_quality_update_3() {
    	int quality = 49;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-10,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));   
    }
    
    @Test
    void passes_quality_update_4() {
    	int quality = 6;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(0));   
    }

    @Test
    void passes_quality_update_5() {
        int quality = 100;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }

    @Test
    void passes_quality_update_6() {
        int quality = 100;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",6,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }

    @Test
    void passes_quality_update_7() {
        int quality = 100;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }

    @Test
    void passes_quality_update_8() {
        int quality = 49;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void passes_quality_update_9() {
        int quality = 49;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",6,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void passes_quality_update_10() {
        int quality = 49;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void passes_quality_update_11() {
        int quality = 48;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+2));   
    }

    @Test
    void passes_quality_update_12() {
        int quality = 48;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",7,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+2));   
    }

    @Test
    void passes_quality_update_13() {
        int quality = 48;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void passes_quality_update_14() {
        int quality = 4;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+3));   
    }

    @Test
    void passes_quality_update_15() {
        int quality = 4;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",8,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+2));   
    }

    @Test
    void passes_quality_update_16() {
        int quality = 4;
        Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality+1));   
    }

    @Test
    void sulfuras_quality_update() {
        int quality = 40;
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));   
    }

    @Test
    void sulfuras_quality_update_2() {
        int quality = 40;
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void sulfuras_quality_update_3() {
        int quality = -10;
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void sulfuras_quality_update_4() {
        int quality = -10;
        Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void sword_quality_update() {
        int quality = 6;
        Item[] items = new Item[] {new Item("Barbarian Sword",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-1));
    }
    @Test
    void sword_quality_update_2() {
        int quality = 6;
        Item[] items = new Item[] {new Item("Barbarian Sword",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-2));
    }
    @Test
    void sword_quality_update_3() {
        int quality = -6;
        Item[] items = new Item[] {new Item("Barbarian Sword",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }
    @Test
    void sword_quality_update_4() {
        int quality = -6;
        Item[] items = new Item[] {new Item("Barbarian Sword",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }
    @Test
    void sword_quality_update_5() {
        int quality = 0;
        Item[] items = new Item[] {new Item("Barbarian Sword",1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }
    @Test
    void sword_quality_update_6() {
        int quality = 0;
        Item[] items = new Item[] {new Item("Barbarian Sword",-1,quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void map_quality_update() {
        int quality = 0;
        Item[] items = new Item[]{new Item("Enchanted Treasure Map", -1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void map_quality_update_2() {
        int quality = 0;
        Item[] items = new Item[]{new Item("Enchanted Treasure Map", 1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void map_quality_update_3() {
        int quality = 30;
        Item[] items = new Item[]{new Item("Enchanted Treasure Map", -1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-2));
    }

    @Test
    void map_quality_update_4() {
        int quality = 30;
        Item[] items = new Item[]{new Item("Enchanted Treasure Map", 1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-1));
    }

    @Test
    void map_quality_update_5() {
        int quality = -10;
        Item[] items = new Item[]{new Item("Enchanted Treasure Map", -1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void map_quality_update_6() {
        int quality = -10;
        Item[] items = new Item[]{new Item("Enchanted Treasure Map", 1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void cake_quality_update() {
        int quality = 0;
        Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void cake_quality_update_2() {
        int quality = 0;
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void cake_quality_update_3() {
        int quality = 30;
        Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-2));
    }

    @Test
    void cake_quality_update_4() {
        int quality = 30;
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality-1));
    }

    @Test
    void cake_quality_update_5() {
        int quality = -10;
        Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

    @Test
    void cake_quality_update_6() {
        int quality = -10;
        Item[] items = new Item[]{new Item("Conjured Mana Cake", 1, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(quality));
    }

}

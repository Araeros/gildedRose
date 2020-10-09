package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * GildedRoseTest est la classe permettant d'effectuer tous les test du programme.
 *
 * @author PRIVAT Nicolas_VOQUER Romain
 * @version 1.0
 */
class GildedRoseTest {

  @Test
  void elixirPositiveQualityPositiveSellIn() {
    int quality = 6;
    Item[] items = new Item[] {new Item("Elixir of the Mongoose",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-1));
  }

  @Test
  void elixirNegativeQualityPositiveSellIn() {
    int quality = -1;
    Item[] items = new Item[] {new Item("Elixir of the Mongoose",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void elixirPositiveQualityNegativeSellIn() {
    int quality = 10;
    Item[] items = new Item[] {new Item("Elixir of the Mongoose",-10,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-2));
  }

  @Test
  void elixirLimitedQualityNegativeSellIn() {
    int quality = 1;
    Item[] items = new Item[] {new Item("Elixir of the Mongoose",-10,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));
  }

  @Test
  void elixirNegativeQualityNegativeSellIn() {
    int quality = -1;
    Item[] items = new Item[] {new Item("Elixir of the Mongoose",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void elixirLimitedQualityPositiveSellIn() {
    int quality = 10;
    Item[] items = new Item[] {new Item("Elixir of the Mongoose",10,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-1));
  }

  @Test
  void briePositiveQualityNegativeSellIn() {
    int quality = 60;
    Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void brieLimitedQualityNegativeSellIn() {
    int quality = 49;
    Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void brieZeroQualityNegativeSellIn() {
    int quality = 0;
    Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+2));
  }

  @Test
  void briePositiveQualityPositiveSellIn() {
    int quality = 60;
    Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void brieLimitedQualityPositiveSellIn() {
    int quality = 49;
    Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void brieZeroQualityPositiveSellIn() {
    int quality = 0;
    Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void brieNegativeQualityPositiveSellIn() {
    int quality = -6;
    Item[] items = new Item[] {new Item("Aged Brie",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void brieNegativeQualityNegativeSellIn() {
    int quality = -6;
    Item[] items = new Item[] {new Item("Aged Brie",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+2));
  }

  @Test
  void passesPositiveQualityNegativeSellIn() {
    int quality = 60;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));
  }

  @Test
  void passesHighLimitedQualityNegativeSellIn() {
    int quality = 50;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-10,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));
  }

  @Test
  void passesLimitedQualityNegativeSellIn() {
    int quality = 49;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-10,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));
  }

  @Test
  void passesZeroQualityNegativeSellIn() {
    int quality = 0;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));
  }

  @Test
  void passesHighQualityPositiveSellIn() {
    int quality = 100;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void passesHighQualityMiddlePositiveSellIn() {
    int quality = 100;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",6,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void passesHighQualityHighPositiveSellIn() {
    int quality = 100;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void passesLimitedQualityPositiveSellIn() {
    int quality = 49;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void passesLimitedQualityMiddlePositiveSellIn() {
    int quality = 49;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",6,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void passesLimitedQualityHighPositiveSellIn() {
    int quality = 49;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void passesLowLimitedQualityPositiveSellIn() {
    int quality = 48;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+2));
  }

  @Test
  void passesLowLimitedQualityMiddlePositiveSellIn() {
    int quality = 48;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",7,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+2));
  }

  @Test
  void passesLowLimitedQualityHighPositiveSellIn() {
    int quality = 48;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void passesPositiveQualityPositiveSellIn() {
    int quality = 4;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",2,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+3));
  }

  @Test
  void passesPositiveQualityMiddlePositiveSellIn() {
    int quality = 4;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",8,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+2));
  }

  @Test
  void passesPositiveQualityHighPositiveSellIn() {
    int quality = 4;
    Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert",12,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality+1));
  }

  @Test
  void sulfurasPositiveQualityPositiveSellIn() {
    int quality = 40;
    Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void sulfurasPositiveQualityNegativeSellIn() {
    int quality = 40;
    Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void sulfurasNegativeQualityPositiveSellIn() {
    int quality = -10;
    Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void sulfurasNegativeQualityNegativeSellIn() {
    int quality = -10;
    Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void sulfurasZeroQualityNegativeSellIn() {
    int quality = 0;
    Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void sulfurasZeroQualityPositiveSellIn() {
    int quality = 0;
    Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void swordPositiveQualityPositiveSellIn() {
    int quality = 6;
    Item[] items = new Item[] {new Item("Barbarian Sword",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-1));
  }

  @Test
  void swordPositiveQualityNegativeSellIn() {
    int quality = 6;
    Item[] items = new Item[] {new Item("Barbarian Sword",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-2));
  }

  @Test
  void swordNegativeQualityPositiveSellIn() {
    int quality = -6;
    Item[] items = new Item[] {new Item("Barbarian Sword",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void swordNegativeQualityNegativeSellIn() {
    int quality = -6;
    Item[] items = new Item[] {new Item("Barbarian Sword",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void swordZeroQualityPositiveSellIn() {
    int quality = 0;
    Item[] items = new Item[] {new Item("Barbarian Sword",1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }
  @Test
  void swordZeroQualityNegativeSellIn() {
    int quality = 0;
    Item[] items = new Item[] {new Item("Barbarian Sword",-1,quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void mapZeroQualityNegativeSellIn() {
    int quality = 0;
    Item[] items = new Item[]{new Item("Enchanted Treasure Map", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void mapZeroQualityPositiveSellIn() {
    int quality = 0;
    Item[] items = new Item[]{new Item("Enchanted Treasure Map", 1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void mapPositiveQualityNegativeSellIn() {
    int quality = 30;
    Item[] items = new Item[]{new Item("Enchanted Treasure Map", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-2));
  }

  @Test
  void mapPositiveQualityPositiveSellIn() {
    int quality = 30;
    Item[] items = new Item[]{new Item("Enchanted Treasure Map", 1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-1));
  }

  @Test
  void mapNegativeQualityNegativeSellIn() {
    int quality = -10;
    Item[] items = new Item[]{new Item("Enchanted Treasure Map", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void mapNegativeQualityPositiveSellIn() {
    int quality = -10;
    Item[] items = new Item[]{new Item("Enchanted Treasure Map", 1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void conjuredZeroQualityNegativeSellIn() {
    int quality = 0;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void conjuredZeroQualityPositiveSellIn() {
    int quality = 0;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", 1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void conjuredPositiveQualityNegativeSellIn() {
    int quality = 30;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-4));
  }

  @Test
  void conjuredPositiveQualityPositiveSellIn() {
    int quality = 30;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", 1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality-2));
  }

  @Test
  void conjuredNegativeQualityNegativeSellIn() {
    int quality = -10;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void conjuredNegativeQualityPositiveSellIn() {
    int quality = -10;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", 1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(quality));
  }

  @Test
  void conjuredHighLimitedQualityNegativeSellIn() {
    int quality = 3;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0)); //Quality-3
  }

  @Test
  void conjuredMiddleLimitedQualityNegativeSellIn() {
    int quality = 2;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));//Quality-2
  }

  @Test
  void conjuredLowLimitedQualityNegativeSellIn() {
    int quality = 1;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", -1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));//Quality-1
  }

  @Test
  void conjuredLimitedQualityPositiveSellIn() {
    int quality = 1;
    Item[] items = new Item[]{new Item("Conjured Mana Cake", 1, quality)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.getItems()[0].getQuality(), is(0));//Quality-1
  }

}

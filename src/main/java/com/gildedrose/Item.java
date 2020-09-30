package com.gildedrose;

/**
 * Item est la classe permettant la représentation d'un objet.
 *
 * @author PRIVAT Nicolas & VOQUER Romain
 * @version 1.0
 */

public class Item {
  //
  private transient String name;
  private transient  int sellIn;
  private transient int quality;

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
  public Item(String nom, int date, int qualite) {
    this.name = nom;
    this.sellIn = date;
    this.quality = qualite;
  }

  //Accesseurs
  /**
   * Met à jour le nom d'un objet.
   *
   * @param nom
   *            le nouveau nom de l'objet.
   */
  void setName(String nom) {
    this.name = nom;
  }

  /**
   * Met à jour le SellIn d'un objet.
   *
   * @param dateP
   *            le nouveau SellIn de l'objet.
   */
  void setSellIn(int dateP) {
    this.sellIn = dateP;
  }

  /**
   * Met à jour la qualité d'un objet.
   *
   * @param qualite
   *            la nouvelle qualité de l'objet.
   */
  void setQuality(int qualite) {
    this.quality = qualite;
  }

  /**
   * Renvoie le nom d'un objet.
   */
  String getName() {
    return this.name;
  }

  /**
   * Renvoie le SellIn d'un objet
   */
  int getSellIn() {
    return this.sellIn;
  }

  /**
   * Renvoie la qualité d'un objet
   */
  int getQuality() {
    return this.quality;
  }

  /**
   * Renvoie les valeurs représentants l'objet dans un String.
   */
  @Override
  public String toString() {
    return this.name + " a un SellIn de " + this.sellIn + " et une qualité de " + this.quality + ".";
  }
}

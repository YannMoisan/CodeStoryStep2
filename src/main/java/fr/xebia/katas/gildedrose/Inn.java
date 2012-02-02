package fr.xebia.katas.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Inn {
	private static final String CONJURED_MANA_CAKE = "Conjured Mana Cake";
	private static final String CONJURED = "Conjured";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String ELIXIR_OF_THE_MONGOOSE = "Elixir of the Mongoose";
	private static final String AGED_BRIE = "Aged Brie";
	private static final String _5_DEXTERITY_VEST = "+5 Dexterity Vest";
	private List<Item> items;

	public Inn() {
		items = new ArrayList<Item>();
		items.add(new Item(_5_DEXTERITY_VEST, 10, 20));
		items.add(new Item(AGED_BRIE, 2, 0));
		items.add(new Item(ELIXIR_OF_THE_MONGOOSE, 5, 7));
		items.add(new Item(SULFURAS_HAND_OF_RAGNAROS, 0, 80));
		items.add(new Item(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT, 15, 20));
		items.add(new Item(CONJURED_MANA_CAKE, 3, 6));
		items.add(new Item(CONJURED, 3, 20));
	}

	public void updateQuality() {
		for (int i = 0; i < items.size(); i++) {
			Item item = items.get(i);

			String name = item.getName();
			int quality = item.getQuality();

			if (!name.equals(AGED_BRIE)
					&& !name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
				if (quality > 0) {
					if (!name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
						quality = quality - 1;
					}
					// Conjured decrease twice fast as normal
					if (name.equals(CONJURED)) {
						quality = quality - 1;
					}
				}
			} else {// Brie or Backstage
				if (quality < 50) {
					quality = quality + 1;
					if (name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
						if (item.getSellIn() < 11) {
							if (quality < 50) {
								quality = quality + 1;
							}
						}
						if (item.getSellIn() < 6) {
							if (quality < 50) {
								quality = quality + 1;
							}
						}
					}
				}
			}
			item.setQuality(quality);

			// Update SellIn
			if (!name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
				item.setSellIn(item.getSellIn() - 1);
			}
			if (item.getSellIn() < 0) {
				updateQualityWhenSellInIsNegative(item);
			}
		}
	}

	public void updateQualityWhenSellInIsNegative(Item item) {
		// Quality update when sellin is negative
		String name = item.getName();
		int quality = item.getQuality();
		if (!name.equals(AGED_BRIE)) {
			if (!name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
				if (quality > 0) {
					if (!name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
						quality = quality - 1;
					}
					// Conjured decrease twice fast as normal
					if (name.equals(CONJURED)) {
						quality = quality - 1;
					}
				}
			} else {
				quality = 0;
			}
		} else {// for brie
			if (quality < 50) {
				quality = quality + 1;
			}
		}
		item.setQuality(quality);
	}

	public static void main(String[] args) {
		System.out.println("OMGHAI!");
		new Inn().updateQuality();
	}

	public List<Item> getItems() {
		return items;

	}

	@Override
	public String toString() {
		String ret = "";
		for (Item item : items) {
			ret += item + "\n";

		}
		return ret;
	}

}

package fr.xebia.katas.gildedrose;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class NonRegTest {

	@Test
	public void test50Day() {
		Inn inn = new Inn();
		List<Item> items = inn.getItems();
		// Day 0
		Assert.assertEquals(items.get(0).getQuality(), 20);
		Assert.assertEquals(items.get(0).getSellIn(), 10);
		Assert.assertEquals(items.get(1).getQuality(), 0);
		Assert.assertEquals(items.get(1).getSellIn(), 2);
		Assert.assertEquals(items.get(2).getQuality(), 7);
		Assert.assertEquals(items.get(2).getSellIn(), 5);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 20);
		Assert.assertEquals(items.get(4).getSellIn(), 15);
		Assert.assertEquals(items.get(5).getQuality(), 6);
		Assert.assertEquals(items.get(5).getSellIn(), 3);
		inn.updateQuality();
		// Day 1
		Assert.assertEquals(items.get(0).getQuality(), 19);
		Assert.assertEquals(items.get(0).getSellIn(), 9);
		Assert.assertEquals(items.get(1).getQuality(), 1);
		Assert.assertEquals(items.get(1).getSellIn(), 1);
		Assert.assertEquals(items.get(2).getQuality(), 6);
		Assert.assertEquals(items.get(2).getSellIn(), 4);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 21);
		Assert.assertEquals(items.get(4).getSellIn(), 14);
		Assert.assertEquals(items.get(5).getQuality(), 5);
		Assert.assertEquals(items.get(5).getSellIn(), 2);
		inn.updateQuality();
		// Day 2
		Assert.assertEquals(items.get(0).getQuality(), 18);
		Assert.assertEquals(items.get(0).getSellIn(), 8);
		Assert.assertEquals(items.get(1).getQuality(), 2);
		Assert.assertEquals(items.get(1).getSellIn(), 0);
		Assert.assertEquals(items.get(2).getQuality(), 5);
		Assert.assertEquals(items.get(2).getSellIn(), 3);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 22);
		Assert.assertEquals(items.get(4).getSellIn(), 13);
		Assert.assertEquals(items.get(5).getQuality(), 4);
		Assert.assertEquals(items.get(5).getSellIn(), 1);
		inn.updateQuality();
		// Day 3
		Assert.assertEquals(items.get(0).getQuality(), 17);
		Assert.assertEquals(items.get(0).getSellIn(), 7);
		Assert.assertEquals(items.get(1).getQuality(), 4);
		Assert.assertEquals(items.get(1).getSellIn(), -1);
		Assert.assertEquals(items.get(2).getQuality(), 4);
		Assert.assertEquals(items.get(2).getSellIn(), 2);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 23);
		Assert.assertEquals(items.get(4).getSellIn(), 12);
		Assert.assertEquals(items.get(5).getQuality(), 3);
		Assert.assertEquals(items.get(5).getSellIn(), 0);
		inn.updateQuality();
		// Day 4
		Assert.assertEquals(items.get(0).getQuality(), 16);
		Assert.assertEquals(items.get(0).getSellIn(), 6);
		Assert.assertEquals(items.get(1).getQuality(), 6);
		Assert.assertEquals(items.get(1).getSellIn(), -2);
		Assert.assertEquals(items.get(2).getQuality(), 3);
		Assert.assertEquals(items.get(2).getSellIn(), 1);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 24);
		Assert.assertEquals(items.get(4).getSellIn(), 11);
		Assert.assertEquals(items.get(5).getQuality(), 1);
		Assert.assertEquals(items.get(5).getSellIn(), -1);
		inn.updateQuality();
		// Day 5
		Assert.assertEquals(items.get(0).getQuality(), 15);
		Assert.assertEquals(items.get(0).getSellIn(), 5);
		Assert.assertEquals(items.get(1).getQuality(), 8);
		Assert.assertEquals(items.get(1).getSellIn(), -3);
		Assert.assertEquals(items.get(2).getQuality(), 2);
		Assert.assertEquals(items.get(2).getSellIn(), 0);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 25);
		Assert.assertEquals(items.get(4).getSellIn(), 10);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -2);
		inn.updateQuality();
		// Day 6
		Assert.assertEquals(items.get(0).getQuality(), 14);
		Assert.assertEquals(items.get(0).getSellIn(), 4);
		Assert.assertEquals(items.get(1).getQuality(), 10);
		Assert.assertEquals(items.get(1).getSellIn(), -4);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -1);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 27);
		Assert.assertEquals(items.get(4).getSellIn(), 9);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -3);
		inn.updateQuality();
		// Day 7
		Assert.assertEquals(items.get(0).getQuality(), 13);
		Assert.assertEquals(items.get(0).getSellIn(), 3);
		Assert.assertEquals(items.get(1).getQuality(), 12);
		Assert.assertEquals(items.get(1).getSellIn(), -5);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -2);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 29);
		Assert.assertEquals(items.get(4).getSellIn(), 8);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -4);
		inn.updateQuality();
		// Day 8
		Assert.assertEquals(items.get(0).getQuality(), 12);
		Assert.assertEquals(items.get(0).getSellIn(), 2);
		Assert.assertEquals(items.get(1).getQuality(), 14);
		Assert.assertEquals(items.get(1).getSellIn(), -6);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -3);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 31);
		Assert.assertEquals(items.get(4).getSellIn(), 7);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -5);
		inn.updateQuality();
		// Day 9
		Assert.assertEquals(items.get(0).getQuality(), 11);
		Assert.assertEquals(items.get(0).getSellIn(), 1);
		Assert.assertEquals(items.get(1).getQuality(), 16);
		Assert.assertEquals(items.get(1).getSellIn(), -7);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -4);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 33);
		Assert.assertEquals(items.get(4).getSellIn(), 6);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -6);
		inn.updateQuality();
		// Day 10
		Assert.assertEquals(items.get(0).getQuality(), 10);
		Assert.assertEquals(items.get(0).getSellIn(), 0);
		Assert.assertEquals(items.get(1).getQuality(), 18);
		Assert.assertEquals(items.get(1).getSellIn(), -8);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -5);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 35);
		Assert.assertEquals(items.get(4).getSellIn(), 5);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -7);
		inn.updateQuality();
		// Day 11
		Assert.assertEquals(items.get(0).getQuality(), 8);
		Assert.assertEquals(items.get(0).getSellIn(), -1);
		Assert.assertEquals(items.get(1).getQuality(), 20);
		Assert.assertEquals(items.get(1).getSellIn(), -9);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -6);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 38);
		Assert.assertEquals(items.get(4).getSellIn(), 4);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -8);
		inn.updateQuality();
		// Day 12
		Assert.assertEquals(items.get(0).getQuality(), 6);
		Assert.assertEquals(items.get(0).getSellIn(), -2);
		Assert.assertEquals(items.get(1).getQuality(), 22);
		Assert.assertEquals(items.get(1).getSellIn(), -10);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -7);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 41);
		Assert.assertEquals(items.get(4).getSellIn(), 3);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -9);
		inn.updateQuality();
		// Day 13
		Assert.assertEquals(items.get(0).getQuality(), 4);
		Assert.assertEquals(items.get(0).getSellIn(), -3);
		Assert.assertEquals(items.get(1).getQuality(), 24);
		Assert.assertEquals(items.get(1).getSellIn(), -11);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -8);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 44);
		Assert.assertEquals(items.get(4).getSellIn(), 2);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -10);
		inn.updateQuality();
		// Day 14
		Assert.assertEquals(items.get(0).getQuality(), 2);
		Assert.assertEquals(items.get(0).getSellIn(), -4);
		Assert.assertEquals(items.get(1).getQuality(), 26);
		Assert.assertEquals(items.get(1).getSellIn(), -12);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -9);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 47);
		Assert.assertEquals(items.get(4).getSellIn(), 1);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -11);
		inn.updateQuality();
		// Day 15
		Assert.assertEquals(items.get(0).getQuality(), 0);
		Assert.assertEquals(items.get(0).getSellIn(), -5);
		Assert.assertEquals(items.get(1).getQuality(), 28);
		Assert.assertEquals(items.get(1).getSellIn(), -13);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -10);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 50);
		Assert.assertEquals(items.get(4).getSellIn(), 0);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -12);
		inn.updateQuality();
		// Day 16
		Assert.assertEquals(items.get(0).getQuality(), 0);
		Assert.assertEquals(items.get(0).getSellIn(), -6);
		Assert.assertEquals(items.get(1).getQuality(), 30);
		Assert.assertEquals(items.get(1).getSellIn(), -14);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -11);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 0);
		Assert.assertEquals(items.get(4).getSellIn(), -1);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -13);
		inn.updateQuality();
		// Day 17
		Assert.assertEquals(items.get(0).getQuality(), 0);
		Assert.assertEquals(items.get(0).getSellIn(), -7);
		Assert.assertEquals(items.get(1).getQuality(), 32);
		Assert.assertEquals(items.get(1).getSellIn(), -15);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -12);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 0);
		Assert.assertEquals(items.get(4).getSellIn(), -2);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -14);
		inn.updateQuality();
		// Day 18
		Assert.assertEquals(items.get(0).getQuality(), 0);
		Assert.assertEquals(items.get(0).getSellIn(), -8);
		Assert.assertEquals(items.get(1).getQuality(), 34);
		Assert.assertEquals(items.get(1).getSellIn(), -16);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -13);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 0);
		Assert.assertEquals(items.get(4).getSellIn(), -3);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -15);
		inn.updateQuality();
		// Day 19
		Assert.assertEquals(items.get(0).getQuality(), 0);
		Assert.assertEquals(items.get(0).getSellIn(), -9);
		Assert.assertEquals(items.get(1).getQuality(), 36);
		Assert.assertEquals(items.get(1).getSellIn(), -17);
		Assert.assertEquals(items.get(2).getQuality(), 0);
		Assert.assertEquals(items.get(2).getSellIn(), -14);
		Assert.assertEquals(items.get(3).getQuality(), 80);
		Assert.assertEquals(items.get(3).getSellIn(), 0);
		Assert.assertEquals(items.get(4).getQuality(), 0);
		Assert.assertEquals(items.get(4).getSellIn(), -4);
		Assert.assertEquals(items.get(5).getQuality(), 0);
		Assert.assertEquals(items.get(5).getSellIn(), -16);
		inn.updateQuality();

	}
}

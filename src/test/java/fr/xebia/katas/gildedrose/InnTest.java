package fr.xebia.katas.gildedrose;

import static org.fest.assertions.Assertions.assertThat;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class InnTest {

	@Test
	public void should_test_the_truth() throws Exception {
		assertThat(true).isTrue();
	}

	@Test
	public void qualityNeverNegative() {
		Inn inn = new Inn();
		List<Item> items = inn.getItems();
		for (Item item : items) {
			Assert.assertTrue(item.getQuality() >= 0);
		}
		System.out.println(inn);
		inn.updateQuality();
		System.out.println(inn);
		inn.updateQuality();
		System.out.println(inn);
		inn.updateQuality();
		System.out.println(inn);
		inn.updateQuality();
		System.out.println(inn);
	}

	@Test
	public void qualityConjured() {
		Inn inn = new Inn();
		List<Item> items = inn.getItems();
		Item conjured = items.get(6);
		for (int i = 0; i < 20; i++) {
			int quality = conjured.getQuality();
			int sellin = conjured.getSellIn();
			inn.updateQuality();
			int newQuality = conjured.getQuality();
			if (sellin > 0 && quality >= 2) {
				Assert.assertEquals(2, quality - newQuality);
			} else if (quality >= 4) {
				Assert.assertEquals("Quality for selin = " + sellin, 4, quality
						- newQuality);
			}
			Assert.assertTrue("Quality should be positve had " + quality,
					quality >= 0);
		}
	}

	public static void main(String[] args) {

		String content = "Inn inn = new Inn();\n";
		Inn inn = new Inn();
		for (int day = 0; day < 20; day++) {
			content += "//Day " + day + "\n";
			List<Item> items = inn.getItems();
			for (int index = 0; index < items.size(); index++) {
				Item item = items.get(index);
				content += "Assert.assertEquals(items.get(" + index
						+ ").getQuality()," + item.getQuality() + ");\n";
				content += "Assert.assertEquals(items.get(" + index
						+ ").getSellIn()," + item.getSellIn() + ");\n";
			}
			content += "inn.updateQuality();\n";
			inn.updateQuality();
		}
		System.out.println(content);
	}
}

package org.itstep.model;
import org.itstep.model.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class BacketTest {

	@Test
	public void testGetSumOfChek() {
		Backet client = new Backet();
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		
	//System.out.println(client.getSumOfChek());
		assertEquals(350,client.getSumOfChek());
	}

	@Test
	public void testFormatMoney() {
		Backet client = new Backet();
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		
	//System.out.println(client.getSumOfChek());
		assertEquals("3,5 UAH",client.formatMoney(client.getSumOfChek()));
	}

}

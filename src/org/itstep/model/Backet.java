package org.itstep.model;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.itstep.model.Catalog;

public class Backet {
	
	private static Logger logger = Logger.getLogger(Backet.class.getName());
	public static void main(String[] args) {
		Backet client = new Backet();
		client.addGoodsToBacket("TShirt", 2, 20);
		client.addGoodsToBacket("Shoes", 3, 10);
		
		logger.log(Level.INFO, "Your total sum is " + client.formatMoney(client.getSumOfChek()));
		
	}

	
	HashMap<String, Catalog> goodsMap = new HashMap<>();
	
	public void addGoodsToBacket(String goods, int quantity,int price) {

		if (goodsMap.containsKey(goods)) {
			Catalog a = goodsMap.get(goods);
			a.addQuantity(quantity);
			goodsMap.put(goods, a);
		} else {
			goodsMap.put(goods, new Catalog(quantity, price));
		}
		
	}
	
	public int getSumOfChek() {

		int discountedGoods, goodsWithoutDiscount,sum;
		int sumVaucher=0;
		for (String key : goodsMap.keySet()) {
		    discountedGoods = goodsMap.get(key).getQuantity()/3;
		    goodsWithoutDiscount = goodsMap.get(key).getQuantity() - discountedGoods;
		    sum = (goodsWithoutDiscount*goodsMap.get(key).getPrice())+(discountedGoods*(goodsMap.get(key).getPrice()/2));
		    sumVaucher += sum;
		  
		   
		   
	} 
		return sumVaucher;
		
	}
	
	public String formatMoney(int price) {
		String finalPrice = "";
		double realPrice =  (double)price/100;
		DecimalFormat formater = new DecimalFormat("###.## UAH");
		finalPrice = formater.format(realPrice);
		return finalPrice;
	}


	
}

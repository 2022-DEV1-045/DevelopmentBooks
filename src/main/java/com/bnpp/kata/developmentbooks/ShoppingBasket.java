package com.bnpp.kata.developmentbooks;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
	private List<ShoppingBasketItem> basketItems;

	public ShoppingBasket() {
		basketItems = new ArrayList<>();
	}

	public void addBookToBasketAndQuantity(Book book) {

		ShoppingBasketItem existingItem = null;

		for (ShoppingBasketItem item : basketItems) {

			if (item.getBook() == book) {
				existingItem = item;
			}
		}

		if (existingItem != null) {
			existingItem.changeQuantity(existingItem.getQuantity() + 1);

		} else {
			ShoppingBasketItem newBook = new ShoppingBasketItem(book, 1);

			basketItems.add(newBook);
		}
	}

	public double getSubtotal() {
		double totalCost = 0.0;
		int totalQuantity = 0;

		for (ShoppingBasketItem bookVolume : basketItems) {
			totalQuantity += bookVolume.getQuantity();
		}

		if (basketItems.size() == 1) {
			totalCost = 50 * basketItems.get(0).getQuantity();
			return totalCost;
		} else if (totalQuantity == basketItems.size() && basketItems.size() > 1) {
			if (basketItems.size() == 2) {
				return 50 * basketItems.size() * 0.95;
			} else if (basketItems.size() == 3) {
				return 50 * basketItems.size() * 0.90;
			} else if (basketItems.size() == 4) {
				return 50 * basketItems.size() * 0.80;
			} else {
				return 50 * basketItems.size() * 0.75;
			}
		} else if (totalQuantity == 3 && basketItems.size() == 2) {
			return totalCost = (50 * basketItems.size() * 0.95) + ((totalQuantity - basketItems.size()) * 50);
		} else if (totalQuantity == 4 && basketItems.size() == 3) {
			return totalCost = (50 * basketItems.size() * 0.90) + ((totalQuantity - basketItems.size()) * 50);
		} else if (totalQuantity == 5 && basketItems.size() == 3) {
			return (50 * basketItems.size() * 0.90) + (50 * (totalQuantity - basketItems.size()) * 0.95);
		} else if (totalQuantity == 6 && basketItems.size() == 3) {
			return (50 * basketItems.size() * 0.90) + (50 * (totalQuantity - basketItems.size()) * 0.90);
		} else if (totalQuantity == 7 && basketItems.size() == 4) {
			return totalCost = (50 * basketItems.size() * 0.80) + (50 * (totalQuantity - basketItems.size()) * 0.90);
		}
		return totalCost;
	}
}

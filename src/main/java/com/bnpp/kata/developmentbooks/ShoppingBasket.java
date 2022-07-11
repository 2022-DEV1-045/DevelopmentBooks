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

		if (basketItems.size() == 1) {
			totalCost = 50 * basketItems.get(0).getQuantity();
			return totalCost;
		}
		return totalCost;
	}
}

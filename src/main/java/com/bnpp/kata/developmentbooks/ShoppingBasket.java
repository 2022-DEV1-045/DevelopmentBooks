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

}

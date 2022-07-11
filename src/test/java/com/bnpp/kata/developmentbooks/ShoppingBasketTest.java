package com.bnpp.kata.developmentbooks;

import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {
	List<ShoppingBasketItem> Item = new ArrayList<ShoppingBasketItem>();
	Book cleanCodeBook = new Book(50.0, 2);
	Book cleanCoderBook = new Book(100.0, 1);
	ShoppingBasketItem shoppingItem1 = new ShoppingBasketItem(cleanCodeBook, 1);
	ShoppingBasketItem shoppingItem2 = new ShoppingBasketItem(cleanCoderBook, 2);

	@Before
	public void intt() {
		Item.add(shoppingItem1);
		Item.add(shoppingItem2);
	}

	@Test
	public void existingBookCheck() {
		Book cleanArchitectureBook = new Book(50.0, 2);
		assertNotSame(cleanArchitectureBook, cleanCoderBook);
		shoppingItem1.changeQuantity(cleanArchitectureBook.getQuantity() + 1);
	}

}

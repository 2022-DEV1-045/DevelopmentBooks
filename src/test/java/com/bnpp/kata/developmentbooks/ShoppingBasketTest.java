package com.bnpp.kata.developmentbooks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ShoppingBasketTest {
	ShoppingBasket shoppingBasket;
	List<ShoppingBasketItem> Item = new ArrayList<ShoppingBasketItem>();
	Book cleanCodeBook = new Book(50.0, 2);
	Book cleanCoderBook = new Book(100.0, 1);
	ShoppingBasketItem shoppingItem1 = new ShoppingBasketItem(cleanCodeBook, 1);
	ShoppingBasketItem shoppingItem2 = new ShoppingBasketItem(cleanCoderBook, 2);

	@Before
	public void initilize() {
		Item.add(shoppingItem1);
		Item.add(shoppingItem2);
		shoppingBasket = new ShoppingBasket();
	}

	@Test
	public void existingBookCheck() {
		Book cleanArchitectureBook = new Book(50.0, 2);
		assertNotSame(cleanArchitectureBook, cleanCoderBook);
		shoppingItem1.changeQuantity(cleanArchitectureBook.getQuantity() + 1);
	}

	@Test
	public void addNewBook() {
		Book testDrivenDevelopmentbyExampleBook = new Book(150.0, 1);
		assertNotSame(testDrivenDevelopmentbyExampleBook, cleanCodeBook);
		assertNotSame(testDrivenDevelopmentbyExampleBook, cleanCoderBook);
		ShoppingBasketItem shoppingItem3 = new ShoppingBasketItem(testDrivenDevelopmentbyExampleBook, 1);
	}

	@Test
	public void OneCopyOfAnyOfFiveBooksInShoppingBasketCost50EUR() {
		Book cleanCodeBook = new Book(50.0, 1);

		shoppingBasket.addBookToBasketAndQuantity(cleanCodeBook);

		Double actualPrice = shoppingBasket.getSubtotal();

		assertEquals(new Double(50.0), actualPrice);
	}

	@Test
	public void twoCopiesOfSameBookGetsNoDiscount() {
		Book cleanCodeBook = new Book(50.0, 1);

		shoppingBasket.addBookToBasketAndQuantity(cleanCodeBook);
		shoppingBasket.addBookToBasketAndQuantity(cleanCodeBook);

		Double actualPrice = shoppingBasket.getSubtotal();

		assertEquals(new Double(100.0), actualPrice);
	}

	@Test
	public void twoDifferentBooksGets5PercentofDiscount() {
		Book cleanCodeBook = new Book(50.0, 1);
		Book cleanCoderBook = new Book(50.0, 1);

		shoppingBasket.addBookToBasketAndQuantity(cleanCodeBook);
		shoppingBasket.addBookToBasketAndQuantity(cleanCoderBook);

		Double total = shoppingBasket.getSubtotal();

		assertEquals(new Double(95.0), total);
	}

	@Test
	public void threeDifferentBooksGets10PercentDiscount() {
		Book cleanCodeBook = new Book(50.0, 1);
		Book cleanCoderBook = new Book(50.0, 1);
		Book cleanArchitectureBook = new Book(50.0, 1);

		shoppingBasket.addBookToBasketAndQuantity(cleanCodeBook);
		shoppingBasket.addBookToBasketAndQuantity(cleanCoderBook);
		shoppingBasket.addBookToBasketAndQuantity(cleanArchitectureBook);

		Double total = shoppingBasket.getSubtotal();

		assertEquals(new Double(135.0), total);
	}

	@Test
	public void fourDifferentBooksGets20PercentDiscount() {
		Book cleanCodeBook = new Book(50.0, 1);
		Book cleanCoderBook = new Book(50.0, 1);
		Book cleanArchitectureBook = new Book(50.0, 1);
		Book testDrivenDevelopmentbyExampleBook = new Book(50.0, 1);

		shoppingBasket.addBookToBasketAndQuantity(cleanCodeBook);
		shoppingBasket.addBookToBasketAndQuantity(cleanCoderBook);
		shoppingBasket.addBookToBasketAndQuantity(cleanArchitectureBook);
		shoppingBasket.addBookToBasketAndQuantity(testDrivenDevelopmentbyExampleBook);

		Double total = shoppingBasket.getSubtotal();

		assertEquals(new Double(160.0), total);
	}
}

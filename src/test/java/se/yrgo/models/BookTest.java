package se.yrgo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class 	BookTest {

	//G
	@Test
	public void test2EqualBooks() {
		Book book1 = new Book(001,"titleOfBook","author","978-3-16-148410-0","branch", 200);
		Book book2 = new Book(001,"titleOfBook","author","978-3-16-148410-0","branch", 200);
	assertEquals(book1, book2);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
		Book book1 = new Book(001,"titleOfBook","author","978-3-16-148410-0","branch", 200);
		Book book2 = new Book(002,"titleOfBook","author","978-3-16-148410-0","branch", 200);
		assertNotEquals(book1, book2);

	}

}

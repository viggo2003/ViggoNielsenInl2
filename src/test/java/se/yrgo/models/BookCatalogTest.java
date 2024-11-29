package se.yrgo.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() throws BookNotFoundException {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);

	}

	//G
	@Test
	public void testAddABook() throws BookNotFoundException {
	bc = new BookCatalog();
	book1 = new Book(1,"Learning Java","","","",0);
	bc.addBook(book1);
	assertEquals(bc.findBook("Learning Java"), bc.findBook("Learning Java"));
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		assertEquals(bc.findBook("Learning Java"), bc.findBook("Learning Java"));

	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
	assertEquals(bc.findBook("LEARNING JAVA"), bc.findBook("learning java"));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		assertEquals(bc.findBook("Learning Java        "), bc.findBook("Learning java"));

	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}

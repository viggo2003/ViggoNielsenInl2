package se.yrgo.models;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class BookCatalogTest {
	private BookCatalog bc2;
	private BookCatalog bc;
	private Book book1;
	private Book book2;

	public BookCatalogTest() throws BookNotFoundException {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);

	}

	//G
	@Test
	public void testAddABook() throws BookNotFoundException {
	bc = new BookCatalog();
	bc2 = new BookCatalog();
	book1 = new Book(1,"Learning Java","","","",0);
	book2 = new Book(1,"Learning Java","","","",0);
	bc.addBook(book1);
	bc2.addBook(book2);
	assertIterableEquals(Arrays.asList(bc.getBookArray()),Arrays.asList(bc2.getBookArray()));
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
		Book foundBook = bc.findBook("Learning Java");
		assertNotNull(foundBook);
		assertEquals(book1, foundBook);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
		bc = new BookCatalog();
		bc2 = new BookCatalog();
		book1 = new Book(1,"LEARNING JAVA","","","",0);
		book2 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
		bc2.addBook(book2);
		assertIterableEquals(Arrays.asList(bc.getBookArray()),Arrays.asList(bc2.getBookArray()));
	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
		bc = new BookCatalog();
		bc2 = new BookCatalog();
		book1 = new Book(1,"Learning Java         ","","","",0);
		book2 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
		bc2.addBook(book2);
		assertIterableEquals(Arrays.asList(bc.getBookArray()),Arrays.asList(bc2.getBookArray()));

	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}

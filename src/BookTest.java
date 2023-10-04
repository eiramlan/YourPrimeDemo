import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BookTest {
	
	private static Book book;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		book = new Book("Shoe Dog", "Phil Knight", 2016, 5, 399, new Autobiography());
	}

	@Test
	public void testBook() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetNoPages() {
		int expected = 399;
		assertEquals("This is correct", expected, book.getNoPages());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAuthor() {
		String expected = "Phil Knight";
		assertEquals("This is correct", expected, book.getAuthor());
		//fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		//fail("Not yet implemented");
	}

	@Test
	public void testOf() {
		//fail("Not yet implemented");
	}

}

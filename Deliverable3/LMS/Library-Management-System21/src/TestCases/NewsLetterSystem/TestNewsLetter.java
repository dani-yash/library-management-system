package TestCases.NewsLetterSystem;
import NewsLetterSystem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestNewsLetter {
	private NewsLetter news;
	@BeforeEach
	void setup() {
		news = new NewsLetter("title", "content");
	}
	@Test
	void testClose() {
		// do nothing because of implementation
		news.close();
	}
	void testView() {
		// do nothing, implementation
		news.view();

	}
	@Test
	void testGetTitle() {
		assertEquals(news.getTitle(), "title");
	}
	@Test
	void testSetTitle() {
		news.setTitle("notT");
		assertNotEquals(news.getTitle(), "title");
	}
	@Test
	void testContent() {
		assertEquals(news.getContent(), "content");
	}
	@Test
	void testSetContent() {
		news.setContent("notC");
		assertNotEquals(news.getContent(), "content");
	}
	@Test
	void testSetRent() {
		news.setRent(1);
		assertEquals(news.getRent(), 1);
	}
	@Test
	void testGetRent() {
		assertEquals(news.getRent(), 0);
	}

}

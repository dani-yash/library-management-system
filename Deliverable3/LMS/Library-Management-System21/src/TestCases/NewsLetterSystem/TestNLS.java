package TestCases.NewsLetterSystem;
import NewsLetterSystem.*;
import UserData.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestNLS {
	User use = new User();
	NewsLetterSystem NLS = new NewsLetterSystem();
	NewsLetter news;
	@BeforeEach
	void setup() {
		news = new NewsLetter("title", "content");
	}
	
	@Test
	void checkSubscribe() {
		NLS.subscribe(use, news);
	}
	@Test
	void getList() {
		NLS.subscribe(use, news);
		assertEquals(1, NLS.viewSubscriptions(use).size());
	}
	@Test
	void testView() {
		NLS.subscribe(use, news);
		NLS.viewNewsLetter(use, news);
	}
	@Test
	void checkCancel() {
		NLS.subscribe(use, news);
		NLS.cancelSubscription(use, news);
		assertEquals(0, NLS.viewSubscriptions(use).size());
	}
}

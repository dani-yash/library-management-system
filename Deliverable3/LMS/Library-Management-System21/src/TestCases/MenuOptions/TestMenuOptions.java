package TestCases.MenuOptions;
import MenuOptions.*;
import NewsLetterSystem.NewsLetter;
import NotificationSystem.Notification;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestMenuOptions {
	NewsLetter news = new NewsLetter("title", "content");
	Notification notif = new Notification("message");
	ActionView aVNews = new ActionView(news);
	ActionView aVNotif = new ActionView(notif);
	ActionClose aCNews = new ActionClose(news);
	ActionClose aCNotif = new ActionClose(notif);

	@BeforeEach
	void start() {
		NewsLetter news = new NewsLetter("title", "content");
		Notification notif = new Notification("message");
		ActionView aVNews = new ActionView(news);
		ActionView aVNotif = new ActionView(notif);
		ActionClose aCNews = new ActionClose(news);
		ActionClose aCNotif = new ActionClose(notif);
		MenuOptions mUNews = new MenuOptions(aVNews, aCNews);
		MenuOptions mUNotif = new MenuOptions(aVNotif, aCNotif);
	}
	@Test
	void testMenuNews() {
		MenuOptions mUNews = new MenuOptions(aVNews, aCNews);
		assertEquals(aVNews, mUNews.getView());
		assertEquals(aCNews, mUNews.getClose());
		mUNews.clickClose();
		mUNews.clickView();
	}
	@Test
	void testMenuNotif() {
		MenuOptions mUNotif = new MenuOptions(aVNotif, aCNotif);
		assertEquals(aVNotif, mUNotif.getView());
		assertEquals(aCNotif, mUNotif.getClose());
		mUNotif.clickClose();
		mUNotif.clickView();
	}

}

package MenuOptions;

public class MenuOptions {
    ActionListenerCommand viewCommand;
    ActionListenerCommand closeCommand;
    public MenuOptions(ActionListenerCommand clickView, ActionListenerCommand clickClose) {
        this.viewCommand = clickView;
        this.closeCommand = clickClose;
    }
    public void clickView(){
        viewCommand.execute();
    }
    public void clickClose(){
        closeCommand.execute();
    }
    public ActionListenerCommand getView() {
    	return viewCommand;
    }
    public ActionListenerCommand getClose() {
    	return closeCommand;
    }
    
    
    /*
    // client system for command pattern
    NewsLetter news = new NewsLetter("title", "content");
    ActionListenerCommand clickView = new ActionView(news);
    ActionListenerCommand clickClose = new ActionClose(news);
    MenuOptions menu = new MenuOptions(clickView, clickClose);
    menu.clickView();
    menu.clickClose()
    // notification version just requires where news is)
    // Notification notif = new Notification("message");
    // ActionListenerCommand clickView1 = new ActionView(notif);
    // ActionListenerCommand clickClose1 = new ActionClose(notif);
    // MenuOptions menu1 = new MenuOptions(clickView1, clickClose1);
    // menu1.clickView();
    // menu1.clickClose()
    */
}

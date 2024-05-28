package NewsLetterSystem;

public class NewsLetter {
    private String title;
    private String content;

    private int rent;

    public NewsLetter(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public void view() {
        // GUI IMPLEMENTATION
    }
    public void close() {
        // GUI IMPLEMENTATION
    }
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getRent() { return this.rent; }

    public void setRent(int rent) { this.rent =  rent; }
}

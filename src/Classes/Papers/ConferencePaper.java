package Classes.Papers;

import java.util.ArrayList;

public class ConferencePaper extends APaper {
    private String bookTitle;

    public ConferencePaper(ArrayList<String> authors, String title, String year, String doi, String bookTitle) {
        super(authors, title, year, doi);
        this.bookTitle = bookTitle;
    }
}

package Classes.Papers;

import java.util.ArrayList;

public class ArticlePaper extends APaper {
    private String volume;
    private String number;
    private String journal;

    public ArticlePaper(ArrayList<String> authors, String title, String year, String doi, String volume, String number, String journal) {
        super(authors, title, year, doi);
        this.volume = volume;
        this.number = number;
        this.journal = journal;
    }
}

package Classes.Papers;

import java.util.ArrayList;

public abstract class APaper {
    public final ArrayList<String> authors;
    public final String title;
    private final String year;
    private final String doi;

    protected APaper(ArrayList<String> authors, String title, String year, String doi) {
        this.authors = authors;
        this.title = title;
        this.year = year;
        this.doi = doi;
    }
}

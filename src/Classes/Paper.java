package Classes;

public class Paper {
    private String type;
    private String authors;
    private String title;
    private int year;
    private String doi;
    private String booktitle;
    private String volume;
    private String number;
    private String journal;
    private int downloads;

    public Paper(String type, String authors, String title, int year, String doi, String booktitle, String volume, String number, String journal) {
        this.type = type;
        this.authors = authors;
        this.title = title;
        this.year = year;
        this.doi = doi;
        this.booktitle = booktitle;
        this.volume = volume;
        this.number = number;
        this.journal = journal;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }
}

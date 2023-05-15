package FileIO;

import Classes.Papers.ArticlePaper;
import Classes.Papers.ConferencePaper;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BibReader {
    private final File folder;
    private final ArrayList<ConferencePaper> conferencePapers;
    private final ArrayList<ArticlePaper> articlePapers;

    public BibReader(String papersPath) throws FileNotFoundException {
        this.folder = new File(papersPath);
        this.conferencePapers = new ArrayList<>();
        this.articlePapers = new ArrayList<>();
    }

    public void getFiles() throws IOException {
        for (final File file : folder.listFiles()) {
            if (file.getName().endsWith(".bib")) {
                String fileName = file.getName();
                String[] fileType = fileName.split("_");
                if (Objects.equals(fileType[0], "A")) {
                    ParseArticleFile(file);
                } else {
                    ParseConferenceFile(file);
                }
            }
        }
    }

    private String getTextBetweenTwoCharacters(String text, String first, String second) {
        return text.substring(text.indexOf(first) + 1, text.indexOf(second));
    }

    // parsing Conference Paper File and creating ConferencePaper Object, adding it to the ConferencePaperList
    public void ParseConferenceFile(File file) throws IOException {
        ArrayList<String> authors = new ArrayList<>();
        String title = "";
        String year = "";
        String doi = "";
        String bookTitle = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file.getPath()));
            String line = reader.readLine();
            while (line != null) {
                String[] lineSplit = line.split("=");
                if (lineSplit.length > 1) {
                    // taking authors
                    switch (lineSplit[0]) {
                        case "author " -> {
                            String[] authorSplit = getTextBetweenTwoCharacters(lineSplit[1], "{", "}").split(",");
                            authors.addAll(Arrays.asList(authorSplit));
                        }
                        // taking title
                        case "title " -> title = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        // taking year
                        case "year " -> year = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        //taking doi
                        case "doi " -> doi = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        // taking bookTitle
                        case "booktitle " -> bookTitle = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                    }
                }
                // read next line
                line = reader.readLine();
            }
            ConferencePaper conferencePaper = new ConferencePaper(authors, title, year, doi, bookTitle);
            conferencePapers.add(conferencePaper);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // parsing Article Paper File and creating ArticlePaper Object, adding it to the ArticlePaperList
    public void ParseArticleFile(File file) throws IOException {
        ArrayList<String> authors = new ArrayList<>();
        String title = "";
        String year = "";
        String doi = "";
        String volume = "";
        String number = "";
        String journal = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file.getPath()));
            String line = reader.readLine();
            while (line != null) {
                String[] lineSplit = line.split("=");
                if (lineSplit.length > 1) {
                    // taking authors
                    switch (lineSplit[0]) {
                        case "author " -> {
                            String[] authorSplit = getTextBetweenTwoCharacters(lineSplit[1], "{", "}").split(",");
                            authors.addAll(Arrays.asList(authorSplit));
                        }
                        // taking title
                        case "title " -> title = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        // taking year
                        case "year " -> year = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        // taking doi
                        case "doi " -> doi = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        // taking volume
                        case "volume " -> volume = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        // taking number
                        case "number " -> number = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                        // taking journal
                        case "journal " -> journal = getTextBetweenTwoCharacters(lineSplit[1], "{", "}");
                    }
                }
                // read next line
                line = reader.readLine();
            }
            ArticlePaper articlePaper = new ArticlePaper(authors, title, year, doi, volume, number, journal);
            articlePapers.add(articlePaper);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printConferenceFilesDetail() {
        for (ConferencePaper conferencePaper : conferencePapers) {
            System.out.println(conferencePaper.authors);
            System.out.println(conferencePaper.title);
        }
    }

    public void printArticleFilesDetail() {
        for (ArticlePaper articlePaper : articlePapers) {
            System.out.println(articlePaper.authors);
            System.out.println(articlePaper.title);
        }
    }
}

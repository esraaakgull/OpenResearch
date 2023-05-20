package FileIO;

import Classes.Paper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BIBParser {
    public static List<Paper> parseBIBFiles(String folderPath) {
        List<Paper> papers = new ArrayList<>();

        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            System.out.println("Invalid folder path");
            return papers;
        }

        File[] files = folder.listFiles();
        if (files == null) {
            System.out.println("No files found in the folder");
            return papers;
        }

        for (File file : files) {
            if (file.isFile()) {
                String filename = file.getName();
                if (filename.endsWith(".bib")) {
                    Paper paper = parseBIBFile(file);
                    if (paper != null) {
                        papers.add(paper);
                    }
                }
            }
        }

        return papers;
    }

    private static Paper parseBIBFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            StringBuilder bibContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                bibContent.append(line);
            }

            String bibString = bibContent.toString();

            // Extract paper type
            String type = null;
            if (bibString.contains("@inproceedings")) {
                type = "Conference Paper";
            } else if (bibString.contains("@article")) {
                type = "Article";
            }

            // Extract other information
            String authors = extractValueFromBIB(bibString, "author");
            System.out.println(authors);
            String title = extractValueFromBIB(bibString, "title");
            int year = Integer.parseInt(extractValueFromBIB(bibString, "year"));
            String doi = extractValueFromBIB(bibString, "doi");
            String booktitle = extractValueFromBIB(bibString, "booktitle");
            String volume = extractValueFromBIB(bibString, "volume");
            String number = extractValueFromBIB(bibString, "number");
            String journal = extractValueFromBIB(bibString, "journal");

            // Create and return a Paper object
            return new Paper(type, authors, title, year, doi, booktitle, volume, number, journal);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static String extractValueFromBIB(String bibString, String field) {
        String value = null;
        String fieldPattern = field + "\\s*=\\s*\\{([^\\}]+)\\}";
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(bibString);
        if (matcher.find()) {
            value = matcher.group(1);
        }
        return value;
    }
}

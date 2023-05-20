package FileIO;

import Classes.Papers.Paper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;

public class CSVGenerator {
    public static void generateCSV(List<Paper> papers) {
        try (PrintWriter writer = new PrintWriter(new File("papers.csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type,Author(s),Title,Year,DOI,Booktitle,Volume,Number,Journal,Downloads");
            sb.append("\n");

            Random random = new Random();
            for (Paper paper : papers) {
                sb.append(paper.getType()).append(",");
                sb.append(paper.getAuthors()).append(",");
                sb.append(paper.getTitle()).append(",");
                sb.append(paper.getYear()).append(",");
                sb.append(paper.getDoi()).append(",");
                sb.append(paper.getBooktitle()).append(",");
                sb.append(paper.getVolume()).append(",");
                sb.append(paper.getNumber()).append(",");
                sb.append(paper.getJournal()).append(",");
                sb.append(random.nextInt(1501)); // Random number of downloads between 0-1500
                sb.append("\n");
            }

            writer.write(sb.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import Classes.OpenResearchGUI;
import Classes.Paper;
import FileIO.BIBParser;
import FileIO.CSVGenerator;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Parse BIB files and generate papers.csv
        List<Paper> papers = BIBParser.parseBIBFiles("src/Assets/Papers");
        CSVGenerator.generateCSV(papers);

        // Launch the GUI
        SwingUtilities.invokeLater(() -> {
            OpenResearchGUI gui = new OpenResearchGUI();
            gui.show();
        });
    }
}
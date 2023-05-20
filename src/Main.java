import Classes.Interfaces.Dashboard.OpenResearcherGUI;
import Classes.Paper;
import FileIO.BIBParser;
import FileIO.CSVGenerator;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Parse BIB files and generate papers.csv
        List<Paper> papers = BIBParser.parseBIBFiles("src/Assets/Papers");
        CSVGenerator.generateCSV(papers);

        // Launch the GUI
        SwingUtilities.invokeLater(() -> {
            OpenResearcherGUI gui = new OpenResearcherGUI();
            gui.displayOpenResearcherGUIForm();
        });
    }
}
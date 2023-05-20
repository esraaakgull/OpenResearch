import Classes.FollowResearchers.FollowResearchers;
import Classes.OpenResearchGUI;
import Classes.Papers.Paper;
import FileIO.BIBParser;
import FileIO.BibReader;
import FileIO.CSVGenerator;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Parse BIB files and generate papers.csv
//        BibReader bibReader = new BibReader("src/Assets/Papers");
//        List<Paper> papers = bibReader.getFiles();
        List<Paper> papers = BIBParser.parseBIBFiles("src/Assets/Papers");
        CSVGenerator.generateCSV(papers);

        // Launch the GUI
        SwingUtilities.invokeLater(() -> {
            OpenResearchGUI gui = new OpenResearchGUI();
            gui.show();
        });
//        try {
//            BibReader bibReader = new BibReader("src/Assets/Papers");
//           // bibReader.getFiles();
//           // bibReader.printArticleFilesDetail();
//           // bibReader.printConferenceFilesDetail();
//
//            //LOGIN
//            // Login login = new Login();
//            // login.displayLoginForm();
//
//            //DOWNLOAD PAPER
//            // PDownload pDownload = new PDownload();
//            // pDownload.displayPDownloadForm();
//
//            //USER READING LIST
//            // UserReadingList userReadingList = new UserReadingList();
//            // userReadingList.displayUserReadingForm();
//
//            //FOLLOW RESEARCHER
//            FollowResearchers followResearchers = new FollowResearchers();
//            followResearchers.displayFollowResearchersForm();
//
//
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//        catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
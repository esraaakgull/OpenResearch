import Classes.Login.Login;
import Classes.Login.LoginForm;
import Classes.PaperDownload.PDownload;
import Classes.UserReadingList.UserReadingList;
import FileIO.BibReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BibReader bibReader = new BibReader("src/Assets/Papers");
           // bibReader.getFiles();
           // bibReader.printArticleFilesDetail();
           // bibReader.printConferenceFilesDetail();

            //LOGIN
            // Login login = new Login();
            // login.displayLoginForm();

            //DOWNLOAD PAPER
            // PDownload pDownload = new PDownload();
            // pDownload.displayPDownloadForm();

            //USER READING LIST
            UserReadingList userReadingList = new UserReadingList();
            userReadingList.displayUserReadingForm();


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
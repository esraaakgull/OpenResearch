import Classes.Login.Login;
import Classes.Login.LoginForm;
import FileIO.BibReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BibReader bibReader = new BibReader("src/Assets/Papers");
            bibReader.getFiles();
            bibReader.printArticleFilesDetail();
           // bibReader.printConferenceFilesDetail();
            Login login = new Login();
            login.displayLoginForm();


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
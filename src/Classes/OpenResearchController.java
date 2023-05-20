package Classes;

import Classes.Interfaces.OpenResearchObserver;
import Classes.Papers.Paper;
import Classes.UserReadingList.ReadingList;
import Classes.UserReadingList.ReadingListForm;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class OpenResearchController {
    private List<ReadingList> readingLists;
    private List<OpenResearchObserver> observers;

    public OpenResearchController() {
        readingLists = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(OpenResearchObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OpenResearchObserver observer) {
        observers.remove(observer);
    }

    public void createReadingList() {
        ReadingList readingList = new ReadingList();
        readingLists.add(readingList);
        notifyObservers();
    }

    public void addPaperToReadingList(ReadingList readingList, Paper paper) {
        readingList.addPaper(paper);
    }

    public void removePaperFromReadingList(ReadingList readingList, Paper paper) {
        readingList.removePaper(paper);
    }

    private void notifyObservers() {
        for (OpenResearchObserver observer : observers) {
            observer.updateOpenResearch(readingLists);
        }
    }

    public void displayUserReadingForm() {
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ReadingListForm readingListForm = new ReadingListForm();
                readingListForm.setVisible(true);
            }
        });
    }

    // Other methods for handling user interactions
    // ...
}
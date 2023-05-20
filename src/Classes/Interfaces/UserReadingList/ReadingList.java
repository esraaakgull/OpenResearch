package Classes.Interfaces.UserReadingList;

import Classes.Interfaces.ReadingListObserver;
import Classes.Paper;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingList {

    private List<Paper> papers;
    private List<ReadingListObserver> observers;

    public ReadingList() {
        papers = new ArrayList<>();
        observers = new ArrayList<>();
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
    public void addObserver(ReadingListObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ReadingListObserver observer) {
        observers.remove(observer);
    }

    public void addPaper(Paper paper) {
        papers.add(paper);
        notifyObservers();
    }

    public void removePaper(Paper paper) {
        papers.remove(paper);
        notifyObservers();
    }

    private void notifyObservers() {
        for (ReadingListObserver observer : observers) {
            observer.updateReadingList(this);
        }
    }

    // Getters, setters, other methods
    // ...
}

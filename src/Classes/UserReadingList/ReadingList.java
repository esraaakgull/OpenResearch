package Classes.UserReadingList;

import Classes.Interfaces.ReadingListObserver;
import Classes.Papers.Paper;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ReadingList {

    private List<Classes.Papers.Paper> papers;
    private List<ReadingListObserver> observers;

    public ReadingList() {
        papers = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(ReadingListObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ReadingListObserver observer) {
        observers.remove(observer);
    }

    public void addPaper(Classes.Papers.Paper paper) {
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

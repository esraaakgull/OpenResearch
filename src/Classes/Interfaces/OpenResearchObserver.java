package Classes.Interfaces;

import Classes.UserReadingList.ReadingList;

import java.util.List;

public interface OpenResearchObserver {
    void updateOpenResearch(List<ReadingList> readingLists);
}
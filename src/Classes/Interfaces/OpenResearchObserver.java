package Classes.Interfaces;

import Classes.Interfaces.UserReadingList.ReadingList;

import java.util.List;

public interface OpenResearchObserver {
    void updateOpenResearch(List<ReadingList> readingLists);
}
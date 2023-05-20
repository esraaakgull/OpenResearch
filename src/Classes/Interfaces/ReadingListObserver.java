package Classes.Interfaces;

import Classes.UserReadingList.ReadingList;

public interface ReadingListObserver {
    void updateReadingList(ReadingList readingList);
}
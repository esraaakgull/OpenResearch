package Classes.Interfaces;

import Classes.Interfaces.UserReadingList.ReadingList;

public interface ReadingListObserver {
    void updateReadingList(ReadingList readingList);
}
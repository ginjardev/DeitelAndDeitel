package ourDiary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    List<Entry> entries = new ArrayList<>();

    public void addEntry(String entryBody) {
        Entry entry = new Entry(entryBody);
        entries.add(entry);
        //entries.add(new Entry(entryBody));
    }

    public int getTotalNumberOfEntry() {
        return entries.size();
    }
}

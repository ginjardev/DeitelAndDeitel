package ourDiary;

public class User {
    private final Diary diary;

    public User(String userName, Diary diaryType) {
        diary = diaryType;
    }

    public Diary getDiary() {
        return diary;
    }

    public void createEntry(String entryBody) {

        diary.addEntry(entryBody);
    }
}

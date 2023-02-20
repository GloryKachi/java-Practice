package chibuzosDiary;

import java.util.ArrayList;
import java.util.List;

public class Dairy {
    private boolean isLocked = true;
    private String password;
    private List<Entry> entries;

    public Dairy(String ownersName, String password){
        this.password = password;
        entries = new ArrayList<>();
        //this.happenings = happenings;
    }
    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
//        boolean passwordMatches = password.equals(this.password);
//        if (passwordMatches) = password.equals(this.password);
        if (password.equals(this.password)) isLocked = false;
    }
    public void lock(){
        isLocked = true;
    }

    public void write(String title, String body) {
        int id = numberOfEntries()+1;
        Entry newEntry = new Entry(id,title,body);
        entries.add(newEntry);
        //if (!isLocked) writeIntoDiary(title, body);
    }

    private void writeIntoDiary(String title, String body) {
            int id = numberOfEntries() + 1;
            Entry newEntry = new Entry(id, title, body);
            entries.add(newEntry);
    }

    public int numberOfEntries() {
        return entries.size();

    }


    public Entry findEntryWithId(int id) {
        //for (Entry entry: entries){
        //if (entry.getId() == id) return entry;

        //return null;
        return entries.get(id - 1);

    }
}

package Lesson_8;

import java.util.ArrayList;
import java.util.Date;

public class Meet extends Event {
    ArrayList<String> membersList = new ArrayList<>();          // список участников встречи
    Date meetTime;                                              // время встречи
    String place;                                               // место встречи

    public Meet() {
    }
    public Meet(String name, String description) {
        super ( name, description );
    }

    @Override
    public void create() {
        Meet meet = new Meet();
        super.meetsList.add(meet);

    }

    @Override
    public void erase(Event meet) {
        meetsList.remove(meet);
    }
}

package Lesson_8;

import java.util.ArrayList;

public class Day {

    ArrayList<Event> eventsList = new ArrayList<Event>();        // список событий

    Event event1 = new Event();
    //eventsList.add(0, event1);

    String event12 = event1.name;
    Event event2 = new Meet();

    public Day(){
    }

    public ArrayList<Event> getEventsList() {
        return eventsList;
    }


}

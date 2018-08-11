package Lesson_8;

import java.util.ArrayList;
import java.util.Date;

public class Event implements EventI {      // событие: задача или встреча
    String name;                            // название
    String description;                     // описание
    private int taskOfDay;                  // счетчик созданных объектов задач

    Task[] tasksList = new Task[MAX_DAY_TASKS];                 // массив задач
    ArrayList<Meet> meetsList = new ArrayList<>();              // список встреч
    int duration;                                               // продолжительность в сек
    boolean isPerform = false;                                  // статус исполнения

    // конструкторы
    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Event(){

    }

    public Event(String name, String description , Task task, String category, ArrayList listToDo) { // конструктор задачи
        this.name = name;
        this.description = description;
        task.category = category;
        task.listToDo = listToDo;
    }

    public Event(String name, String description , Meet meet, Date time, String place, ArrayList members) { // конструктор встречи
        this.name = name;
        this.description = description;
        meet.place = place;
        meet.meetTime = time;
        meet.meetsList = members;
    }

    @Override
    public void create() {
        System.out.println ("");

    }

    @Override
    public void erase() {

    }

    @Override
    public void erase(Event event) {
        event = null;

    }
}

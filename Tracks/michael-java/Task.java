package Lesson_8;

import java.util.ArrayList;

// Наследование или полиморфизм от Интерфейса
public class Task extends Event {
    String category;                                        // категория
    ArrayList<String> listToDo = new ArrayList<>();         // список действий




    // конструкторы
    Task(){
        this ();

        //if(count <= 3)
        //count++;
    }

    public Task(String name, String description, String category, ArrayList listToDo) {
        super(name, description);
        this.category = category;
        this.listToDo = listToDo;
    }

    //protected static int getCount() {
    //    return count;
    //}

    @Override
    public void create() {

    }
    // деструктор
    @Override
    public void erase() {
       count--;

    }

    private int counter = 0;
    void createTask(){
        for(int i = 0; i < MAX_DAY_TASKS; i++)
            dayTask[i] = new Task();
    }

    public Task getObject() {
        return counter == MAX_TASK_AMOUNT ? null : dayTask[counter++];
    }
}

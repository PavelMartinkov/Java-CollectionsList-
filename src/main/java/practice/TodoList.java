package practice;

import java.util.ArrayList;

public class TodoList {

    ArrayList<String> deal = new ArrayList<>();

    public void add(String todo) {
        deal.add(todo);
        System.out.println("Добавлено дело " + todo);
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (index >= deal.size()) {
            deal.add(todo);
            System.out.println("Дело с таким номером не существует");
        } else {
            deal.add(index,todo);
            System.out.println("Добавлено дело " + todo);
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (index >= deal.size()) {
            System.out.println("Невозможно заменить дело");
        } else {
            deal.set(index,todo);
            System.out.println("Дело " + deal.get(index) + " заменено на " + todo);
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (index >= deal.size()) {
            System.out.println("Дело с таким номером не существует");
        } else {
            deal.remove(index);
            System.out.println("Дело " + deal.get(index) + " удалено");
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        for (int i = 0; i < deal.size(); i++) {
            System.out.println(i + " - " + deal.get(i));
        }
        // TODO: вернуть список дел
        return deal;
    }

}
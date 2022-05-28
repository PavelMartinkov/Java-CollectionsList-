package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        String ADD = "ADD";
        String EDIT = "EDIT";
        String DELETE = "DELETE";
        String LIST = "LIST";

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

                if (input.isEmpty()) {
                    scanner.close();
                    break;
                } else if (input.contains(ADD)) {
                    todoList.add(input.substring(4));
                } else if (input.contains(EDIT)) {
                    todoList.edit(0,"");
                    continue;
                } else if (input.contains(DELETE)) {
                    todoList.delete(0);
                    continue;
                } else if (input.contains(LIST)) {
                    todoList.getTodos();
                    continue;
                }
            }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}

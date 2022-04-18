package view;

import service.TodoListService;
import service.TodoListServiceImpl;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }


    public void showTodoList() {

        while (true) {
            todoListService.showTodoList();
            System.out.println("Todo List App");
            System.out.println("(1) Tambah todo list");
            System.out.println("(2) Hapus todo list");
            System.out.println("(x) keluar");

            String input = InputUtil.input("Masukkan pilihan");
            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.err.println("Pilihan yang anda masukkan salah!!!\n");
//                    System.out.println();
            }
            System.out.println("");

        }
    }

    public void addTodoList() {
        String input = InputUtil.input("Masukkan TODO LIST ([x] jika batal)");


        if (input.equals("x")) {

        } else {
            todoListService.addTodoList(input);
        }
    }

    public void removeTodoList() {
        System.out.println("MENGHAPUS TODO LIST");
        String input = InputUtil.input("Menghapus TODO LIST ke : ([x] jika batal)");
        if (input.equals("x")) {

        } else {
            todoListService.removeTodoList(Integer.valueOf(input));
        }
    }
}

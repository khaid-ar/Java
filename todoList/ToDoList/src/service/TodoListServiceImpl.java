package service;

import entity.TodoList;
import repository.TodoListRepository;
import util.InputUtil;


public class TodoListServiceImpl implements TodoListService {
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] data = todoListRepository.getAll();

        System.out.println("TODO LIST");
        for (int i = 0; i < data.length; i++) {
            TodoList list = data[i];
            int num = i + 1;
            if (list != null) {
                System.out.println(num + ". " + list.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("SUKSES ADD : " + todo);

    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number);
        if (!success) {

            System.out.println("Gagal menghapus " + number);
        } else {
            System.out.println("Berhasil menghapus " + number);
        }
    }
}

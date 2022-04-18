package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;


public class TodoListServiceTest {


    public static void main(String[] args) {
        removeTodoListTest(5);
        removeTodoListTest(2);
        removeTodoListTest(1);

    }

    public static void showTodoListTest() {
        TodoListRepositoryImpl todoList = new TodoListRepositoryImpl();

        todoList.data[0] = new TodoList("John");
        todoList.data[1] = new TodoList("Doe");

        TodoListService todoListService = new TodoListServiceImpl(todoList);
        todoListService.showTodoList();
    }


    public static void addTodoListTest() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Mc");
        todoListService.addTodoList("John");
        todoListService.addTodoList("Doe");

    }


    public static void removeTodoListTest(Integer number) {

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.addTodoList("Mc");
        todoListService.addTodoList("John");
        todoListService.addTodoList("Doe");

        todoListService.showTodoList();
        todoListService.removeTodoList(number);
        todoListService.showTodoList();
    }
}

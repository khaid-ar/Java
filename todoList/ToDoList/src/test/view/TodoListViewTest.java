package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        showRemoveTodoList();
    }

    public static void showViewTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Mc");
        todoListService.addTodoList("John");
        todoListService.addTodoList("Doe");

        todoListView.showTodoList();

    }

    public static void showAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListView.showTodoList();
        todoListView.addTodoList();
    }public static void showRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);
        todoListService.addTodoList("Mc");
        todoListService.addTodoList("John");
        todoListService.addTodoList("Doe");
        todoListView.showTodoList();
        todoListView.removeTodoList();

    }
}

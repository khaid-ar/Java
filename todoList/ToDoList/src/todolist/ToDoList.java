/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package todolist;


import java.util.Scanner;



/**
 *
 * @author GL
 */
public class ToDoList {

     /**
      * @param args the command line arguments
      */
     public static String[] data = new String[1];
     public static final Scanner scan = new Scanner(System.in);
     public static String input;

     public static void main(String[] args) {
          // TODO code application logic here

          viewShowTodoList();


     }

     public static void showTodoList() {
          for (int i = 0; i < data.length; i++) {
               String list = data[i];
               int num = i + 1;
               if (data[i] != null) {
                    System.out.println(num + ". " + list);
               }
          }

     }

     public static void addTodoList(String todo) {
          boolean isFull = true;
          for (int i = 0; i < data.length; i++) {
               if (data[i] == null) {
                    isFull = false;
                    break;
               }
          }
          if (isFull) {
               String[] temp = data;
               data = new String[data.length * 2];
               for (int i = 0; i < temp.length; i++) {
                    data[i] = temp[i];
               }
          }
          for (int i = 0; i < data.length; i++) {
               if (data[i] == null) {
                    data[i] = todo.toUpperCase();
                    break;
               }
          }

     }

     public static void removeTodoList(int num) {
          int counter = num - 1;
          if (counter >= data.length) {

          } else if (data[counter] == null) {

          } else {
               for (int i = counter; i < data.length; i++) {
                    if (i == data.length - 1) {
                         data[i] = null;
                    } else {
                         data[i] = data[i + 1];
                    }

               }

          }

     }

     public static void viewShowTodoList() {
          while (true) {
               showTodoList();
               System.out.println("Todo List App");
               System.out.println("(1) Tambah todo list");
               System.out.println("(2) Hapus todo list");
               System.out.println("(x) keluar");
               System.out.print("Masukkan pilihan : ");
               input = scan.nextLine();
               if (input.equals("1")) {
                    viewAddTodoList();
               } else if (input.equals("2")) {
                    viewRemoveTodoList();
               } else if (input.equals("x")) {
                    break;
               } else {
                    System.err.println("Pilihan yang anda masukkan salah!!!\n");
//                    System.out.println();
               }
               System.out.println("");

          }

     }

     public static void viewAddTodoList() {
          System.out.print("Masukkan todo list : ");
          input = scan.nextLine();
          addTodoList(input);

     }

     public static void viewRemoveTodoList() {
          System.out.print("Hapus list ke : [(x) Batal] --> ");
          input = scan.nextLine();
          if (input.equals("x")) {
          } else if (Integer.valueOf(input) > data.length) {
               System.err.println("List tidak ditemukan\n");
//               System.out.println();
          } else {
               removeTodoList(Integer.valueOf(input));
          }
     }



}

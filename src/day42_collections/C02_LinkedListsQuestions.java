package day42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListsQuestions {

    /*
    Question : Create two String lists by taking the value from the user. The user must press 0 to stop entering the value.
After creating two lists, prepare an output as follows
list1 : …….
list2 : …….
common elements : …….

     */

    public static void main(String[] args) {

        List<String> nameList1 = new LinkedList<>();
        List<String> nameList2 = new LinkedList<>();

        System.out.println("Let's create list1 first");
        nameList1 = createList();
        System.out.println("Let's create list2 now");
        nameList2 = createList();

        System.out.println("list1 : " + nameList1);
        System.out.println("list2 : " + nameList2);

        nameList1.retainAll(nameList2);
        System.out.println("Common elements : " + nameList1);
    }
    public static List<String> createList() {
        List<String> listToReturn = new LinkedList<>();
        String name = "";
        Scanner scan = new Scanner(System.in);

        while (!name.equals("0")) {
            System.out.println("Please enter a name, and to quit please press 0");
            name = scan.next();
            if (!name.equals("0")) {
                listToReturn.add(name);
            }
        }
        return listToReturn;
    }
}

package day21_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Questions {


    public static void main(String[] args) {


        // take names from user and save them inside of a list

        List<String> nameList = new ArrayList<>();      // Created a list to add names to it
        Scanner scan = new Scanner(System.in);          // to take names from user

        String nameStr="";                              // will save single name

        while (!nameStr.equalsIgnoreCase("q")){     // as long as user does not press q, loop will continue

            System.out.println("please enter a name to add the list, Press q to quit");  // information for the user
            nameStr = scan.nextLine();  // takes the name from user

            if(!nameStr.equalsIgnoreCase("q")) {   //cheks again if the value is q or not
               nameList.add(nameStr);                          // if it is not "q" java will add the name to the list
            }
        }

        System.out.println(nameList);




    }
}

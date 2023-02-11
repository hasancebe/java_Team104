package day43_collectionsDeque;

import java.util.Deque;
import java.util.LinkedList;

public class C02_DequeQuestions {

    public static void main(String[] args) {

        // create a deque and add Y at the begining of all elements

        Deque<String> dequeList= new LinkedList<>();
        dequeList.add("Nutella");
        dequeList.add("Cheese");
        dequeList.add("Speaker");

        Deque<String> tempList = new LinkedList<>();
        String product ="";

        while (true){

            try {
                product= dequeList.remove();
                tempList.add("Y"+product);
            } catch (Exception e) {
                break;
            }

        }
        dequeList=tempList;
        System.out.println(dequeList);






    }

}

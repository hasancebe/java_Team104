package day42_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedListQueue {

    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();
        q1.add("H");
        q1.add("Y"); // [H, Y]
        q1.offer("K");      //[H, Y, K]
        // If there is no restriction we can add elements by using offer method. If there is a restriction we should
        // use offer method to add elements because if we reach the limits offer will warn us and it will not add it

        System.out.println(q1.remove()); // H  [Y, K]
        // remove method does not ask for any index of anything if we are trying to remove an element from a queue

        System.out.println(q1.poll()); //Y   [K]

        q1.clear();  // it clears the list
        System.out.println(q1.poll());  // null

        //q1. poll() does the same thing with remove(). It deletes the element which is at the head and returns it
        // but the difference is :
        // if the list is emtpy poll will return null
        // remove method trows an exception in same situation.

        q1.add("B");
        q1.add("G");
        System.out.println("peek method : "+q1.peek()); // B  // [B, G]

        System.out.println("element method : "+q1.element()); // B  // [B, G]

        // they peek the first element of the queue but  the difference is
        // peek() returns null if  the queue is empty
        // element() throws exception if the queue is empty

        System.out.println(q1); // [Y, K]
    }


}

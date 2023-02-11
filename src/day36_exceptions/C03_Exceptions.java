package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions {

    public static void main(String[] args) {

        String filePath = "src/day36_exceptions/Test1.txt";
        int k=0;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }



        } catch (FileNotFoundException e) {
            System.out.println("Java can not find the file");

        } catch (IOException e){
            System.out.println(" can not read or write");
        }

    }

    /*
     If we are planning to handle more than one exception we can follow 4 ways
     1- more than one catch block in  Try catch blocks
     2- we can create inner thy catch blocks
     3- we can use throw keyword (but we would not be handling them)
     4- we can use a more comprehensive exception to cover every exception ( Exception e is the most comprehensive one)

     But if there is a parent-child relation between exceptions we should be careful about the order of exceptions.
     The child should be written before its parents

     because if we don't, the comprehensive one will catch every exception and the child won't be able to do anything
     */




}

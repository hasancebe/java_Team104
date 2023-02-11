package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C02_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/day36_exceptions/Test.txt");

        FileOutputStream fos = new FileOutputStream("src/day36_exceptions/Test.txt");

        // If we want to reach, read a file in Java
        // we should use FileInputStream class
        // and create an object from it
        //then enter the path of the file

        /*
         when java sees a possibility of an error, it draws a red line under it

         we have 2 ways to use in this kind of situation
         1- We can use try-catch code blocks to handle it
         2- To inform java that we know the possibility of the error but We want it to continue,
         we should add the "throws" keyword after the method signature, then the name of the exceptions
         */



    }
}

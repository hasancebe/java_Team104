package day37_exceptions;

public class C03_ThrowKeywordUsingExceptions {

    public static void main(String[] args) {

        /*
        If we want to give a great warning with red lines of IllegalArgumentException and let him panic a little
        we can use an if-else statement and throw Illegal exception with a lot of red lines
        then print it on the screen


         */

        int number = 1;


        try {

            if ( number<10){
                throw new IllegalArgumentException();
            }


        } catch (IllegalArgumentException e) {
            e.printStackTrace();

        }

    }


}

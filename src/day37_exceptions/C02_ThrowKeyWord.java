package day37_exceptions;

public class C02_ThrowKeyWord {

    public static void main(String[] args) {


        // throws : It is used after the methods, and it is only to inform java, or coder that this method can cause an exception

        // let's say, we want pass a few lines of codes and we can do this by throwing an exception then catching it
        // In this code when the number is two, it passes to line 32, without excecuting all codes between them.


        int number = 1;
        System.out.println(number);

        try {
            number = 2;
            if ( number==2){
                throw new RuntimeException();
            }

            System.out.println(number);
            number = 3;
            System.out.println(number);
            number = 4;
            System.out.println(number);
            number = 5;
            System.out.println(number);
            number = 6;
            System.out.println(number);
        } catch (RuntimeException e) {

            System.out.println("everything is fine");
        }


    }
}

package day40_Interfaces;

public interface I01_Interface {

    // even we do not write public static final before
    //a variable, If it is in interface they become
    //public static final

    // Normaly when we name a variable we start with a lovercase and apply camel case rule
    // BUT if a variable is public static final, we use CAPITAL letters to name them

    int  NUMBER = 20;
    String STR = "Hello world";
    boolean IS_IT_BEAUTIFUL=true;
    int NUMBER_2 =30;


    public static final int number3=25;

    // all methods created in an interface are abstract and public
    void method1(); // we can not add body, so we can see that it is abstract






}

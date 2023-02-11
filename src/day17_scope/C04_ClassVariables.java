package day17_scope;

public class C04_ClassVariables {

    static int number1 = 10;        // class variables (static variable)
    static int number2 =20;
    static int classLevel;
    static String classLevelStrign;
    static char classLevelChar;


    int instanceNumber1 = 30;       // instance variable ( object variable
    int instanceNumber2 = 40;
    // every class level variable has a default value
    // if we do not assign any value, it will get default value

    /*
    for any number >> default value: 0
    for object      > default value: null
     */

    public static void main(String[] args) {

        int a =15;
        System.out.println(classLevel);
        System.out.println(classLevelStrign);

        int localVar;
        System.out.println(classLevelChar);
        //System.out.println(localVar);

        //System.out.println(number1);
        //System.out.println(instanceNumber1);
    }


    public static void method1(){
        //System.out.println(number2);
        //System.out.println(instanceNumber2);

        int a =15;
        int b =25;

    }

    public void method2(){
        //System.out.println(number1);
        //System.out.println(instanceNumber1);

        int c = 35;
    }








}

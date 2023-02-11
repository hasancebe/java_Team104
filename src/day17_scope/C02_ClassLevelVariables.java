package day17_scope;

public class C02_ClassLevelVariables {

    static String hostpitalName = "Star Hospital";
    static int numberOfPatients =34342;
    static int hospitalPhone = 34345455;

    String personelName ;
    int personelAge;
    int personelPhone ;

    public static int method1(){

        int a =22;
        System.out.println(a);
        return a;
    }

    /*

    class level variable's scope is whole class
    we can also reach static variable from every method

    if it is not a static variable, there will be a few limits for it

     */

}

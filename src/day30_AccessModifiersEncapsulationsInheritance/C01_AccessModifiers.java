package day30_AccessModifiersEncapsulationsInheritance;

public class C01_AccessModifiers {

    //If I do not write any access modifier, this means they are default

    // private can only be reached from their own classes

    private static int number =12;
    private static String str ="Ali";

    static int defaultNumber1 =13;     //If I do not write any access modifier, this means they are default
    static String defaultStr ="Alii";

    public static int publicNumber1 =133; // public access modifier can be reached from everywhere
    public static String publictStr ="Aliii";

    protected static int protectedNumber1 =1333; // protected access modifier can be reach from same package and child Classes
    protected static String protectedStr ="Aliiii";




}

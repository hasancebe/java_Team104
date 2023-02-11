package day17_scope;

import java.util.Scanner;

public class C05_UsingObjectVariables {

    public static void main(String[] args) {




        // to use instance variables in a static method we should create a object
        C02_ClassLevelVariables obj1 = new C02_ClassLevelVariables();

       // System.out.println("C02_ClassLevelVariables.method1() = " + C02_ClassLevelVariables.method1());

        System.out.println(C02_ClassLevelVariables.numberOfPatients);


        // with object we can reach instance variables and change them for each object
        obj1.personelName="Ayse";
        obj1.personelAge= 16;
        obj1.personelPhone=123456;


        C02_ClassLevelVariables obj2 =new C02_ClassLevelVariables();

        // we can assing different values for instance veriables from different objects
        obj2.personelName="Fatma";
        obj2.personelAge=23;
        obj2.personelPhone=23423423;

        C02_ClassLevelVariables obj3 = new C02_ClassLevelVariables();

        obj3.personelName ="Mehmet";
        obj3.personelAge = 38;
        obj3.personelPhone=34345345;

        System.out.println("obj1.personelName = " + obj1.personelName);
        System.out.println("obj1.personelAge = " + obj1.personelAge);
        System.out.println("obj1.personelPhone = " + obj1.personelPhone);
        System.out.println("---------------------------------");
        System.out.println("obj2.personelName = " + obj2.personelName);
        System.out.println("obj2.personelAge = " + obj2.personelAge);
        System.out.println("obj2.personelPhone = " + obj2.personelPhone);
        System.out.println("---------------------------------");
        System.out.println("obj3.personelName = " + obj3.personelName);
        System.out.println("obj3.personelAge = " + obj3.personelAge);
        System.out.println("obj3.personelPhone = " + obj3.personelPhone);

    }





}

package day17_scope;

public class C03_ObjectVariables {

    //like nurses, it can be changed for every nurse

    public static void main(String[] args) {

        System.out.println(C02_ClassLevelVariables.hostpitalName);

        System.out.println(C02_ClassLevelVariables.numberOfPatients);// 34342

        C02_ClassLevelVariables.numberOfPatients++;
        C02_ClassLevelVariables.numberOfPatients++;
        //int newValue = C02_ClassLevelVariables.numberOfPatients+5;
        method1();

        System.out.println(C02_ClassLevelVariables.numberOfPatients); //




    }

    public static void method1(){
        C02_ClassLevelVariables.numberOfPatients++;

    }








}

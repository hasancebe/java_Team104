package day30_AccessModifiersEncapsulationsInheritance;

public class GC08_Doctor extends GC07_Accounting {
    public static void main(String[] args) {
        System.out.println(getHospitalName());

        GC08_Doctor dr1 = new GC08_Doctor();

        dr1.name= "Ali";
        dr1.lastName = "Veli";
        System.out.println("normal Salary : "+dr1.salary);
        dr1.salary = 30*8*25;  // assigned a new value to salary for doctors
        System.out.println("doctor salary : "+ dr1.salary);
        dr1.sgkNo = 123345;


        int watchShift =1;
        dr1.overTime = 3*25*3;
        System.out.println(dr1.reported);


    }
}

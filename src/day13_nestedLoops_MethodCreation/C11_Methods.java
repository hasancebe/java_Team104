package day13_nestedLoops_MethodCreation;

public class C11_Methods {

    // get the first letter by using a method

    // mehmet maden >>> Mehmet MADEN

    public static void main(String[] args) {


        System.out.println(getFirstLetter("hasan","veli"));

        System.out.println(getFirstLetter("mehmet", "maden"));

    }


    public static String getFirstLetter(String name, String lastName){

        String firstName = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase(); // Mehmet
        String lastNameP  =lastName.toUpperCase(); //MADEN

        return (firstName+" "+lastNameP);

    }


}

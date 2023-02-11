package day11_stringManipulations;

import java.util.Locale;

public class C06_Questions {

    public static void main(String[] args) {

        //Question 5 : Get the user's first and last name separately.

        //if the name is longer, print the first letters of the name and surname as capitals and the rest should be lowercase

        //  if the surname is longer, print the first letter of the name as capital and the rest of the name should be lowercase.

        // And all of surname letters should be in capitals


        String name = "meHmET";
        String surname = "mAgdEnn";

        if (name.length()>surname.length()){

            System.out.println(name.substring(0,1).toUpperCase(Locale.ROOT)+name.substring(1).toLowerCase()
                    +" "+surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase());


        }if(surname.length()>name.length()){
            System.out.println(name.substring(0,1).toUpperCase(Locale.ROOT)+name.substring(1).toLowerCase()+
                    " "+surname.toUpperCase());

        }





    }
}

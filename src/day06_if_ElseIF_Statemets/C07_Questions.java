package day06_if_ElseIF_Statemets;

public class C07_Questions {

    public static void main(String[] args) {

        // ask for gender and age from the user
        // for male , he can retire after 65
        // for female, she can retire after 60
        // you can retire or you have 23 years of work in front of you


        String gender = "female";   //there are two different conditions here so we need to use || or && operators
        int age = -5;

        if (gender.equals("male") && age>=65&& age>0) {

            System.out.println(" you can retire whenever you want");

        } else if (gender.equals("male")&& age<65 && age>0)  {

            System.out.println("you have "+ (65-age)+" years in front of you");

        } else if ( gender.equals("female") && age>=60 && age>0 ) {

            System.out.println("you can retire");

        } else if (gender.equals("female") && age<60 && age>0) {

            System.out.println("you have "+ (60-age)+" years in front of you");

        } else {
            System.out.println("Please enter the values correctly");


        }


    }

}

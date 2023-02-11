package day15_MethodOverLoading;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {
        
        /*
        
        Question : Ask the user for a password from the user, print the errors in the passwords that do not meet the 
        following conditions,
        
         ask user to enter new password
         Repeat this process until a valid password is typed.
        When a valid password is typed, print “your password has been successfully saved”
conditions :
  - the first character of the password must be lowercase
  - the last character of the password must be a number
         */


        Scanner scan =new Scanner(System.in);
        
        String password="";
        boolean isPasswordCorrect= false;
        int flag = 0;
        
        while (!isPasswordCorrect){
            flag=0;

            System.out.println("Please enter your password");
            password = scan.nextLine();
            
            if (!(password.charAt(0)>='a' && password.charAt(0)<='z')){
                System.out.println("first letter should be a lowercase");
                flag++;
            }
            if(!(password.charAt(password.length()-1)>='0'&& password.charAt(password.length()-1)<='9')) {
                System.out.println("last character should be a number");
                flag++;
            }
            if (flag==0){
                System.out.println("your password has been successfully saved");
                isPasswordCorrect=true;
            }


        }
        
        
    }
}

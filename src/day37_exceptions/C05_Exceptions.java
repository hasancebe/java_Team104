package day37_exceptions;

public class C05_Exceptions {

    public static void main(String[] args) {


        String a=null;

        try{
            a.concat("b");

        }catch (NullPointerException  e){

            a="";
        }finally {
            System.out.println(a.concat("c"));
        }



    }


}

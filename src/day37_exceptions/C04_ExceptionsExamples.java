package day37_exceptions;

public class C04_ExceptionsExamples {

    public static void main(String[] args) {

        String a = null;
        String b = "";


        try{
            try{
                int c = a.length()+b.length();  // nullPointerException
            }catch (NullPointerException e){
                if( b.length()==0){
                    throw new RuntimeException(); // manually RuntimeException
                }
                System.out.println("a null point exception");  // because of the exception, we won't see this text
                                                                // it will jump to catch block
            }

        }catch (RuntimeException obj){
            System.out.println("throw keyword");
        }
    }
}

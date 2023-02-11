package day16_doWhile;

public class C05_DoWhileLoop {

    public static void main(String[] args) {

        //Question 3- Ask the user for a positive number,
        // find out if the number is a perfect square,
        // print false if it is true if it is a perfect square.


//        int input = 4;
//        int startingPoint = 1;
//        boolean isSquare =false;
//
//
//        do{
//            if(startingPoint*startingPoint==input){
//                isSquare=true;
//                break;
//
//            }else {
//                startingPoint++;
//            }
//
//        }while (startingPoint*startingPoint<=input);
//
//        System.out.println(isSquare);
//
        int input = 144;
        boolean isSquare =false;

        for (int i = 1; i <input ; i++) {

            if (i*i==input){
                isSquare=true;
                break;
            }
        }
        System.out.println(isSquare);





    }
}

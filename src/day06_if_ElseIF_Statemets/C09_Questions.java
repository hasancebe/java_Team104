package day06_if_ElseIF_Statemets;

public class C09_Questions {

    public static void main(String[] args) {

        // take price and number of products from the user
        // check if the user has a member card
        // if user has and if number of products are higher than 10; user will receive %20 off ,
                // if number is not higher than 10, user will receive 15% off

        //if user does not have a member card, number is higher than 10, user will receive 15% off,
                //if number is lower than 10, user will receive 10%off



        boolean hasCard = true;
        int numberOfProducts =11 ;
        double price = 100;


        if (hasCard && numberOfProducts>10) {

            price = price - price *20/100;
            System.out.println("price" +price);

        }


    }

}

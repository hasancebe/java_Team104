package day07_nestedIf;

public class C04_NestedIf {

    public static void main(String[] args) {

        //Question 2- Get the number and list price of the product purchased from the user,
        // and ask the user if they have a customer card.
        // If there is a customer card, give a 20% discount if he buys more than 10 products,
        // 15% if he does not have a customer card, if he does not have a customer card,
        // give a 15% discount if he buys more than 10 products,
        // and if he does not have a customer card, give a 10% discount


        int numberOfProducts = 2;
        double price = 10;
        boolean hasCustomerCard = false;
        double totalPrice = 0;

        // ctrl + alt + L

        if (hasCustomerCard == true) {

            if (numberOfProducts > 10) {

                // %20 discount
                totalPrice = price * numberOfProducts * 0.80;
                System.out.println(totalPrice);

            } else if (numberOfProducts <= 10) {

                // %15 discount
                totalPrice = price * numberOfProducts * 0.85;
                System.out.println(totalPrice);


                totalPrice = 100 * 10 * 0.85;


            }


        } else {

            if (numberOfProducts > 10) {

                // %15 discount
                totalPrice = price * numberOfProducts * 0.85;
                System.out.println(totalPrice);

            }
            if (numberOfProducts <= 10) {

                // %10 discount
                totalPrice = price * numberOfProducts * 0.90;
                System.out.println(totalPrice);
            }


        }


    }
}

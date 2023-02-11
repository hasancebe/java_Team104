package Projects.P02_Market;

import java.util.*;

public class MarketProject {


    /* Successful Market shopping program.
*
* Step 1: Create lists containing products and prices.
*
* No Product Price
==== ======= =========
00 Tomatoes 2.10 TL
01 Potatoes 3.20 TL
02 Pepper 1.50 TL
03 Onion 2.30 TL
04 Carrots 3.10 TL
05 Apples 1.20 TL
06 Bananas 1.90 TL
07 Strawberry 6.10 TL
08 Melon 4.30 TL
09 Grapes 2.70 TL
10 Lemons 0.50 TL

* Step 2: Ask the user to select a product from the list according to the product number.
* Step 3: Ask how many kg you want to buy.
* Step 4: Add this product to the cart and print the cart.
* 5. Ask if he wants to buy another product.
* 6. If he wants to continue, direct him to the product selection section again.
* 7. If he wants to finish, check the payment and calculate the change to finish the program. show the bill
*/
    // the product list
    static List<String> productList = new ArrayList<>(Arrays.asList("Tomato", "Potato", "Pepper", "Onion",
            "Carrot", "Apple", "Banana", "Strawberry", "Melon", "Grapes", "Lemon"));

    // the price list , we use index to reach products and prices
    static List<Double> priceList = new ArrayList<>(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.70, 0.5));

    static Scanner scan = new Scanner(System.in);

    //we store code of the product and the kg
    static Map<Integer, Integer> buyList = new TreeMap<>();

    // this is the totalprice
    static double totalAmount = 0;


    public static void main(String[] args) {

        // method
        buyMethod();


    }

    private static void buyMethod() {

        // created variables to use in this method
        int productNumber = 0;
        int kg = 0;
        double amount = 0;

        // Printed the product list
        for (int i = 0; i < priceList.size(); i++) {

            System.out.println("Code : " + i + " " + productList.get(i) + " Price : " + priceList.get(i));
        }

        //taken the product number
        System.out.println("Please enter the product number");
        productNumber = scan.nextInt();  // try catch
        // the kg user wants to buy
        System.out.println("How many KG you wish to buy?");
        kg = scan.nextInt(); // try catch

        //Added product code, and the kg user wants to buy
        buyList.put(productNumber, kg);

        // calculated the price for this product
        amount = kg * priceList.get(productNumber);

        // total price of all products
        totalAmount += amount;

        System.out.println(productList.get(productNumber) + " Kg : " + kg + "kg added to the list : " + amount + " TL");

        // continue method
        doYouWantToContin();
    }

    private static void doYouWantToContin() {
        String cont = "";

        do {
            System.out.println("Do you want to continue Y/N");
            // taken yes/ no answer and made it capital than took the first character
            cont = scan.next().toUpperCase().substring(0, 1);
            if (cont.equalsIgnoreCase("Y")) {

                // if it is yes we called starting method
                buyMethod();


            } else if (cont.equalsIgnoreCase("N")) {

                // to make the payment we called cart() method
                cart();
            }

            // as long as the answer is not Y or N,loop will continue
        } while (!cont.equalsIgnoreCase("Y") && !cont.equalsIgnoreCase("N"));


    }

    private static void cart() {

        System.out.println("Welcome");

        // to use inside of the forEachLoop we created set of the buyList's keys
        Set<Integer> productNumbers = buyList.keySet();

        // inside of this loop, we printed every product user chose with prices and kgs
        for (Integer each : productNumbers
        ) {
            System.out.println(productList.get(each) + " Kg : " + buyList.get(each) + " Price : " + priceList.get(each) * buyList.get(each));
        }

        // showed the total amount to the user
        System.out.println("Total Price is : " + totalAmount);

        // calculating the change
        System.out.println("Please enter the amount you payed");
        Double payment = scan.nextDouble();

        if (payment >= totalAmount) {
            if (payment == totalAmount) {

            } else {
                System.out.println("Here, your cash : " + (payment - totalAmount));
            }

        } else {
            System.out.println("This is not enough");
            cart();
        }
    }
}






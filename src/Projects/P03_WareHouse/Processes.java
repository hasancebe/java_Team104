package Projects.P03_WareHouse;

import java.util.Scanner;
import java.util.Set;

public class Processes {

    static Scanner scan = new Scanner(System.in);

    // connection with the runner class, This method is called from there
    public static void runProgram() {

        // will run main meny
        mainMenu();

    }

    private static void mainMenu() {
        // newProductDescription productLis productEntry putProductToShelf removeProduct
        System.out.println("1) Add a Product\n2) List\n3)Product Entry\n4) Put it somewhere\n5) Remove Product\n6) Quit");
        System.out.println("Please select a menu");
        int swtc = scan.nextInt();

        switch (swtc) {

            // for every case we should create a cycle ( loop) program will run inside of itself
            case 1:
                regesterProduct();
                mainMenu();
                break;

            case 2:
                listProducts();
                mainMenu();
                break;

            case 3:
                productEntry();
                mainMenu();
                break;

            case 4:
                putproductToShelf();
                mainMenu();
                break;

            case 5:
                removeProduct();
                mainMenu();
                break;

            case 6:
                quit();
        }
    }

    private static void quit() {
        System.out.println("Thank you");
        // to prevent unwanted problems
        System.exit(0);
    }

    private static void removeProduct() {

        System.out.println("Please enter the ID of the product");
        int productId = scan.nextInt();

        if (checkIfMapHasThisId(productId)) {
            System.out.println("how much do you want to remove");
            int toRemove = scan.nextInt();

            String valueOfID = Products.productList.get(productId);
            String[] arr = valueOfID.split(", ");

            // checked if we have enough of the product to give
            if (toRemove <= Integer.valueOf(arr[2])) {

                int left = Integer.valueOf(arr[2]) - toRemove;
                arr[2] = "" + left;
            }

            String desiredValue = arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4];
            Products.productList.put(productId, desiredValue);


        }


    }

    private static void putproductToShelf() {

        System.out.println("Please enter the ID of the product");
        int productId = scan.nextInt();

        if (checkIfMapHasThisId(productId)) {
            System.out.println("System found the ID, Please enter the nane of the shelf");
            String shelf = scan.next();
            String valueOfID = Products.productList.get(productId);
            String[] arr = valueOfID.split(", ");
            arr[4] = "" + shelf;

            String desiredValue = arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4];
            Products.productList.put(productId, desiredValue);


        }


    }
    // enters quantity of the products
    private static void productEntry() {

        System.out.println("Please enter the ID of the product");
        int productId = scan.nextInt();

        // checkIfMapHasThisId method will return true if the map has this ID, and system will continue
        if (checkIfMapHasThisId(productId)) {
            System.out.println("System found the ID, Please enter the quantity");
            int qntty = scan.nextInt();

            // We take the value of the key using product ID
            String valueOfID = Products.productList.get(productId);
            // we split the value and assign it to an array
            String[] arr = valueOfID.split(", ");
            // quantity was at index 2 so we modified it
            arr[2] = "" + qntty;

            // created another value  to assign it to the map by using the product ID
            String desiredValue = arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4];
            Products.productList.put(productId, desiredValue);


        }


    }

    // checking if map has the ID, If it has, this method will return true
    private static boolean checkIfMapHasThisId(int productId) {
        boolean doesMapHasThisId = false;

        Set<Integer> productIdKeys = Products.productList.keySet();
        for (Integer each : productIdKeys
        ) {
            if (each == productId) {
                doesMapHasThisId = true;
            }
        }

        return doesMapHasThisId;
    }

    private static void listProducts() {

        System.out.println("ID    Name   Producer   Quantity   Unit   Shelf");

        // list of products, should be upgraded
        System.out.println(Products.getProductList());

    }

    // to regester a new prodcut, Id will be created in ProductClass
    private static void regesterProduct() {
        System.out.println("Please enter the name of the product");
        String productName = scan.next();
        System.out.println("Please enter producer's name");
        String producerName = scan.next();
        System.out.println("Please enter the unit for this product");
        String unit = scan.next();

        // By using the constroctor of Product class, we have added our map element
        Products product = new Products(productName, producerName, unit);


    }
}

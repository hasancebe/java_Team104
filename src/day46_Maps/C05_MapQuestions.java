package day46_Maps;

import java.util.*;

public class C05_MapQuestions {

    public static void main(String[] args) {

        // create a market application
        // use maps as stock controller

        Map<String,List<Integer>> stockControlMap = new HashMap<>();

        List<Integer> toyCar1075 = new ArrayList<>();
        toyCar1075.add(12); // price
        toyCar1075.add(2); // stock

        stockControlMap.put("toyCar1075",toyCar1075);

        List<Integer> toyTruck1011 = new ArrayList<>();
        toyTruck1011.add(20);// price
        toyTruck1011.add(4);// stock

        stockControlMap.put("toyTruck1011",toyTruck1011);
        System.out.println(stockControlMap);

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the product"); //
        String product= scan.next();
        System.out.println("How Many?");
        int numberOfProduct = scan.nextInt();
        List<Integer> stockCheckAndPrice;

        if (stockControlMap.containsKey(product)){
            System.out.println("StockList has this product");

            stockCheckAndPrice=stockControlMap.get(product);
            if (numberOfProduct>stockCheckAndPrice.get(1)){
                System.out.println("we dont have that many");
            }else {
                int stockLeft =stockCheckAndPrice.get(1)-numberOfProduct;
                stockControlMap.get(product).set(1,stockLeft);

                int price = stockCheckAndPrice.get(0)*numberOfProduct;
                System.out.println("total price is : "+price);
            }
        }
        System.out.println(stockControlMap);














    }
}

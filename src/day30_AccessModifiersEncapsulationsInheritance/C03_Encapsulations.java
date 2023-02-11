package day30_AccessModifiersEncapsulationsInheritance;

public class C03_Encapsulations {

    private static String hospitalName = "Star Hospital";
    private static int price ;

    // everybody should be able to see (getter) hospital name. But they should not be able to change (setter) it

    public static String getHospitalName() {
        return hospitalName;
    }


    // Personel will be able to change the value of price by using setter method. But there is no getter method
    // so they won't be able to see it
    public static void setPrice(int price) {
        C03_Encapsulations.price = price;
    }
}

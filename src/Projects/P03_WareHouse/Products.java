package Projects.P03_WareHouse;

import java.util.HashMap;
import java.util.Map;

public class Products {

    // encapsulation
    /*
    1) private variables
    2) constructors
    3) getter setter methods
    4) toString Method
     */

    //1-) First of all, the product should be defined here. id productName manufacturer quantity unit and shelf (6 fields available)


    // ID and String value of products are stored in this map
    public static Map<Integer,String> productList = new HashMap<>();



    // Values of products
    private static int Id =1000;
    private String productname ;
    private String manufacturer;
    private int quantity;
    private String unit ;
    private String shelf;


    // When we create another constructer, we should create a copy of default constructor
    public Products() {  // copy of default constructor
    }

    // this constructor only stores three variables, for others we set default values
    public Products(String productname, String manufacturer, String unit) {

        // for every product system will increase the ID by one, and it will be unique for every product
        Id++;
        this.productname = productname;
        this.manufacturer = manufacturer;
        this.unit = unit;


        productList.put(Id,productname+", "+manufacturer+", "+"0"+", "+unit+", "+"not assigned yet");

    }


    public Products(String productname, String manufacturer, int quantity, String unit, String shelf) {

        // for every product system will increase the ID by one, and it will be unique for every product
        Id++;
        this.productname = productname;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.unit = unit;
        this.shelf = shelf;

        productList.put(Id,productname+", "+manufacturer+", "+quantity+", "+unit+", "+shelf);
    }

    public static Map<Integer, String> getProductList() {
        return productList;
    }

    public static void setProductList(Map<Integer, String> productList) {
        Products.productList = productList;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "Products{" +
                "Id=" + Id +
                ", productname='" + productname + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", quantity=" + quantity +
                ", unit='" + unit + '\'' +
                ", shelf='" + shelf + '\'' +
                '}';
    }
}

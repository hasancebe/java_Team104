package Projects;

public class P03_StorageProgram {
    //newProductDescription productLis productEntry putProductToShelf removeProduct

    /*
     * a simple warehouse project
     *
     * It is a warehouse application, which is a system implemented in a working factory.
     *
     * 1-) First of all, the product should be defined here. id productName manufacturer quantity unit and shelf (6 fields available)
     *
     * 2-) We will create methods.
     * newProductDescription ==> The name, manufacturer and unit of the product will be entered. id will be created.
     *
     * productList ==> defined products will be listed. If the product quantity and shelf number are not defined, the default value will appear.
     *
     * productEntry ==> we will enter a product with the id number (quantity will be defined here)
     *
     * putProductToShelf ==> we will choose the product from the list and put the product on the shelf according to the id number.
     *
     * removeProduct ==> we will select the product from the list and we will check out the product. Only quantity changes will be made from the product list here.
     * The number of products cannot be less than 0. When 0, the product description should not be deleted. just let the amount be 0.
     * ===> all the changes we have made will also appear in the list.
     *
     *
         id      name    manufacturer       quantity    unit            shelf
     *------------------------------------------------ --------------------------
     *  1000    flour    Hekimoglu              0        bags            null
     *
     * productEntry ==> id:1000 product entry :5
     * productList ==>
     *
     * id   name    manufacturer    quantity    unit    shelf
     *------------------------------------------------ --------------
     * 1000 flour   hekimolgu       5         bag     null
     *
     * putproductToShelf ==> id:1000 shelf : shelf1
     * productList ==>
     *
     * id   name    manufacturer    quantity    unit    shelf
     *------------------------------------------------ --------------
     * 1000 flour   hekimolgu       5           bag     shelf1
     *
     * removeProduct ==> id 1000: removeProduct : 3 (remaining 2 sacks of flour)
     * productList ==>
     *
     * id   name    manufacturer    quantity    unit    shelf
     *------------------------------------------------ --------------
     * 1000 flour   hekimolgu       2           bag     shelf1
     *
     *
     */




}

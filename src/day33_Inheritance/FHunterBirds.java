package day33_Inheritance;

public class FHunterBirds extends EBirds {

    void move( ){
        System.out.println("they fly");
    }
    void nutrition( ){
        System.out.println("eats meat");
    }
    void claw( ) {
        System.out.println("clawed");
    }
    void beak( ){
        System.out.println(" pointed beak");
    }

    public static void main(String[] args) {

        /*
        When we create an object if data type and constructer are from different classes
        at first we should visit the data type's class and if we can not find the method
        we are looking for we should check the parents. If java can not find it even in
        parents' classes, this will cause a CTE.

        If Java finds the method somewhere, before using the method we should check
        children's classes if there is an updated method there, java will use that method

         */


        FHunterBirds eagle1 = new FHunterBirds();

        eagle1.nutrition(); //Hunter Birds
        eagle1.beak(); // Hunter Birds
        eagle1.claw(); // Hunter Birds
        eagle1.move(); // HunterBirds
        eagle1.multiply(); // Birds
        eagle1.wing(); // Birds
        eagle1.life(); // AnimalKingdom
        eagle1.respiration(); // Birds

        EBirds eagle2 = new FHunterBirds();
        eagle2.nutrition(); //Hunter Birds
        eagle2.beak(); // Hunter Birds
        //eagle2.claw(); // CTE
        eagle2.move(); // HunterBirds
        eagle2.multiply(); // Birds
        eagle2.wing(); // Birds
        eagle2.life(); // AnimalKingdom
        eagle2.respiration(); // Birds


        DAnimalsKingdom eagle3= new FHunterBirds();
        // If java can not find the method in data type class, It won't check children
        eagle3.nutrition(); //Hunter Birds
        //eagle3.beak(); // CTE
        //eagle3.claw(); // CTE
        eagle3.move(); // HunterBirds
        eagle3.multiply(); // Birds
       // eagle3.wing(); // CTE
        eagle3.life(); // AnimalKingdom
        eagle3.respiration(); // Birds

        EBirds eagle4 = new EBirds();
        eagle4.nutrition(); //DAnimal Kindom
        eagle4.beak(); // Hunter Birds
        //eagle4.claw(); // CTE
        eagle4.move(); // AnimalKingdom
        eagle4.multiply(); // Birds
        eagle4.wing(); // Birds
        eagle4.life(); // AnimalKingdom
        eagle4.respiration(); // Birds


        DAnimalsKingdom eagle5 = new EBirds();
        eagle5.nutrition(); //AnimalKingdom
        //eagle5.beak(); // CTE
        //eagle5.claw(); // CTE
        eagle5.move(); // AnimalKingdom
        eagle5.multiply(); // Birds
        //eagle5.wing(); // CTE
        eagle5.life(); // AnimalKingdom
        eagle5.respiration(); // Birds

        DAnimalsKingdom eagle6 = new DAnimalsKingdom();
        eagle6.nutrition(); //Animal Kingdom
        //eagle6.beak(); // CTE
        //eagle6.claw(); // CTE
        eagle6.move(); // AnimalKingdom
        eagle6.multiply(); // AnimalKingdom
        //eagle6.wing(); // CTE
        eagle6.life(); // AnimalKingdom
        eagle6.respiration(); // AnimalKingdom





    }

}

package day32_inheritance;

public class DCamry extends BToyota{

    DCamry (String str){
        super("Sea");
        System.out.println("DCamry const with parameter");
    }

    DCamry (){

    }

    public static void main(String[] args) {

        DCamry car2 = new DCamry("sky");

    }


}

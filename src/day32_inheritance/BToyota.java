package day32_inheritance;

public class BToyota extends ACar{

    BToyota (){
        System.out.println("BToyota cons without parameter");
    }

    BToyota(int a){
        System.out.println("BToyota cons with parameter");
    }

    BToyota(String saswerwer){
        super("land");
        System.out.println("BToyota with String par");
    }
}

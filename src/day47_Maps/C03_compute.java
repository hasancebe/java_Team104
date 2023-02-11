package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C03_compute {

    public static void main(String[] args) {
        Map<String,Integer> mp1 = new HashMap<>();

        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);

        // If there is "C" Key in the map, increase the value by 3
        if (mp1.containsKey("C")){

            mp1.put("C",mp1.get("C")+3);
        }
        System.out.println(mp1); //{A=5, B=3, C=10}

        // solving same question with compute method

        mp1.computeIfPresent("C",(k,v) -> v+3); //{A=5, B=3, C=13}
        System.out.println(mp1);

        // If there is "B" key in the map, multyply the value by 3;
        mp1.computeIfPresent("B",(k,v) -> v*3 );  //
        System.out.println(mp1); // {A=5, B=9, C=13}

        // If there is "A" key in the map, -3

        mp1.computeIfPresent("A", (k,v) -> v-5  );
        System.out.println(mp1); // {A=0, B=9, C=13}





        // If map does not have "D" key, add an entry with value 11 (D=11)
        if (!mp1.containsKey("D")){
            mp1.put("D",11);
        }
        System.out.println(mp1); // {A=5, B=3, C=10, D=11}

        // solve same question with compute method using lamda

        mp1.computeIfAbsent("E", v -> 12);  // it is a little different from compute method itself
        System.out.println(mp1); // {A=0, B=9, C=13, D=11, E=12}

        // increase value of E by 4
        mp1.compute("E",(k,v) -> v+4);
        System.out.println(mp1); // A=0, B=9, C=13, D=11, E=16}

        // you can create map elements ( entries ) by using compute method
        mp1.compute("V",(k,v) ->  v=13);  // to add a key- value element to the map
        System.out.println(mp1); // {A=0, B=9, C=13, D=11, E=16, V=13}


        mp1.compute("R",(k,v) -> v+4); // NullPointerException
        System.out.println(mp1);






    }








}

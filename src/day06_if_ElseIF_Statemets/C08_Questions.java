package day06_if_ElseIF_Statemets;

public class C08_Questions {


    public static void main(String[] args) {


        // let's ask kg and cm of the user
        // and calculate the body index
        //kilo*15000/(cm*cm)   if it is bigger than 30 fatter,  if it is 25-30 fat , 20-25 normal, smaller than 20 thin.


        int kg = 53;
        int cm = 155;

        int bodyIndex = (kg*10000)/(cm*cm);
        System.out.println(bodyIndex);

        if (bodyIndex>30) {

            System.out.println("You should be carefull and take care of yourself");

        } else if (bodyIndex>25 && bodyIndex<=30) {

            System.out.println("things are looking good but still there are a few things you need to do");

        } else if (bodyIndex>20 && bodyIndex<=25) {

            System.out.println("perfect actually");

        } else if (bodyIndex<=20) {

            System.out.println(" lets go to a restaurant");

        }


    }
}

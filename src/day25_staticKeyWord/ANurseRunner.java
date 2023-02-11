package day25_staticKeyWord;

public class ANurseRunner {

    public static void main(String[] args) {

        ANurse nurs1 = new ANurse();

        System.out.println(nurs1);
        nurs1.nurseName="Ayse";
        nurs1.nurseAddress="Cankaya";
        nurs1.nursePhone="232435445";
        System.out.println("------------");
        System.out.println(nurs1);

        ANurse nurs2 = new ANurse();
        nurs2.nurseName= "Fatma";
        nurs2.nurseAddress="ulus";
        nurs2.nursePhone ="23423423234";
        nurs2.headPhysi="Dr. Yasar";

        System.out.println("------------");
        System.out.println(nurs1);

        ANurse nurs3= new ANurse();
        System.out.println(nurs3);
        nurs3.hospitalName = "Java Hospital";

        System.out.println("what is the name of the hospital :"+ nurs1.hospitalName);


    }

}

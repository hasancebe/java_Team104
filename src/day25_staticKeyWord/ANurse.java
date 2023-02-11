package day25_staticKeyWord;

public class ANurse {

    static String hospitalName = "StarHospital"; // belongs to class, because it is static (Class Var)
    static String hospitalAddress = "Cankaya/Ankara";
    static String headPhysi= "Dr. Ayse";

    String nurseName ="not assigned";
    String nurseAddress ="not assigned";
    String nursePhone ="not assigned";

    public String toString() {
        return "ANurse" +
                "nurseName='" + nurseName + '\'' +
                ", nurseAddress='" + nurseAddress + '\'' +
                ", nursePhone='" + nursePhone + '\'' +
                ",\n hospitalName='" + hospitalName + '\'' +
                ", hospitalAddress='" + hospitalAddress + '\'' +
                ", headPhysician='" + headPhysi + '\''
                ;
    }
}

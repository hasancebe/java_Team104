package day38_Abstraction;

public class EChildClassOfAbstractClass extends DParentAbstractClass{
    @Override
    public void mandatoryMethod() {
        System.out.println("car should have a motor");
    }

    @Override
    public void mandatoryMethod2() {
        System.out.println("car should have tires");
    }

    @Override
    public void mandatoryMethod3() {

    }

    // Every abstract method in parent classes should be overridden by the child


}

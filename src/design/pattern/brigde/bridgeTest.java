package design.pattern.brigde;

public class bridgeTest {
    public static void main(String[] args) {
        Implementor  implementor=new ObjectImplementor();
        AbstractImplementor  abstractImplementor=new RefinedAbstraction(implementor);
        abstractImplementor.Operation();
    }

}

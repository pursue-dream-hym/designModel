package design.pattern.brigde;

public class RefinedAbstraction  extends AbstractImplementor {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    @Override
    public void Operation() {
        System.out.println("抽象化角色被访问了！");
        implementor.objectImpl();
    }
}

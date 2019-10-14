package design.pattern.brigde;

public abstract class AbstractImplementor {
    protected   Implementor  implementor;

    public AbstractImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract   void  Operation();

}

package design.pattern.brigde;

public class ObjectImplementor  implements Implementor {
    @Override
    public void objectImpl() {
        System.out.println("我是实现类");
    }
}

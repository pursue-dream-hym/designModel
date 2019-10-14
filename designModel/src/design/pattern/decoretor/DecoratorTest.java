package design.pattern.decoretor;

public class DecoratorTest {
    public static void main(String[] args) {
        Morrigan morrigan=new Original();
        morrigan.display();
        Morrigan morrigan2=new SuccubusDecorator(morrigan);
        morrigan2.display();
        Morrigan morrigan3=new GirlDecorator(morrigan);
        morrigan3.display();
    }


}

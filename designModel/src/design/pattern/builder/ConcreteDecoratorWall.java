package design.pattern.builder;

public class ConcreteDecoratorWall  extends Buiders {

    @Override
    public void buildWall() {
       parlour.setWall("我是修墙的");
    }

    @Override
    public void buildTV() {
      parlour.setTV("我是做电视的");
    }

    @Override
    public void buildSofa() {
     parlour.setSofa("我是做沙发的");
    }

}

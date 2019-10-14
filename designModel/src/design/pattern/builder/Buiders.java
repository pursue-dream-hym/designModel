package design.pattern.builder;

public abstract class Buiders {
  //创建产品对象
protected Parlour  parlour=new Parlour();
  //生产墙
  public  abstract void buildWall();
  //生产电视的
  public  abstract void buildTV();
  public  abstract void buildSofa();
  //返回产品对象
    public   Parlour getResult(){
        return parlour;
    }

}

package design.pattern.command;

public class HeFen  implements  Breakfast {
    private   HeFenChef  heFenChef;
    HeFen(){
        heFenChef=new HeFenChef();
    }
    @Override
    public void cooking() {
        heFenChef.cooking();
    }
}

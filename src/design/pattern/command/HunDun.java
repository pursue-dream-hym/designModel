package design.pattern.command;

public class HunDun  implements  Breakfast {
    private HunTunChef  hunTunChef;
    HunDun(){
        hunTunChef=new HunTunChef();
    }
    @Override
    public void cooking() {
         hunTunChef.cooking();
    }
}

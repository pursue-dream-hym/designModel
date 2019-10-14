package design.pattern.singleton;

public class HungrySingleton {

    private static final HungrySingleton  hungrySingleton=new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton  getInstence(){
        return hungrySingleton;
    }

}

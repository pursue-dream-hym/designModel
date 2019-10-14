package design.pattern.singleton;

import design.pattern.singleton.LazySingleton;

public class SingletonTest {

    public static void main(String[] args) {
        LazySingleton  lazySingleton1=LazySingleton.getinstence();
        LazySingleton  lazySingleton2=LazySingleton.getinstence();
       if(lazySingleton1==lazySingleton2){
           System.out.println("我们是一个人");
       }
    }
}
